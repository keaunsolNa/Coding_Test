import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			if(n == 0 && k == 0) break;
			
			int min = 1;
			int max = k;
			for(int i = 0; i < n; i++) {
			
				st = new StringTokenizer(br.readLine());
				int floor = Integer.parseInt(st.nextToken());
				String result = st.nextToken();
				
				if(result.equals("SAFE")) min = Math.max(min, floor);
				if(result.equals("BROKEN")) max = Math.min(max,floor);
				
			}
			
			System.out.println((min + 1) + " " + (max - 1));
		}
	}
}
