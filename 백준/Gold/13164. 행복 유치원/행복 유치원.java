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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		Integer[] dif = new Integer[N - 1];
		
		arr[0] = Integer.parseInt(st.nextToken());
		for(int i = 1; i < N; i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
			dif[i - 1] = arr[i] - arr[i - 1];
			
		}
		
		Arrays.sort(dif, Collections.reverseOrder());
		
		long min = 0;
		
		for(int i = 0; i < K - 1; i++) dif[i] = 0;

		for(int i = 0; i < N - 1; i++) min += dif[i];
		
		System.out.println(min);
   }
}