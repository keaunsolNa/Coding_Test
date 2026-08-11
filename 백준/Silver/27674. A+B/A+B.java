import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder answer = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			br.readLine();
			char[] input = br.readLine().toCharArray();

			Arrays.sort(input);
			StringBuilder sb = new StringBuilder();
			
			for (char c : input) sb.append(c);
			String sort = sb.reverse().toString();

			answer.append(Long.parseLong(sort.substring(0, sort.length() - 1)) + Character.getNumericValue(sort.charAt(sort.length() - 1)) + "\n");
		}
		
		System.out.println(answer);
		
	}
}
