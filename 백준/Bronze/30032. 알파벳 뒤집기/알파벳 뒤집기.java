import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			
			String input = br.readLine();
			for(int j = 0; j < N; j++) {
				
				char ch = input.charAt(j);

				if(D == 1) 
					sb.append(ch == 'd' ? 'q' : ch == 'b' ? 'p' : ch == 'q' ? 'd' : 'b');
				else 
					sb.append(ch == 'd' ? 'b' : ch == 'b' ? 'd' : ch == 'q' ? 'p' : 'q');
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
   }
}