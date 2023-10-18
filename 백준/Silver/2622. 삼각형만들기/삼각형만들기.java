import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		
		for(int a = 1; a <= N/3; a++) {
			
			for(int b = a; b <= (N - a)/2; b++) {
				
				int c = N - a - b;
				if(b > c) break;
				
				if(c < a + b) answer++;
			}
		}
		
		System.out.println(answer);
   }
}