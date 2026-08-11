import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int idx = 1;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			int T = Integer.parseInt(st.nextToken());
			if(T == 0) break;
			
			int[] arr = new int[T];
			
			for(int i = 0; i < T; i++) arr[i] = Integer.parseInt(st.nextToken());
			
			double ans = 0;
			if(T % 2 != 0) ans = arr[T / 2];
			else ans = (double)(arr[T / 2 - 1] + arr[T / 2]) / 2;
			
			sb.append("Case " + idx +": " + ans + "\n");
			idx++;
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
}
