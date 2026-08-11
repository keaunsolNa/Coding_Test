import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		String origin = sb.toString();
		
		long ans = 0;
		sb = sb.insert(0, sb.charAt(sb.length() - 1));
		sb.deleteCharAt(sb.length() - 1);
		ans += Long.parseLong(sb.toString());
				
		while(!origin.equals(sb.toString())) {
			sb = sb.insert(0, sb.charAt(sb.length() - 1));
			sb.deleteCharAt(sb.length() - 1);
			ans += Long.parseLong(sb.toString());
		}
		
		System.out.println(ans);
		
	}
}
