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
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character, Integer> map = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		char ch = 'A';
		for (int i = 0; i < N; i++) map.put(ch++, Integer.parseInt(br.readLine()));

		Stack<Double> operand = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);

			if ('A' <= ch && ch <= 'Z') operand.push((double) map.get(ch));
			
			else {
				
				double b = operand.pop();
				double a = operand.pop();

				switch (ch) {
				
				case '+':
					
					double n = a + b;
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
		
		System.out.printf(String.format("%.2f", operand.pop()) + "\n");

	}
}
