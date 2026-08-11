import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int A = 2; A < N; A+=2) {
			
			for(int B = 1; B < N-A; B++) {
				
				for(int C = B+2; C < N; C++) {
					if(A+B+C == N) {
						cnt++;
					}
				}
			}
			
		}
		System.out.println(cnt);
	}
}
