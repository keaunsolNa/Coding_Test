import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static int[] arr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		arr = new int[M];
		
		for(int i = 0; i < M; i++) arr[i] = Integer.parseInt(st.nextToken());
				
		int left = 1;
		int right = N;
		int ans = 0;
		while(left <= right) {
			
			int mid = (left + right) / 2;
			
			if(solve(N, mid)) {
				
				right = mid - 1;
				ans = mid;
			} else left = mid + 1;
		}
		
		System.out.println(ans);
	}
	
	private static boolean solve(int N, int mid) {
		
		int prev = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] - mid <= prev) prev = arr[i] + mid;
			else return false;
		}
		
		return N - prev <= 0;
	}
}