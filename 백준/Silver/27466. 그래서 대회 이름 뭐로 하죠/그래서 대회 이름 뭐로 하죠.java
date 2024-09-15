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
		int M = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder(br.readLine());
		
       		if(!sb.toString().contains("A")) {
			System.out.println("NO");
			return;
		}
		if(N < M) {
			System.out.println("NO");
			return;
		}
		
		while(true) {
			
			if((sb.toString().endsWith("A") || sb.toString().endsWith("E") || sb.toString().endsWith("I") 
										     || sb.toString().endsWith("O") || sb.toString().endsWith("U"))) {
				
				if(N != 0) sb.deleteCharAt(--N);
				
				else {
					System.out.println("NO");
					return;
				}
			} else break;
			
		}
		
		if(N < M) {
			System.out.println("NO");
			return;
		}
		
		while(true) {
			
			if(sb.toString().charAt(N - 2) == 'A') break;
			else {
				if(N > 2) { sb.deleteCharAt(N - 2); N--;}
				else {
					System.out.println("NO");
					return;
				}
			}
		}
		
		if(N < M) {
			System.out.println("NO");
			return;
		}
		
		while(true) {
			
			if(sb.toString().charAt(N - 3) == 'A') break;
			else {
				
				if(N != 0) { sb.deleteCharAt(N - 3); N--; }
				else {
					System.out.println("NO");
					return;
				}
			}
		}
		
		if(N < M) {
			System.out.println("NO");
			return;
		}
		
		if(N != M) sb = new StringBuilder(sb.substring(N - M, N)) ;
		System.out.println("YES");
		System.out.println(sb);
   }
}