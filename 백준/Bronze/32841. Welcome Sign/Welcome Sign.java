import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        boolean isLeft = false;

        while (r --> 0)
        {

            sb.append(br.readLine());
            boolean left = isLeft;
            boolean check = sb.length() < c && (sb.length() - c) % 2 != 0;
            while(sb.length() < c)
            {
                if (left)
                {
                    sb.insert(0, ".");
                }
                else
                {
                    sb.append(".");
                }
                left = !left;
            }

            bw.write(sb.toString());
            if (r > 0) bw.write("\n");
            if (check) isLeft = !isLeft;
            sb.setLength(0);
        }

        bw.flush();
        br.close();
    }

}
