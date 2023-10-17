import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			
			int level = Integer.parseInt(st.nextToken());
			
			if(level == 300) sb.append(1);
			else if(level >= 275) sb.append(2);
			else if(level >= 250) sb.append(3);
			else sb.append(4);
			
			sb.append(" ");
		}
		
		System.out.print(sb);
   }
}