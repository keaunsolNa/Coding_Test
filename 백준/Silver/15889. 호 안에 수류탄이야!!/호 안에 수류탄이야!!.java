import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] dot = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) dot[i] = Integer.parseInt(st.nextToken());
		
		if(N == 1) {
			System.out.print("권병장님, 중대장님이 찾으십니다");
			return;
		}
		int[] range = new int[N-1];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N - 1; i++) range[i] = Integer.parseInt(st.nextToken());
		
		long maxRange = 0;
		
		for(int i = 0; i < N - 1; i++) {
			
			maxRange = Math.max(maxRange, dot[i] + range[i]);
			
			if(maxRange >= dot[i + 1]) continue;
			else {
				System.out.print("엄마 나 전역 늦어질 것 같아"); return;
			}
		}
		
		System.out.print("권병장님, 중대장님이 찾으십니다");
	}
}
