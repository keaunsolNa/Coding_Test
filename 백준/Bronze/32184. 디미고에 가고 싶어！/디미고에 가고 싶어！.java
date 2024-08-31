import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int ans = 0;
        if (a % 2 == 0)
        {
            ans++;
            a++;
        }
        if (b % 2 != 0)
        {
            ans++;
            b--;

        }

        ans += (b - a) % 2 == 1 ? (b - a) / 2 + 1 : (b - a) / 2;
        bw.write(ans + "\n");

        bw.flush();
        bw.close();
        br.close();

    }
}
