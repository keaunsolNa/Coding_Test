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
		int K = Integer.parseInt(st.nextToken());
	
		int[] arr = new int[N];
		long start = Integer.MAX_VALUE;
        long end = Integer.MAX_VALUE;
        
		for(int i = 0; i < N; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
			start = Math.min(arr[i], start);
			
		}
		
		long answer = 0;
		
		while(start <= end) {
			
			long mid = (start + end) / 2;
			long sum = 0;
			
			for(int i = 0; i < N; i++) 
				if(mid >= arr[i]) sum += mid - arr[i];
			
			if(K >= sum) {
				
				start = mid + 1;
				answer = Math.max(answer, mid);
				
			} else end = mid - 1;
		}
		
		System.out.println(answer);
	}
}
