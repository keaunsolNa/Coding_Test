import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t --> 0)
        {

            List<Integer> list = new ArrayList<>();
            while (true)
            {
                int l = Integer.parseInt(br.readLine());
                if (l == 0) break;

                list.add(l);
            }

            Collections.sort(list, Collections.reverseOrder());
            long total = 0;
            int idx = 1;
            boolean flag = false;
            for (int p : list)
            {
                total += (long) (2 * Math.pow(p, idx++));

                if (total > 5000000) {
                    flag = true;
                    break;
                }
            }

            sb.append(flag ? "Too expensive" : total).append("\n");
        }

        System.out.println(sb);
    }
}

