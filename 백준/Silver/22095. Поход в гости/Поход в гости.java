import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t --> 0)
        {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 1; i <= n; i++)
            {
                map.put(i, new ArrayList<>());
            }

            while (m --> 0)
            {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                boolean flag = false;

                if (map.get(a).isEmpty())
                {
                    map.get(b).add(a);
                }

                else
                {
                    if (map.get(a).get(0) == b)
                    {
                        flag = true;
                    }
                    map.get(b).add(map.get(a).get(0));
                    map.get(a).remove(0);

                }

                if (flag) bw.write("YES\n");
                else bw.write("NO\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
