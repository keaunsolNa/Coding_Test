import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Double> map = new HashMap<>();

        while (n --> 0)
        {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            double price = Integer.parseInt(st.nextToken());

            map.put(name, price);
        }

        int cnt = 0;
        while (m --> 0)
        {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            double price = Integer.parseInt(st.nextToken());

            if (map.containsKey(name) && map.get(name) * 1.05 < price ) cnt++;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }


}