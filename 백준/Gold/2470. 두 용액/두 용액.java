import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		int max = Integer.MAX_VALUE;
		int[] answer = new int[2];
		
		for(int i = 0; i < N; i++) {

			int start = i + 1;
			int end = N - 1;
			
			while(start <= end) {
				
				int mid = (start + end) / 2;
				int sum = arr[i] + arr[mid];
				
				if(Math.abs(sum) < max) {
					answer[0] = arr[i];
					answer[1] = arr[mid];
					max = Math.abs(sum);
				}
				
				if(sum < 0) start = mid + 1;
				else end = mid - 1;
			}
		}
		
		System.out.println(answer[0] + " " + answer[1]);
	}
}
