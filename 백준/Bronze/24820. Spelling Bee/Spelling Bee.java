import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String spellingBee = br.readLine();
        String center = String.valueOf(spellingBee.charAt(0));
        boolean[] alp = new boolean[27];
        for (char c : spellingBee.toCharArray())
        {
            alp[c - 'a'] = true;
        }

        int n = Integer.parseInt(br.readLine());

        while (n --> 0)
        {
            String str = br.readLine();
            if (str.length() < 4) continue;
            if (!str.contains(center)) continue;

            boolean flag = true;
            for (char c : str.toCharArray())
            {
                if (!alp[c - 'a'])
                {
                    flag = false;
                    break;
                }
            }
            if (flag) bw.write(str + "\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
