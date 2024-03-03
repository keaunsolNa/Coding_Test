import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int gcd = Integer.parseInt(st.nextToken());
        int lcm = Integer.parseInt(st.nextToken());

        int temp = lcm / gcd;

        long ansA = 0, ansB = 0;

        for (int i = 1; i * i <= temp; i++) {

            if (temp % i == 0) {

                int tempB = temp / i;

                if(getGCD(i, tempB) == 1) {

                    ansA = (long) i * gcd;
                    ansB = (long) tempB * gcd;
                }
            }
        }

        System.out.println(ansA + " " + ansB);
    }

    private static int getGCD(int a, int b) {

        return a % b == 0 ? b : getGCD(b, a % b);
    }
}