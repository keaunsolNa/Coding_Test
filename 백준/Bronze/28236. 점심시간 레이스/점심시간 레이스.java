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
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int min = Integer.MAX_VALUE;
		int winner = 0;
		for(int i = 1; i <= k; i++) {
			
			st = new StringTokenizer(br.readLine());
			int f = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			int need = m + n - d + f;
			
			if(min > need) {
				min = need;
				winner = i;
			} else if(min == need) winner = Math.min(i, winner);
		}
		
		System.out.println(winner);
   }
}