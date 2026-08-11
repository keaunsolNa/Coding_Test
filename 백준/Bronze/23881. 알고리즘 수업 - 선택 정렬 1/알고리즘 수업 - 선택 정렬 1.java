import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = N-1; i > 0; i--) {
			
			int m = 0;
			int idx = 0;
			for(int j = 0; j <= i; j++) {
				if(m < arr[j]) {
					m = arr[j];
					idx = j;
				}
			}
			
			if(arr[i] != m) {
				int t = arr[i];
				arr[i] = arr[idx];
				arr[idx] = t;
				cnt++;
				
				if(cnt == K) {
					System.out.println(Math.min(arr[i], arr[idx]) + " " + Math.max(arr[i], arr[idx]));
					break;
				}
			}
		}
		if(cnt < K) System.out.println("-1");
	}
}
