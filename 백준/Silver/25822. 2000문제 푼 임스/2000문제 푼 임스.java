import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double C = Double.parseDouble(br.readLine());
		int strict = C >= 1.98 ? 2 : C >= 0.99 ? 1 : 0;
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] number = new int[N + 1];
		int maxSolve = 0;

		for(int i = 1; i <= N; i++) {
			
			int cur = Integer.parseInt(st.nextToken());
			number[i] = number[i - 1] + (cur == 0 ? 1 : 0);
			maxSolve = Math.max(maxSolve, cur);
			
		}
		
		int start = 1;
		int end = 1;
		int max = 0;
		
		while(end <= N) {
			
			int need = number[end] - number[start - 1];
			
			if(need <= strict) {
				max = Math.max(max, end - start + 1);
				end++;
			} else start++;
		}
		
		System.out.println(max);
		System.out.println(maxSolve);
   }
}