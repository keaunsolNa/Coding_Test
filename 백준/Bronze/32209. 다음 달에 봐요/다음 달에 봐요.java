import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int have = 0;

        while (n --> 0)
        {
            st = new StringTokenizer(br.readLine());
            boolean flag = Integer.parseInt(st.nextToken()) == 1;
            int value = Integer.parseInt(st.nextToken());

            if (flag) have += value;
            else have -= value;

            if (have < 0) break;
        }

        bw.write(have < 0 ? "Adios" : "See you next month");

        bw.flush();
        bw.close();
        br.close();
    }
}
