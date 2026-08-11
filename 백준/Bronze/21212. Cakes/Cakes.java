import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		int ans = Integer.MAX_VALUE;
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			int need = Integer.parseInt(st.nextToken());
			int have = Integer.parseInt(st.nextToken());
			
			ans = Math.min(ans, have / need);
		}
		
		System.out.print(ans);
	}
}
