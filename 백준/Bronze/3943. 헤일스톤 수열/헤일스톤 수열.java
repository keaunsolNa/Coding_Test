import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int N = Integer.parseInt(br.readLine());
			
			int max = N;
			while(N != 1) {
				if(N % 2 == 0) {
					N /= 2;
					if(max < N) max = N;
				} else {
					N = N*3 + 1;
					if(max < N) max = N;
				}
			}
			
			System.out.println(max);
		}
	}
}
