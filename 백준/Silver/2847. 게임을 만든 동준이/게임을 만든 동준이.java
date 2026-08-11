import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
			
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		
		if(N == 1) System.out.println(0);
		else {
			
			int cnt = 0;
			
			for(int i = N - 2; i >= 0; i--) {
				int next = arr[i + 1];
				int prev = arr[i];
				
				if(prev >= next) {
					cnt += prev - (next - 1);
					arr[i] = next - 1;
				}
			}
			System.out.println(cnt);
		}
	}
}
