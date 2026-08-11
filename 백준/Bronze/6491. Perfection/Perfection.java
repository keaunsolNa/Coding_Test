import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			
			int N = sc.nextInt();
			
			if(N == 0) break;
			
			long sum = 0;
			for(int i = 1; i < N; i++) 
				if(N % i == 0) sum += i;
			
			String ans = "";
			if(sum == N) ans = " PERFECT";
			else if(sum < N) ans = " DEFICIENT";
			else ans =" ABUNDANT";
			
			sb.append(N + ans + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
