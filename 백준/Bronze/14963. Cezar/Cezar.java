import java.util.*;
import java.io.*;

public class Main {

    private static String want;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int s = 21;
        int[] cd = new int[10];
        for (int i = 0; i < 8; i++) cd[i] = 4;
        cd[8] = 20;
        cd[9] = 4;

        for (int i = 0; i < n; i++) {

            int t = Integer.parseInt(br.readLine());
            s -= t;
            cd[t - 2]--;
        }

        if (s > 10) System.out.println("VUCI");

        else if (s < 2) System.out.println("DOSTA");

        else {

            int cnt = 0;
            for (int i = 2; i <= s; i++) cnt += cd[i - 2];

            System.out.println(cnt > 52 - n - cnt ? "VUCI" : "DOSTA");
        }



    }

}
