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
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char[] input = br.readLine().toCharArray();
		String target = br.readLine();
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < input.length; i++) {
			stack.push(input[i]);
			
			if(stack.size() >= target.length()) {
				boolean flag = true;
				
				for(int j = 0; j < target.length(); j++) {
					if(stack.get(stack.size() - target.length() + j) != target.charAt(j)) {
						flag = false;
						break;
					}
				}
				
				if(flag) for(int j = 0; j < target.length(); j++) stack.pop();
			}
				
		}
		
		if(stack.size() == 0) {
			System.out.println("FRULA");
			return;
		}
		
		for (Character character : stack) sb.append(character);
		
		System.out.println(sb);
	}
}
