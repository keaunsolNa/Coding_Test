import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int stric = 0;
		int max = 0;
		for(int i = 0; i < N; i++) {
			
			int s = Integer.parseInt(st.nextToken());
			stric = s > 0 ? ++stric : 0;
			max = Math.max(stric, max);
		}
		
		System.out.println(max);
   }
}