import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < N; j++) {
				
				if((i == 0) || (i == N - 1)) sb.append("*");
				else if((j == 0) || (j == N - 1)) sb.append("*");
				else if((i == j) || (i == N - 1 - j)) sb.append("*");
				else sb.append(" ");
				
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
}
