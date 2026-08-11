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
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[Math.max(N, M)];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < Math.max(N, M); i++) {
			
			int x = arr[i] == 0 ? 0 : arr[i];
			
			if(st.hasMoreTokens())
				arr[i] = Integer.parseInt(st.nextToken()) - x;
			else arr[i] = 0;
		}
		
		Arrays.sort(arr);
		System.out.println(Math.max(arr[arr.length - 1], 0));
	}
}
