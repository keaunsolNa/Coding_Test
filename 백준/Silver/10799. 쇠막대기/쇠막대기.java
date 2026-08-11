import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] input = br.readLine().toCharArray();
		Stack<Character> stack = new Stack<>();
		
		int result = 0;
		for(int i = 0; i < input.length; i++) {
			
			
			if(input[i] == '(') stack.add(input[i]);
			else {
				
				if(input[i - 1] == '(') {
					stack.pop();
					result += stack.size();
				} else {
					stack.pop();
					result++;
				}
			}
				
		}
		
		System.out.println(result);
		
	}
}
