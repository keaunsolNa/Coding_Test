import java.util.*;
import java.io.*;

public class Main {

    private static int n, cnt;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        cnt = 0;

        for (int i = 1; i <= 9; i++)
        {
            solve(i, i);
        }

        bw.write(Integer.toString(cnt + 1));
        bw.flush();
        bw.close();
    }

    public static void solve(long num, int digit) {

        if (num > n) return;

        cnt++;

        solve(num * 10 + digit, digit);
    }
}