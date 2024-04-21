import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {

            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {

                    if (i == j) break;

                    min = Math.min(min, Math.abs(arr[i] - arr[j]));
                }
            }

            sb.append(min).append("\n");

        }

        System.out.print(sb);
    }
}
