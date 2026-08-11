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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		if(L == 1) {
			System.out.println(N);
			return;
		}
		
		int[] needPix = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) needPix[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(needPix);
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			
			int start = needPix[i];
			while(true) {
				if(i+1 == N) break;
				
				if(needPix[i+1] - start + 1 <= L) {
					i++;
				} else break;
			}
			
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
