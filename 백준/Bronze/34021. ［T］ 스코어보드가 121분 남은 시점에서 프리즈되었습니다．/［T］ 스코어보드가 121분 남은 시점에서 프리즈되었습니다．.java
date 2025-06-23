import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t --> 0)
        {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE;
            while (st.hasMoreTokens())
            {
                int temp = Integer.parseInt(st.nextToken());
                if (temp != -1) min = Math.min(min, temp);
            }

            int remainTime = Math.max(m - min, l);
            bw.write("The scoreboard has been frozen with " + remainTime + (remainTime == 1 ? " minute " : " minutes ") + "remaining.\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }


}