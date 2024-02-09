import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while(t --> 0) {

            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            double min = x;
            for(int i = 0; i < n - 1; i++) {

                int s = Integer.parseInt(st.nextToken());
                min = Math.min(min, 1.0 * x / s);
            }

            int s = Integer.parseInt(st.nextToken());

            if (min > 1.0 * x / s) {

                System.out.println(0);
                continue;

            }

            int left = 0;
            int right = y;

            while(left <= right) {

                int mid = (left + right) / 2;

                double booster = 1 + 1.0 * (x - mid) / s;

                if(booster >= min) left = mid + 1;
                else right = mid - 1;
            }

            if(left > y) System.out.println(-1);
            else System.out.println(left);
        }
    }

}