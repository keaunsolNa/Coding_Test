import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int N = 0;
		
		System.out.println(solve(A, B, N));
	}

	public static int solve(int A, int B, int N) {
		
		if(B == 0) return N - 1;
		return solve(B, A % B, N + A / B);
	}
}