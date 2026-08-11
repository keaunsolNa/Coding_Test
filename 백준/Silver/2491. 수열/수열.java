import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static Integer[] dp;
	private static int max;
	private static int[] arr;

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];
		
		int pCnt = 1;
		int mCnt = 1;
		int max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(i > 0) {
				if(arr[i] > arr[i-1]) {
					pCnt++;
					mCnt = 1;
				}
				else if(arr[i] < arr[i-1]) {
					mCnt++;
					pCnt = 1;
				}
				else {
					pCnt++; mCnt++;
				}
			}
			
			if(max < pCnt) max = pCnt;
			else if(max < mCnt) max = mCnt;
		}
		
		System.out.println(max);
		
	}
}
