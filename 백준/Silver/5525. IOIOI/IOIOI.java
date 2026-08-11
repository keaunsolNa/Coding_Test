import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N + 1; i++) sb.append("IO");
		sb.deleteCharAt(sb.length() - 1);
		
		String S = sb.toString();
		String base = br.readLine();
		
		int answer = 0;
		int len = 0;
		
		for (int i = 0; i < base.length(); i++) {
			
			if(base.charAt(i) == S.charAt(len)) len++;
			
			else {
				
				if(base.charAt(i)=='I') len = 1;
				else len = 0;
				
			}
			
			if(len == 2 * N + 1) {
				answer++;
				len -= 2;
			}
		}
		
		System.out.println(answer);
		
	}
}
