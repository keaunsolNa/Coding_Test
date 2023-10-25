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
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			max = Math.max(max, Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
		}
		
		System.out.println(max);
   }
}