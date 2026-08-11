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
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		Stack<Character> stack = new Stack<>();
		String PPAP = "PPAP";
		for(int i = 0; i < input.length(); i++) {
			
			stack.push(input.charAt(i));
			
			if(stack.size() >= 4) {
				boolean flag = true;
				
				for(int j = 0; j < 4; j++) {
					if(stack.get(stack.size() - 4 + j) != PPAP.charAt(j)) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					for(int j = 0; j < 4; j++) stack.pop();
					stack.push('P');
				}
			}
		}
		
		if(stack.pop() == 'P' && stack.size() == 0) System.out.println("PPAP");
		else System.out.println("NP");
	}
}
