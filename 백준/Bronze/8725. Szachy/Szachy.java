import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			int max = Integer.MIN_VALUE;
			
			for(int j = 0; j < N; j++) 
				max = Math.max(max, Integer.parseInt(st.nextToken()));
			
			ans += Math.max(0, max);
		}
		
		System.out.println(ans);
	}
}
