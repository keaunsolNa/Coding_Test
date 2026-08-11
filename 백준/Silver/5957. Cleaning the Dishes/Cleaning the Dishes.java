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
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		Stack<Integer> stack3 = new Stack<>();
		
		for(int i = N; i >= 1; i--) stack1.add(i);
		
		String input = "";
		
		while((input = br.readLine()) != null) {
			st = new StringTokenizer(input);
			
			int work = Integer.parseInt(st.nextToken());
			int doing = Integer.parseInt(st.nextToken());
			
			switch(work) {
			
				case 1 : 
					for(int i = 0; i < doing; i++) stack2.add(stack1.pop()); break;
					
				case 2 : 
					for(int i = 0; i < doing; i++) stack3.add(stack2.pop()); break;
					
			}
		}

		while(!stack3.isEmpty()) System.out.println(stack3.pop());
		
	}
}
