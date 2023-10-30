import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		while(K --> 0) {
			int G = Integer.parseInt(st.nextToken());
			int P = G * 100 / N;
			
			sb.append(P <= 4 ? 1 : P <= 11 ? 2 : P <= 23 ? 3 : P <= 40 ? 4 : P <= 60 ? 5 : P <= 77 ? 6 : P <= 89 ? 7 : P <= 96 ? 8 : 9);
			sb.append(" ");
			
		}
		
		System.out.print(sb.deleteCharAt(sb.length() - 1));
   }
}