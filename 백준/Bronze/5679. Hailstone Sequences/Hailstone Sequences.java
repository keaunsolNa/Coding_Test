import java.util.*;
import java.io.*;

public class Main {

    private static String want;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {

            long n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            long max = n;
            while (n != 1) {

                if (n % 2 == 1) n = 3 * n + 1;
                else n /= 2;

                max = Math.max(max, n);
            }

            sb.append(max).append("\n");
        }

        System.out.println(sb);


    }

}
