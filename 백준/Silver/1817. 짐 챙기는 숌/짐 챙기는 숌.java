import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] book = new int[N];
		if(N == 0) {
			System.out.println(0);
			return;
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) book[i] = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		int cnt = 1;
		for(int i = 0; i < N; i++) {
			
			sum += book[i];
			
			if(sum > M) {
				cnt++;
				sum = book[i];
			}
		}
		
		
		System.out.println(cnt);
	}
}
