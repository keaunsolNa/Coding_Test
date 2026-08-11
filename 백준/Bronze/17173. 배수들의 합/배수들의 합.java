import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[M];
		for(int i = 0; i < M; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		long sum = 0;
		
		for(int i = arr[0]; i <= N; i++) {
			for(int j = 0; j < M; j++) {
				
				if(i % arr[j] == 0) {
					sum += i;
					break;
				}
				
			}
		}
		
		System.out.println(sum);
	}
}
