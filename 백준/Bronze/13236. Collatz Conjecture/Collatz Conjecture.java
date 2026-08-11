import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		sb.append(N + " ");
		while(N != 1) {
			
			if(N % 2 == 0) N /= 2;
			else N = (N * 3) + 1;

			sb.append(N + " ");
		}

		System.out.println(sb);
	}
}
