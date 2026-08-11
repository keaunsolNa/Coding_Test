import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
		for(int i = 1; i <= N; i++) arr[i - 1] = i;
		
		for(int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken()) - 1;
			int J = Integer.parseInt(st.nextToken()) - 1;
			
			int temp = arr[I];
			arr[I] = arr[J];
			arr[J] = temp;
			
		}
		
		for(int i = 0; i < N; i++) System.out.print(arr[i] + " ");
	}
}
