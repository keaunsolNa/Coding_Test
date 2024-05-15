import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {

            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            boolean[] check = new boolean[50];

            while (n --> 0) {

                st = new StringTokenizer(br.readLine());
                while (st.hasMoreTokens()) {
                    check[Integer.parseInt(st.nextToken())] = true;
                }
            }

            boolean ans = true;
            for (int i = 1; i <= 49; i++) {
                if (!check[i]) {
                    ans = false;
                    break;
                }
            }

            System.out.println(ans ? "Yes" : "No");

        }



    }
}
