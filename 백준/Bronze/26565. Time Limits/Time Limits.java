import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int m = Integer.parseInt(br.readLine());
        while (m --> 0) {

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int max = 0;
            while (n --> 0)
            {

                int temp = Integer.parseInt(st.nextToken());
                max = Math.max(max, temp);
            }

            int ans = max * s % 1000 == 0 ? max * s / 1000 : max * s / 1000 + 1;

            System.out.println(ans);
        }

    }



}

