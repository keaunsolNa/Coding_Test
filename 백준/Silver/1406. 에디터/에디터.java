import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String N = br.readLine();
		Stack<Character> stL = new Stack<>();
		Stack<Character> stR = new Stack<>();

		for (int i = 0; i < N.length(); i++) stL.push(N.charAt(i));
		
		int M = Integer.parseInt(br.readLine());

		for (int i = 0; i < M; i++) {
			String order = br.readLine();
			
			if (order.charAt(0) == 'L') {
			
				if (!stL.empty()) stR.push(stL.pop());

			} else if (order.charAt(0) == 'D') {

				if (!stR.empty()) stL.push(stR.pop());

			} else if (order.charAt(0) == 'B') {
				
				if (!stL.empty()) stL.pop();
				
			} else if (order.charAt(0) == 'P') {

				stL.push(order.charAt(2));
				
			}

		}

		while (!stL.empty()) stR.push(stL.pop());

		while (!stR.empty()) sb.append(stR.pop());
		
		System.out.println(sb);
		
		
	}
}
