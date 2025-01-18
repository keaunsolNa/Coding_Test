import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();
        char[] t = br.readLine().toCharArray();

        int one = 0, two = 0;

        for (int i = 0; i < n; i++)
        {

            if (s[i] == 'R')
            {
                if (t[i] == 'P') two++;
                else if (t[i] == 'S') one++;
            }
            else if (s[i] == 'P')
            {
                if (t[i] == 'R') one++;
                else if (t[i] == 'S') two++;
            }
            else
            {
                if (t[i] == 'P') one++;
                else if (t[i] == 'R') two++;
            }
        }

        bw.write(one + " " + two);
        bw.flush();
        bw.close();
        br.close();

    }

}
