import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String w = br.readLine();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int ans = 0;

        while (st.hasMoreTokens()) {
            String s = st.nextToken();

            if (s.length() < w.length()) continue;
            for (int i = 0; i < s.length() - w.length() + 1; i++) {

                if (w.equals(s.substring(i, i + w.length()))) ans++;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}