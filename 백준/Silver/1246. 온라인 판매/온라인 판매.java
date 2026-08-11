import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[M];
		for(int i = 0; i < M; i++) arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		int res = 0;
		long max = 0;
		int price = 0;
		for(int i = 0; i < M; i++) {
			
			if(M - i < N) res = arr[i] * (M - i);
			else res = arr[i] * N;
			
			if(max < res) {
				price = arr[i];
				max = res;
			}
		}
		
		System.out.println(price + " " + max);
	}
}
