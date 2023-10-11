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
		
		int[] time = new int[N];
		Integer[] difTime = new Integer[N - 1];
		time[0] = Integer.parseInt(br.readLine());
		
		for(int i = 1; i < N; i++) {
			
			time[i] = Integer.parseInt(br.readLine());
			difTime[i - 1] = time[i] - time[i - 1];
			
		}
		
		Arrays.sort(difTime, Collections.reverseOrder());
		
		long min = 0;
		
		for(int i = 0; i < K - 1; i++) difTime[i] = 0;

		min += K;
		
		for(int i = 0; i < N - 1; i++) min += difTime[i];
		
		System.out.println(min);
   }
}