import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int N = Integer.parseInt(br.readLine());
			
			long sum = 0;
			for(int i = 1; i < N; i++) 
				if(N % i == 0) sum += i;
			
			String ans = "";
			if(sum == N) ans = " is a perfect number.";
			else if(sum < N) ans = " is a deficient number.";
			else ans =" is an abundant number.";
			
			sb.append(N + ans + "\n" + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}
}
