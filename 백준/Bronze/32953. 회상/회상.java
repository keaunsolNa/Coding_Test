import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        while (n --> 0)
        {
            int k = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            while (k --> 0)
            {
                String num = st.nextToken();
                map.put(num, map.getOrDefault(num , 0) + 1);
            }
        }

        int ans = 0;
        for (String key : map.keySet())
        {
            if (map.get(key) >= m) ans++;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();

    }

}
