import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		
		st = new StringTokenizer(br.readLine());
		boolean[] chk = new boolean[N+1];
		
		for(int i = 1; i < N; i++) 
			chk[Integer.parseInt(st.nextToken())] = true;
		
		
		for(int i = 1; i <= N; i++) {
			if(!chk[i]) {
				System.out.println(i);
				return;
			}
		}
	}
}
