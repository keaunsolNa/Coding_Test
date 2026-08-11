import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int ans = 0;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			boolean chk = true;
			for(int j = 0; j < M; j++) {
				int goal = Integer.parseInt(st.nextToken());
				if(goal == 0) chk = false;
			}
			
			if(chk) ans++;
		}
		
		System.out.println(ans);
	}
}
