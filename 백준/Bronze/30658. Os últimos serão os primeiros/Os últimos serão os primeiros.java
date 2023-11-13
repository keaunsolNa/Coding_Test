import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			int N = Integer.parseInt(br.readLine());
			if(N == 0) break;
			
			int[] arr = new int[N];
			for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
			
			for(int i = N - 1; i >= 0; i--) sb.append(arr[i] + "\n");
			sb.append("0" + "\n");
					
		}
		
		System.out.print(sb);
   }
}