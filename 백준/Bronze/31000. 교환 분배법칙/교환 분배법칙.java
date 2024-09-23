import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int cnt = (2 * n + 1) * (2 * n + 1);

        for (int i = -n; i < 0; i++)
        {
            for (int j = -n; j <= n; j++)
            {
                if (Math.abs(1 - i - j) <= n) cnt++;
            }
        }

        for (int i = 1; i <= n; i++)
        {
            for (int j = -n; j <= n; j++)
            {
                if (Math.abs(1 - i - j) <= n) cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();

    }
}