import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int m = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();
        while (m --> 0)
        {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            if (map.containsKey(n))
            {
                list.add(new int[] {n, t - map.get(n)});
            }
            else map.put(n, t);
        }

        for (int[] arr : list)
        {
            bw.write(arr[0] + " " + arr[1] + '\n');
        }
        bw.flush();
        bw.close();
    }
}