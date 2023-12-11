import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    
    private static int N;
	private static int K;
	private static int[] arr;
	private static int answer;
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int[K];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < K; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		solve(0);
		
		System.out.println(answer);
	}
	
	private static void solve(int now) {
		
		if(now > N) return;
		
		if(answer < now) answer = now;
		
		for(int i = K - 1; i >= 0; i--) solve(now * 10 + arr[i]);
		
	}
}
