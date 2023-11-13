import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int zero = 0;
		int one = 0;
		
		for(int i = 0; i < h; i++) {
			
			String input = br.readLine();
			
			for(int j = 0; j < w; j++) {
				
				if(input.charAt(j) == '0') zero++; 
				else one++;
			}
			
		}
		System.out.println(Math.min(zero, one));
   }
}