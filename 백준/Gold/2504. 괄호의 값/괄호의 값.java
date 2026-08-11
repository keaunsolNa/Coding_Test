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
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();

		String input = br.readLine();
		int ans = 0;
		int value = 1;
		for(int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) == '(') {
				stack.add('(');
				value *= 2;
			}
			
			else if(input.charAt(i) == '[') {
				stack.add('['); 
				value *= 3;
			}
			
			else if(stack.isEmpty()) {
				
				System.out.println(0);
				return;
				
			}
			
			else if(input.charAt(i) == ')'){
				
				if(stack.peek() != '(') { 
					
					System.out.println(0);
					return;
					
                } else if(input.charAt(i - 1) == '(') ans += value;

				stack.pop();
                value /= 2;
				
			}
			
			else if(input.charAt(i) == ']') {
				
				if(stack.peek() != '[') { 
					
					System.out.println(0);
					return;
					
				} else if(input.charAt(i - 1) == '[') ans += value;
				
				stack.pop();
				value /= 3;
				
			}
			
		}
		
		if(!stack.isEmpty()) System.out.println(0);
		else System.out.println(ans);
	}
}
