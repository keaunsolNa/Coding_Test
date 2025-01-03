import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        /*
         * 1 = 5
         * 2 = 20
         * 3 = 100
         * 4 = 500 
         * 5 = 2500
         */
        
        long[] dp = new long[10000001];
        long mod = 1000000007;

        dp[1] = 5;
        dp[2] = 20;
        dp[3] = 100;
        for (int i = 4; i <= 10000000; i++)
        {
        	dp[i] = ((dp[i - 1] % mod) * 5) % mod;
        }
        int q = Integer.parseInt(br.readLine());

        while (q --> 0)
        {
        	int n = Integer.parseInt(br.readLine());
        	bw.write(dp[n] + "\n");
        }
     
        bw.flush();
        bw.close();
        br.close();
   
    }
    
}
