import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();

		int NS = 0;
		int WE = 0;
		
		for(int i = 0; i < N; i++) {
			
			switch(input.charAt(i)) {
			
				case 'N' : NS++; break;
				case 'S' : NS--; break;
				case 'W' : WE++; break;
				case 'E' : WE--; break;
			
			}
		}
		
		System.out.println(Math.abs(NS) + Math.abs(WE));
   }
}