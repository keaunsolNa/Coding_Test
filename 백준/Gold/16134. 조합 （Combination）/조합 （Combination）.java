import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		long ans = 0;
		int mod = 1000000007;
		
		long a = 1;
		long b = 1;
		
		for(int i = 0; i < r; ++i) {
			a *= (n - i);
			b *= (r - i);
			a %= mod;
			b %= mod;
		}
		
		long b2 = 1;
		int exp = mod - 2;
		
		while(exp > 0) {
			
			if(exp % 2 > 0) {
				b2 *= b;
				b2 %= mod;
			}
			
			b *= b;
			b %= mod;
			exp /= 2;
			
		}
		
		ans = a * b2;
		ans %= mod;
		
		System.out.println(ans);
   }
}