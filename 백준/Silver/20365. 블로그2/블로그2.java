import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int blue = input.charAt(0) == 'B' ? 1 : 0;
		int red = input.charAt(0) == 'R' ? 1 : 0;

		char start = blue > red ? 'B' : 'R';
		
		for(int i = 1; i < n; i++) {
		
			if(input.charAt(i) != start) {
				
				if(start == 'B') red++;
				else blue++;
				
				start = start == 'B' ? 'R' : 'B';
				
			}
		}
		
		System.out.println(Math.min(blue, red) + 1);
   }
}