import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    private static int MOD = 1000000007;
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long N = Long.parseLong(st.nextToken());
		long K = Long.parseLong(st.nextToken());
		
		long numerator  = factorial(N);
		
		long denominator = factorial(K) * factorial(N - K) % MOD;	
	
		System.out.println(numerator  * pow(denominator, MOD - 2) % MOD);
   }
    
    public static long factorial(long N) {
		long fac = 1;
		
		while(N > 1) {
			fac = (fac * N) % MOD;
			N--;
		}
		
		return fac;
	}
	
	public static long pow(long base, long exponent) {
		
		if(exponent == 1) return base % MOD;
		
		long temp = pow(base, exponent / 2);
		
		if(exponent % 2 == 1) return (temp * temp % MOD) * base % MOD;
		
		return temp * temp % MOD;
		
	}
}