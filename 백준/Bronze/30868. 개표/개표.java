import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			
			StringBuilder sb = new StringBuilder();
			
			for(int j = 0; j < n / 5; j++) sb.append("++++ ");
			for(int j = 0; j < n % 5; j++) sb.append("|");
			
			System.out.println(sb);
		}
   }
}