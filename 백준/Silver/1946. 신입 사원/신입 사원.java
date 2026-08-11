import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			int cnt = 1;
			int[] grade = new int[N + 1];
			
			for(int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				
				grade[A] = B;
			}
			
			int target = grade[1];
			
			for(int j = 2; j <= N; j++) {
				if(grade[j] < target) {
					target = grade[j];
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
		
	}
}
