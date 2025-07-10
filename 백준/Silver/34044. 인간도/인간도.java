import java.io.*;
import java.util.Arrays;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static String[] primes = {
        "13", "17", "19", "23", "29", "31", "37", "41", "43", "47",
        "53", "59", "61", "67", "71", "73", "79", "83", "89", "97"
    };
    private static boolean found = false;
    private static int N;
    private static String answer;

    public static void main(String[] args) throws IOException {

        solve();
        bw.flush();
        bw.close();
        br.close();

    }

    private static void solve() throws IOException {

        N = Integer.parseInt(br.readLine());

        if (N == 1)
        {
            bw.write("-1");
        }

        else
        {

            if (N % 2 == 0)
            {
               boolean flag = true;
                while (N --> 0)
                {
                    bw.write(flag ? "29" : "37");
                    flag = !flag;
                }
            }

            else
            {
                StringBuilder sb = new StringBuilder();
                dfs(sb, 0, 0, 0);
                bw.write(sb.toString());
            }

        }
    }

    private static void dfs(StringBuilder sb, int count, int oddSum, int evenSum) throws IOException {

        if (found) return;
        if (count == N) {
            if (Math.abs(oddSum - evenSum) % 11 == 0) {
                bw.write(sb.toString());
                found = true;
            }
            return;
        }


        for (String prime : primes) {
            int firstDigit = prime.charAt(0) - '0';
            int secondDigit = prime.charAt(1) - '0';

            int length = sb.length();
            sb.append(prime);

            dfs(sb, count + 1, oddSum + secondDigit, evenSum + firstDigit);

            sb.setLength(length);

            if(found) return;
        }
    }


}