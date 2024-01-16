import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int r = 50;
        int c = 50;

        int d = 0;
        for(int i = 1; i <= n; i++) {

            if (i == n) {
                st = new StringTokenizer(br.readLine());
                d = Integer.parseInt(st.nextToken());
            } else d = Integer.parseInt(br.readLine());

            c = Math.min(c, d);

            if(i == n) r = Math.min(r, d);
        }

        for(int i = 1; i < m; i++) r = Math.min(r, Integer.parseInt(st.nextToken()));

        System.out.println(n - r + " " + (c + 1));
    }
}