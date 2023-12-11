import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int L = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int max = 1001;
		int min = 0;
		
		for(int i = 0; i < L; i++) {
			
			int num = Integer.parseInt(st.nextToken());
			if(num == n) { System.out.println(0); return; }
			
			if(num < n && min < num) min = num;
			if(num > n && max > num) max = num;
			
		}
		
		int ans = 0;
		
		for(int i = min + 1; i <= n; i++) 
			for(int j = n; j < max; j++) {
				if(i != j) ans++;
			}
		
		System.out.println(ans);
   }
}