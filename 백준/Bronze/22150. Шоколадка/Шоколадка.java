import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int[] arr = new int[2 * N];
			boolean flag = false;
			
			for(int i = 0; i < 2 * N; i++) arr[i] = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < 2 * N; i += 2) {
				if(arr[i] + arr[i + 1] != N) flag = true;
			}
			
			if(flag) System.out.println("yes");
			else System.out.println("no");
		}
	}
}
