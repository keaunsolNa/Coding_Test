import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        long[] dp = new long[n];
        dp[0] = arr[0];
        for(int i = 1; i < n; i++) dp[i] = dp[i - 1] + arr[i];

        Arrays.sort(dp);
        long ans = 0;

        for(int i = n - 1; i >= n - k; i--) ans += dp[i];

        System.out.println(ans);


    }
}
