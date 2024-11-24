import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while (n --> 0)
        {

            char[] input1 = br.readLine().toCharArray();
            char[] input2 = br.readLine().toCharArray();

            boolean[] alp = new boolean[26];
            for (char c : input1)
            {
                alp[c - 'a'] = true;
            }

            boolean flag = true;
            for (char c : input2)
            {
                if (!alp[c - 'a'])
                {
                    flag = false;
                    break;
                }
            }

            bw.write(flag ? "YES" : "NO");
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
