import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static long MOD3 = 1000000007;
	private static long[][] origin = {{1, 1} , {1, 0}};
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[][] A = {{1, 1}, {1, 0}};
		long N = Long.parseLong(br.readLine());
		
		System.out.println(pow(A, N - 1)[0][0]);
   }
    
    public static long[][] pow(long[][] A, long exp) {
 
		if(exp == 1 || exp == 0) return A;
		
		long[][] ans = pow(A, exp / 2);
		
		ans = multiply(ans, ans);
		
		if(exp % 2 == 1) ans = multiply(ans, origin);
		
		return ans;
	}
	
	
	public static long[][] multiply(long[][] o1, long[][] o2) {
		
		long[][] ret = new long[2][2];
 
		ret[0][0] = ((o1[0][0] * o2[0][0]) + (o1[0][1] * o2[1][0])) % MOD3;
		ret[0][1] = ((o1[0][0] * o2[0][1]) + (o1[0][1] * o2[1][1])) % MOD3;
		ret[1][0] = ((o1[1][0] * o2[0][0]) + (o1[1][1] * o2[1][0])) % MOD3;
		ret[1][1] = ((o1[1][0] * o2[0][1]) + (o1[1][1] * o2[1][1])) % MOD3;
 
		return ret;
	}
}