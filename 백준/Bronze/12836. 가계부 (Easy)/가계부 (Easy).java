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
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		long[] arr = new long[N + 1];
		
		for(int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			
			int order = Integer.parseInt(st.nextToken());
			
			if(order == 1) {
				arr[Integer.parseInt(st.nextToken())] += Integer.parseInt(st.nextToken());
			} else {
				
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				
				long total = 0;
				for(int j = start; j <= end; j++) {
					total += arr[j];
				}
				
				System.out.println(total);
			}
		}
		
	}
}
