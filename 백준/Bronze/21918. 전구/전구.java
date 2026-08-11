import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = (Integer.parseInt(st.nextToken()) == 0) ? 0 : 1;
		
		for(int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			switch(a) {
			
				case 1 : arr[b - 1] = c; break;
				
				case 2 : 
					for(int o = b - 1; o <= c - 1; o++) arr[o] = (arr[o] == 0) ? 1 : 0;
					break;
					
				case 3 : 
					for(int o = b - 1; o <= c - 1; o++) arr[o] = 0; break;
					
				case 4 : 
					for(int o = b - 1; o <= c - 1; o++) arr[o] = 1; break;
			}
			
		}
		
		for (int j : arr) System.out.print(j + " ");
	}
}
