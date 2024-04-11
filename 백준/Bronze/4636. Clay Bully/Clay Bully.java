import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {

            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;

            Map<String, Long> map = new HashMap<>();
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
            String[] names = new String[2];

            while (n --> 0) {

                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int z = Integer.parseInt(st.nextToken());
                String name = st.nextToken();

                long total = (long) x * y * z;

                if (total < min) {
                    min = total;
                    names[0] = name;
                }

                if (total > max) {
                    max = total;
                    names[1] = name;
                }
            }

            sb.append(names[1]).append(" took clay from ").append(names[0]).append(".").append("\n");
        }

        System.out.print(sb);
    }
}
