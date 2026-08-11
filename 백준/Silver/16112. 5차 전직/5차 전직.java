import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		long[] arr = new long[n];
		
		for(int i = 0; i < n; i++) arr[i] = Long.parseLong(st.nextToken());
		
		Arrays.sort(arr);
		
		int count = 0;
		long exp  = 0;
		for(int i = 0; i < n; i++) {
			
			if(count < k) {
				count ++;
				exp -= arr[i];				
			}
			exp += (arr[i] * count);
		}
		
		System.out.println(exp);
		
	}
}
