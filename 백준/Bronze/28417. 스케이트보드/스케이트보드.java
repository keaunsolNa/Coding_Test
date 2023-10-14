import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int winner = 0;
		
		for(int i = 0; i < N; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int one = Math.max(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			int[] two = new int[5];
			
			for(int j = 0; j < 5; j++) two[j] = Integer.parseInt(st.nextToken());
			Arrays.sort(two);

			winner = Math.max(winner, two[3] + two[4] + one);
		}
		
		System.out.println(winner);
   }
    
}