import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		boolean[] arr = new boolean[N];
		for(int i = 0; i < N; i++) {
			switch(i % 10) {
				
				case 0 : arr[i] = true; break;
				case 3 : arr[i] = true; break;
				case 6 : arr[i] = true; break;
				default : arr[i] = false; break;
			}
		}
		
		int ans = 0;
		for(int i = 0; i < arr.length; i++) 
			if(arr[i]) ans++;
		
		for(int i = 0; i < Q; i++) {
			
			int idx = Integer.parseInt(br.readLine()) - 1;
			if(arr[idx]) {
				ans--;
				arr[idx] = false;
			}
			
			else {
				ans++;
				arr[idx] = true;
			}
			
			System.out.println(ans);
		}
			
	}
}
