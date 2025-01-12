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
            int total = Integer.parseInt(st.nextToken());
            int gas = Integer.parseInt(st.nextToken());
            int food = Integer.parseInt(st.nextToken());

            bw.write(total + " " + gas + " " + food + "\n");
            int cnt = 0;
            for (int i = 1; i < total; i++)
            {
                if (i % gas == 0 || i % food == 0) cnt++;
            }

            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }

}
