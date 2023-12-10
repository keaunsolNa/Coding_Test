import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		int[] prefixSum = new int[N+1];
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
        	prefixSum[i + 1] = sum;
        	
		}


		long answer = 0;
		for(int i = 0; i < N; i++) {
			
    		int standard = arr[i];
    		int calculatedSum = prefixSum[N] - prefixSum[i+1];
    		answer += standard * calculatedSum;
    		
    	}
		
		System.out.println(answer);
	}
}
