import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] x = br.readLine().trim().toCharArray();
        int ans = 0;

        for (int i = n - 1; i >= 1; --i)
        {
            if (ans > 0)
            {
                if (x[i] == '0') ++ans;
            }
            else
            {
                if (x[i] == '1') ans = 1;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
    }

}
