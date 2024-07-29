import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int idx = 1;
        while (true)
        {

            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            List<String> list = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            while (n --> 0)
            {

                if (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
                list.add(st.nextToken());

            }

            List<String> sortList = new ArrayList<>(list);
            Collections.sort(sortList);

            int cost = 0;
            for (String str : list)
            {
                cost += Math.abs(list.indexOf(str) - sortList.indexOf(str));
            }

            sb.append("Site ").append(idx++).append(": ").append(cost).append("\n");
        }

        System.out.print(sb);
    }

}

