import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<int[]> stack = new Stack<>();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			int input = Integer.parseInt(st.nextToken());
			
			while(!stack.isEmpty()) {
				
				if(stack.peek()[1] >= input) {
					sb.append(stack.peek()[0] + " ");
					break;
				}
				stack.pop();
			}
			
			if(stack.isEmpty()) sb.append("0 ");
			
			stack.push(new int[] {i, input});
		}
		
		System.out.println(sb);
	}
}
