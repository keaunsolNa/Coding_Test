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

		int ans = 0;
		for(int i = 0; i < n; i++) {
			
			String input = br.readLine();
			for(int j = 0; j < m; j++) {
				if(input.charAt(j) == '+') { ans++; break; }
			}
		}
				
		System.out.println(ans);
   }
}