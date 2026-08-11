import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	private static String input;

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		
		int len = input[0].length();
		sb.append(input[0].charAt(0));
		
		for(int i = 1; i < N; i++) {
			
			if(input[i].length() >= len) sb.append(input[i].charAt(len - 1));
			else sb.append(" ");
			
			len = input[i].length();
		}
		
		System.out.print(sb);
	}
}
