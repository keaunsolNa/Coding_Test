import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	private static String input;

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = input.charAt(i);

		int cnt = 0;
		for(int i = 0; i < N - 1; i++) {
			
			if(Math.abs(arr[i] - arr[i + 1]) == 1) cnt++;
			else cnt = 0;
			
			if(cnt == 4) break;
		}
		
		System.out.println(cnt == 4 ? "YES" : "NO");
	}
}
