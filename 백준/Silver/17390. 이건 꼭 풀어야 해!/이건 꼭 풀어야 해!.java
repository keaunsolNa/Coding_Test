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
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		int[] arr = new int[N + 1];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= N; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		
        for (int i = 1; i <= N; i++) arr[i] += arr[i-1];
        
		while(Q --> 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int L = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			System.out.println(getRangedSum(arr, L, R));
		}
	}

	public static int getRangedSum(int[] arr, int L, int R) {
        return arr[R] - arr[L-1];
    }
}
