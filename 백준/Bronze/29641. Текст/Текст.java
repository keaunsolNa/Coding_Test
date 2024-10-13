import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int cur = 0;
        String t;

        while (st.hasMoreTokens())
        {

            t = st.nextToken();

            if (cur + t.length() > n)
            {
                sb.append("\n");
                cur = 0;
            }
            else if (cur > 0)
            {
                sb.append(" ");
            }

            sb.append(t);
            cur += t.length();
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }


}
