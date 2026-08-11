import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] token = new int[N];
		for(int i = 0; i < N; i++) {
			token[i] = Integer.parseInt(br.readLine());
		}
		
		int maxT = 0;
		int maxAmount = 0;
		while(true) {
			for(int i = 0; i < N; i++) {
				if(token[i] <= K) {
					maxT = token[i];
				} else break;
			}
			int count  = K/maxT;
			
			K = K%maxT;
			maxAmount += count;
			
			if(K == 0) break;
		}
		
		System.out.println(maxAmount);
	}
}
