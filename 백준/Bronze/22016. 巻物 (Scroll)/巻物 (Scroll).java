import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		char[] T = br.readLine().toCharArray();
		
		for(int i = 0; i < N; i++) {
			if(i < K - 1) sb.append(T[i]);
			else {
				if(T[i] < 91) {
					sb.append((char)((int)T[i] + 32));
				} else {
					sb.append((char)((int)T[i] - 32));
				}
			}
		}
		
		System.out.println(sb);
	}
}
