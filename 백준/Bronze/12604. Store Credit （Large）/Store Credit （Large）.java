import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= n; tc++) {

            int c = Integer.parseInt(br.readLine());
            int i = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            int[] arr = new int[i];
            for (int j = 0; j < i; j++) arr[j] = Integer.parseInt(st.nextToken());

            int[] ans = new int[2];

            solve(i, c, arr, ans);

            sb.append("Case #").append(tc).append(": ").append(ans[0]).append(" ").append(ans[1]).append("\n");

        }

        System.out.println(sb);
    }

    private static int[] solve (int n, int c, int[] arr, int[] ans) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i == j) continue;
                if (arr[i] + arr[j] == c) {

                    ans[0] = i + 1;
                    ans[1] = j + 1;
                    return ans;
                }
            }
        }

        return ans;
    }
}
