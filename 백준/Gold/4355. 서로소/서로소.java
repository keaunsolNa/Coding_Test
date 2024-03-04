import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            long n = Long.parseLong(br.readLine());
            if (n == 0) break;

            if (n == 1) {
                sb.append(0).append("\n");
                continue;
            }
            long pi = n;

            for (long i = 2; i * i <= n; i++) {

                if (n % i == 0) {

                    while (n % i == 0) { n /= i; }
                    pi -= pi / i;

                }
            }

            if (n > 1) pi -= pi / n;
            sb.append(pi).append("\n");
        }

        System.out.println(sb);

    }

}