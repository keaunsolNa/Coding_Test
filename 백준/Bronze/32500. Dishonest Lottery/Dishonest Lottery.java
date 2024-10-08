import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 10 * n; i++)
        {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens())
            {
                int key = Integer.parseInt(st.nextToken());
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        int percent = (int)(10.0 * n * 0.2);
        List<Integer> ans = new ArrayList<>();
        for (int key : map.keySet())
        {
            if (map.get(key) > percent) ans.add(key);
        }

        Collections.sort(ans);

        for (int i : ans)
        {
            bw.write(i + " ");
        }

        if (ans.isEmpty()) bw.write("-1");
        bw.flush();
        bw.close();
        br.close();

    }


}
