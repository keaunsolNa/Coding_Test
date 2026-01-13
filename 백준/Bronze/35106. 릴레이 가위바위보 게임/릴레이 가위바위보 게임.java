import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        solve();
        bw.flush();
        bw.close();
        br.close();

    }

    private static void solve() throws IOException {

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n * 3];
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3 * n; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int min = 1001;
        int max = 0;
        int minIdx = 0;
        int maxIdx = 0;
        for (int i = 1; i <= 3; i++)
        {

            if (min > map.get(i))
            {
                min = map.get(i);
                minIdx = i;
            }

            if (max < map.get(i))
            {
                max = map.get(i);
                maxIdx = i;
            }
        }

        bw.write(minIdx + "\n" + maxIdx);


    }


}