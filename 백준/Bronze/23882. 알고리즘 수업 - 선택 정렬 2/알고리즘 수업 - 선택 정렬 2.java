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
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n + 1];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		
		int cnt = 0;
		for(int last = n; last >= 2; last--) {
			
			int max = Integer.MIN_VALUE;
			int i = 0;
			
			for(int idx = 1; idx <= last; idx++) {
	            if (max < arr[idx]) {
	                max = arr[idx];
	                i = idx;
	            }
			}    
	            
            if (last != i) {
                int tmp = arr[last];
                arr[last] = arr[i];
                arr[i] = tmp;
            
	            if (++cnt == k) {
	                for (int j = 1; j <= n; j++) System.out.print(arr[j] + " ");
	                return;
	            }
            }
		}
		
		System.out.println(-1);
	}	
}
