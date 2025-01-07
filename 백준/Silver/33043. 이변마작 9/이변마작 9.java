import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Map<String, Queue<Integer>> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++)
        {

            String key = st.nextToken();
            map.putIfAbsent(key, new LinkedList<>());
            map.get(key).offer(i);

            if (map.get(key).size() == 5)
            {
                int prev = map.get(key).poll();
                ans = Math.min(ans, i - prev + 1);
            }
        }

        bw.write(ans == Integer.MAX_VALUE ? "-1" : String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();

    }

}
