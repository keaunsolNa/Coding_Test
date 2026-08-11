import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());

		int cnt = 0;
		for(int i = 1; i < n; i++) if(arr[i - 1] - arr[i] >= k) cnt++;
		
		System.out.println(cnt);
	}
}
