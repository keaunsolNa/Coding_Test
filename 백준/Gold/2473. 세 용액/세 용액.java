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
		long max = Long.MAX_VALUE;
		int[] answer = new int[3];
		
		for(int x = 0; x < N; x++) {

			for(int y = x + 1; y < N - 1; y++) {
				
				int start = y + 1;
				int end = N - 1;
				
				while(start <= end) {
					
					int mid = (start + end) / 2;
					long sum = (long)arr[x] + arr[y] + arr[mid];
					
					if(Math.abs(sum) < max) {
						answer[0] = arr[x];
						answer[1] = arr[y];
						answer[2] = arr[mid];
						max = Math.abs(sum);
					}
					
					if(sum < 0) start = mid + 1;
					else end = mid - 1;
				}
			}
		}
		
		System.out.println(answer[0] + " " + answer[1] + " " + answer[2]);
	}
}
