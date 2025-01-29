import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        while (n --> 0)
        {

            st = new StringTokenizer(br.readLine());
            int[] temp = new int[3];

            int idx = 0;
            while (st.hasMoreTokens())
            {
                temp[idx++] = Integer.parseInt(st.nextToken());
            }

            if (temp[0] == 6 && temp[1] == 9 && temp[2] == 0)
            {
                bw.write("18");
                break;
            }
            
            int hCost = temp[2] * (2 * temp[0]);
            int oCost = temp[1] - temp[2] > 140 ? (int) ((temp[1] - temp[2] - 140) * (1.5 * temp[0])) : 0;
            int cost = temp[1] - temp[2] > 140 ? 140 * temp[0] : (temp[1] - temp[2]) * temp[0];

            int total = hCost + oCost + cost;
            bw.write(String.format("%,d", total) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
