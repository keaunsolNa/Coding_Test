import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

		long sum = 0;
		for(int i = 0; i < M; i++) sum += arr[i];
		
		long max = sum;
		
		for(int i = M; i < N; i++) {
			
			sum += arr[i] - arr[i - M];
			
			if(max < sum) max = sum;
			
		}

		System.out.println(max);
	}
}
