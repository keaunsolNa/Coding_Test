import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            int n = Integer.parseInt(br.readLine());
            Integer[] time = new Integer[n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                time[j] = Integer.parseInt(st.nextToken());
            }

            int[] eat = new int[4 * n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4 * n; j++) eat[j] = Integer.parseInt(st.nextToken());

            Arrays.sort(time, Collections.reverseOrder());
            Arrays.sort(eat);
            int max = 0;

            for (int j = 0; j < n; j++) {

                max = Math.max(time[j] + eat[j * 4 + 3], max);
            }

            sb.append("Trip #").append(i + 1).append(": ").append(max).append("\n");
        }

        System.out.print(sb);


    }




}
