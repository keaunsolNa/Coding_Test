import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		boolean[] arr = new boolean[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken()) - 1;
			
			arr[num] = true;
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < k; i++) {
			int num = Integer.parseInt(st.nextToken()) - 1;
			
			arr[num] = true;
		}

		int num = 0;
		for(int i = 0; i < n; i ++) {
			if(!arr[i]) {
				sb.append(i + 1 + " ");
				num++;
			}
		}
		
		sb.insert(0, num + "\n");
		System.out.print(sb);
	}
}
