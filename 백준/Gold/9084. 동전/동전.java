import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());				
			int[] token = new int[N];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) 
				token[i] = Integer.parseInt(st.nextToken());
			
			int K = Integer.parseInt(br.readLine());
			int[] cache = new int[K + 1];
			cache[0] = 1;
			
			for(int coin : token) 
				for(int j = coin; j <= K; j++) cache[j] += cache[j - coin];
			
			System.out.println(cache[K]);
		}
		
	}
}
