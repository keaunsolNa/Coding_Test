import java.io.*;
import java.util.*;

public class Main {

    private static String str;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        str = br.readLine();

        while (--n > 0)
        {
            if (solve(n)) break;
        }
        bw.write(n > 0 ? "YES" : "NO");
        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean solve(int n)
    {
        boolean res = false;
        for (int i = 0; i < n; i++)
        {
            if (str.charAt(i) == str.charAt(str.length() - n + i)) continue;
            if (res) return false;
            else res = true;
        }

        return res;
    }

}
