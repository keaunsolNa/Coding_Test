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
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[N];
		
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i = 0; i < N; i++) {
			
			int c = arr[i];
			for(int j = i + 1; j < N; j++) {
				
				if(arr[j] * 2 <= c) continue;
				for(int q = j + 1; q < N; q++) {
					
					if(arr[j] + arr[q] > c) {
						
						System.out.println(arr[j] + arr[q] + c);
						return;
					}
				}
			}
		}
		
		System.out.println(-1);
	}
}
