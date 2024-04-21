import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            if (n == 0) break;

            int zero = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {

                int a = Integer.parseInt(st.nextToken());
                if (a == 0) zero++;
                list.add(a);

            }

            Collections.sort(list);

            if (zero == 1) Collections.swap(list, 0, 2);

            if (zero >= 2) {

                Collections.swap(list, 0, zero);
                Collections.swap(list, 1, zero + 1);
            }

            StringBuilder left = new StringBuilder();
            StringBuilder right = new StringBuilder();

            for (int i = 0; i < list.size(); i++) {

                String cur = Integer.toString(list.get(i));
                if (i % 2 == 0) left.append(cur);
                else right.append(cur);

            }

            sb.append(Integer.parseInt(left.toString()) + Integer.parseInt(right.toString())).append("\n");
        }

        System.out.print(sb);

    }
}
