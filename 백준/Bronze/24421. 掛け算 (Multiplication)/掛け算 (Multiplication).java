import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

		int cnt = 0;
		for(int i = 0; i < N; i++) {

			for(int j = i + 1; j < N; j++) {
				
				int temp = arr[i] * arr[j];
				for(int q = j + 1; q < N; q++) if(temp == arr[q]) cnt++;
				
			}
		}
		
		System.out.println(cnt);
	}
}
