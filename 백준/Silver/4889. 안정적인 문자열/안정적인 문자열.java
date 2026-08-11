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
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		int idx = 1;
		while(!(input = br.readLine()).contains("-")) {
			Stack<Character> stack = new Stack<>();
			int ans = 0;

			for(int i = 0; i < input.length(); i++) {
				
				if(input.charAt(i) == '{') stack.add('{');
				else {
					if(stack.isEmpty()) {
						stack.add('{');
						ans++;
					} else stack.pop();
				}
			}
			
			sb.append(idx + ". " + (ans + stack.size() / 2) + "\n");
			idx++;
		}
		
		System.out.println(sb);
	}
}
