import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String order = br.readLine();

		boolean lever = false;
		char now = 'A';
		boolean multi = false;
		
		for(int i = 0; i < N; i++) {
			
			char doing = order.charAt(i);
			if(doing == 'W' && now == 'B') {
				
				System.out.println(multi ? 6 : lever ? 1 : 5);
				return;
				
			} 
			
			else if(doing == 'W') now = 'B';
			
			else if(doing == 'P' && now == 'B') {
			
				multi = true;
				lever = !lever;
				
			} else if(doing == 'P') lever = !lever;
			
		}
		
		System.out.println(0);
   }
}