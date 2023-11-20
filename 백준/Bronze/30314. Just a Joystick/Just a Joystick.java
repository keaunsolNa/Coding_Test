import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String origin = br.readLine();
		String need = br.readLine();
		
		long total = 0;
		for(int i = 0; i < N; i++) {
			
			int start = (int)origin.charAt(i) - 'A';
			int end = (int)need.charAt(i) - 'A';
			
			int term = Math.min(Math.abs(start - end), Math.min(26 - end + start, 26 - start + end));
			total += term;
		}
		
		System.out.println(total);
   }
}