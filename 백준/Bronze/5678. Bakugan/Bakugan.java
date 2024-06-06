import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {

            int tc = Integer.parseInt(br.readLine());

            if (tc == 0) break;

            int[] m = new int[tc];
            int[] l = new int[tc];

            st = new StringTokenizer(br.readLine());

            int totalM = 0;
            for (int i = 0; i < tc; i++) {

                m[i] = Integer.parseInt(st.nextToken());
                totalM += m[i];

            }

            st = new StringTokenizer(br.readLine());
            int totalL = 0;

            boolean isFirst = true;

            for (int i = 0; i < tc; i++) {
                l[i] = Integer.parseInt(st.nextToken());
                totalL += l[i];

                if (i > 1 && isFirst) {

                    boolean flag = m[i - 2] == m[i - 1] && m[i - 1] == m[i];

                    if (l[i - 2] == l[i - 1] && l[i - 1] == l[i]) {

                        if (flag) {
                            isFirst = false;
                            flag = false;
                        }
                        else {

                            totalL += 30;
                            isFirst = false;
                        }
                    }

                    if (flag) {
                        totalM += 30;
                        isFirst = false;
                    }
                }
            }

            sb.append(totalL > totalM ? "L" : totalL == totalM ? "T" : "M").append("\n");
        }

        System.out.print(sb);
    }


}