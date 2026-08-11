import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[N];
		for(int i = 0; i < N; i++)arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		long sum = 0;
		for(int i = 0; i < N; i++) {
			if(arr[i] - i > 0) {
				sum += arr[i] - i;
			} else break;
		}

		System.out.println(sum);
	}
}
