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
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Stack<Character> stack = new Stack<>();
		
		int ans = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '(') stack.add(input.charAt(i));
			else {
				if(!stack.isEmpty() && stack.peek() == '(') stack.pop();
				else ans++;
			}
		}
		
		System.out.println(ans + stack.size());
	}
}
