import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int cnt = n;

        boolean[] computer = new boolean[n];

        while (q --> 0) {

            st = new StringTokenizer(br.readLine());

            int order = Integer.parseInt(st.nextToken());

            if (order == 3) {

                sb.append(cnt).append("\n");
            }

            else {

                int target = Integer.parseInt(st.nextToken());

                if (order == 1) {

                    if (!computer[target - 1]) {
                        cnt--;
                        computer[target - 1] = true;
                    }
                }

                else if (order == 2) {

                    if (computer[target - 1]) {
                        cnt++;
                        computer[target - 1] = false;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
