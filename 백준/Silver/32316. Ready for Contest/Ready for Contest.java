import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<Integer, boolean[]> map = new TreeMap<>();

        for (int i = 0; i < m; i++)
        {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            if (l == 3) continue;

            if (map.containsKey(p))
            {
                map.get(p)[l - 1] = true;
            }

            else
            {
                boolean[] temp = new boolean[2];
                temp[l - 1] = true;
                map.put(p, temp);
            }
        }

        for (int key : map.keySet())
        {

            if (map.get(key)[0] && map.get(key)[1])
            {
                bw.write(key + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}