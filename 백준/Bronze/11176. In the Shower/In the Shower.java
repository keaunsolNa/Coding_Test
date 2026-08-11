import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int cnt = 0;
			st = new StringTokenizer(br.readLine());
			int E = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			for(int j = 0; j < N; j++) {
				int A = Integer.parseInt(br.readLine());
				
				if(A > E) cnt++;
			}
			System.out.println(cnt);
		}
		
	}
}
