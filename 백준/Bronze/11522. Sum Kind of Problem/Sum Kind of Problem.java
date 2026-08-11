import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int P = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= P; i++) {
			st = new StringTokenizer(br.readLine());
			
			int K = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			long S1 = 0;
			long S2 = 0;
			long S3 = 0;
			
			for(int idx = 1; idx <= N; idx++) S1 += idx;
			for(int idx = 1; idx <= 2 * N; idx += 2) S2 += idx;
			for(int idx = 2; idx <= 2 * N; idx += 2) S3 += idx;
			
			sb.append(K + " " + S1 + " " + S2 + " " + S3 + "\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
	}
}
