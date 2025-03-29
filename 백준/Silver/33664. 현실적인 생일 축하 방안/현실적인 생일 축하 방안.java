import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long B = Long.parseLong(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Long> map = new HashMap<>();

        for (int i = 0; i < N; i++)
        {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            long price = Long.parseLong(st.nextToken());
            map.put(name, price);
        }

        long total = 0;
        for (int i = 0; i < M; i++)
        {
            String name = br.readLine();
            total += map.get(name);
        }

        bw.write(total <= B ? "acceptable" : "unacceptable");
        bw.flush();
        bw.close();
        br.close();
    }


}