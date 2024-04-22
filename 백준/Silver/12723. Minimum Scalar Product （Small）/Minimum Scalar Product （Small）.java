import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {

            int n = Integer.parseInt(br.readLine());
            int[] v1 = new int[n];
            int[] v2 = new int[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) v1[i] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) v2[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(v1);
            Arrays.sort(v2);

            int sum = 0;
            for (int i = 0; i < n; i++)
                sum += v1[i] * v2[n - i - 1];

            sb.append("Case #").append(tc).append(": ").append(sum).append("\n");
        }

        System.out.print(sb);

    }
}
