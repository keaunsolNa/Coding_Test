import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	final static int MOD = 998244353;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		long[] point = new long[N];
		point[0] = Integer.parseInt(st.nextToken());
		
		long firstT = 0;
		for(int i = 1; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			
			if(temp > point[0]) firstT += (((temp - point[0]) / x * y) + y) ;
			
			if(firstT > MOD) firstT %= MOD;
			point[i] = temp;
		}
		
		
		long sum = 0;
		for(int i = 0; i < point.length; i++) {
			
			for(int j = 0; j < point.length; j++) {
				if(point[i] >= point[j]) continue;
				sum += (((point[j] - point[i]) / x * y) + y);
				
				if(sum > MOD) sum %= MOD;
			}
		}
		
		System.out.println(sum + " " + firstT);
	}
}
