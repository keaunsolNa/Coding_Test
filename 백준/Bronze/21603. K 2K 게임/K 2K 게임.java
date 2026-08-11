import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		
		int fk = K % 10;
		int fk2 = K * 2 % 10;
		
		int cnt = 0;
		for(int i = 1; i <= N; i++) {
			
			int fx = i % 10;
			if(fx != fk && fx != fk2) {
				sb.append(i + " ");
				cnt++;
			}
		}
		
		sb.insert(0, cnt + "\n");
		
		System.out.println(sb);
	}
}
