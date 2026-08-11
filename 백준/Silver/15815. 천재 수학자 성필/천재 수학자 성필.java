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
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Integer> operand = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if ('0' <= ch && ch <= '9') operand.push(Character.getNumericValue(ch));
			
			else {
				
				int b = operand.pop();
				int a = operand.pop();

				switch (ch) {
				
				case '+':
					
					int n = a + b;
					operand.push(n);
					break;
					
				case '-':
					
					n = a - b;
					operand.push(n);
					break;
					
				case '*':
					
					n = a * b;
					operand.push(n);
					break;
					
				case '/':
					
					n = a / b;
					operand.push(n);
					break;
					
				}

			}
			
			
		}
		
		System.out.print(operand.pop());
	}
}
