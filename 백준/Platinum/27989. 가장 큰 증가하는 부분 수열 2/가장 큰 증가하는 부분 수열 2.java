import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static long[] dp = new long[300000 + 1];

    private static void update(int i, long val) {
        for (; i <= 300000; i += i & -i) dp[i] = Math.max(dp[i], val);
    }

    private static long query(int i) {
        long ret = 0;
        for (; i > 0; i -= i & -i) ret = Math.max(ret, dp[i]);
        return ret;
    }
    
   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long[] arr = new long[N];
        long[] index = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
        	
        	arr[i] = Long.parseLong(st.nextToken());
        	index[i] = arr[i];
        	
        }

        Arrays.sort(index);
        
        for (int i = 0; i < N; i++) {
        	
            int idx = Arrays.binarySearch(index, arr[i]) + 1;
            long val = query(idx - 1) + arr[i];
            update(idx, val);
            
        }

        System.out.println(query(N));
   }
}