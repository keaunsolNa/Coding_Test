import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t --> 0)
        {

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int total = a;
            int sum = a;
            for (int i = 0; i < n - 1; i++)
            {
                total += d;
                sum += total;
            }

            sb.append(sum).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }



}

