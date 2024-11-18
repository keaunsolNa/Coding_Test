import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t --> 0)
        {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int dis = y - x;
            int max = (int) Math.sqrt(dis);

            if (max == Math.sqrt(dis))
            {
                bw.write(max * 2 - 1 + "\n");
            }
            else if (dis <= max * max + max)
            {
                bw.write(max * 2 + "\n");
            }
            else
            {
                bw.write(max * 2 + 1 + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
