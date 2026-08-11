import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		String str = br.readLine();
	
		boolean tag = false;		
		for(int i = 0; i < str.length(); i++) {
	
			if(str.charAt(i) == '<') {
				tag = true;
	
				while( !stack.isEmpty() ) sb.append(stack.pop());
	
				sb.append(str.charAt(i));
			}
			
			else if(str.charAt(i) == '>') {
			
				tag = false;
				sb.append(str.charAt(i));
				
			}

			else if(tag == true) {

				sb.append(str.charAt(i));
				
			}

			else if( tag == false) {
				
				if(str.charAt(i) == ' ') {
	
					while( !stack.isEmpty() ) sb.append(stack.pop());
					sb.append(str.charAt(i));
					
				} else stack.push(str.charAt(i));
			}
		}
		
		while(!stack.isEmpty()) sb.append(stack.pop());
		
		System.out.println(sb);
	}
}
