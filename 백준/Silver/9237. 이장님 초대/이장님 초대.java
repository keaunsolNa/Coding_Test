import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer[] arr = new Integer[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(arr, Collections.reverseOrder());
		
		int cnt = 2;
		int min = 0;
		for(int i = 0; i < arr.length; i++) {
			min = Math.max(min, cnt + arr[i]);
			cnt++;
		}
		
		System.out.println(min);
	}
}
