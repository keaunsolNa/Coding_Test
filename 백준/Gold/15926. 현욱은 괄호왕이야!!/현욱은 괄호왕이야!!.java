import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		Stack<Integer> stack = new Stack<>();
		int cnt = 0;
		stack.add(-1);
		
		for(int i = 0; i < n; i++) {
			char target = input.charAt(i);
			
			if(target == '(') stack.push(i);
			else {
				stack.pop();
				if(!stack.isEmpty()) cnt = Math.max(cnt, i - stack.peek());
				else stack.add(i);
			}
		}
		
		System.out.println(cnt);
	}
}
