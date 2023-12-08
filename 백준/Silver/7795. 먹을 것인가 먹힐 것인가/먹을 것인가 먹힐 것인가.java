import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    private static int N;
	private static int M;
	private static int[] nArr;
	private static int[] mArr;
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			nArr = new int[N];
			mArr = new int[M];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) nArr[i] = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < M; i++) mArr[i] = Integer.parseInt(st.nextToken());

			Arrays.sort(nArr);
			Arrays.sort(mArr);
			
			long total = 0;
			for(int i = 0; i < N; i++) {
				
				total += binarySearch(nArr[i]);
			}
			
			System.out.println(total);
		}
				
	}
	
	private static int binarySearch(int target) {
		
		int left = 0;
		int right = M - 1;
		int middle = 0;
		
		while(left <= right) {
			
			middle = (left + right) / 2;
			
			if(target > mArr[middle]) left = middle + 1;
			else right = middle - 1;
		}
		
		return left;
	}
}