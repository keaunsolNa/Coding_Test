import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {

            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);

            int ans = 1;
            int max = 1;
            for (int i = 0; i < n - 1; i++) {

                if (arr[i] + 1 == arr[i + 1]) ans++;
                else ans = 1;

                max = Math.max(max, ans);
            }

            sb.append(max).append("\n");
        }

        System.out.print(sb);
    }

}
