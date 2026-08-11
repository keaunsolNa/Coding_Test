import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			int T = Integer.parseInt(br.readLine());
			if(T == 0) break;
			
			st = new StringTokenizer(br.readLine());
			
			int[] arr = new int[T];
			for(int i = 0; i < T; i++) arr[i] = Integer.parseInt(st.nextToken());
			
			int ans = 0;
			for(int i = 1; i < T - 1; i++) {
			
				if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) ans++;
				
			}
			
			sb.append(ans + "\n");
		}
		
		System.out.print(sb);
		
	}
}
