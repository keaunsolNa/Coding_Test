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
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String input = br.readLine();
			Stack<Character> stL = new Stack<>();
			Stack<Character> stR = new Stack<>();
			
			for (int i = 0; i < input.length(); i++) {
				char order = input.charAt(i);
				
				if (order == '<') {
				
					if (!stL.empty()) stR.push(stL.pop());

				} else if (order == '>') {

					if (!stR.empty()) stL.push(stR.pop());

				} else if (order == '-') {
					
					if (!stL.empty()) stL.pop();
					
				} else {
					stL.push(order);
				}
					
			}
			
			while (!stL.empty()) stR.push(stL.pop());

			while (!stR.empty()) sb.append(stR.pop());
			
			sb.append("\n");
			
		}
		
		System.out.println(sb);
	}
}
