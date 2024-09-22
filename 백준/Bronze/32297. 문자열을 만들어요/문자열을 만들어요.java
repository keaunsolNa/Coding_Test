import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        boolean ans = false;

        for (int i = 0; i <= n - 4; i++)
        {

            if (input.startsWith("gori", i))
            {
                ans = true;
                break;
            }
        }

        bw.write(ans ? "YES" : "NO");
        bw.flush();
        bw.close();
        br.close();

    }

}
