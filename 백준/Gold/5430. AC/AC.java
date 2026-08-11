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
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		ArrayDeque<Integer> deque;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String input = br.readLine();
			int n = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine(), "[],");
			
			deque = new ArrayDeque<Integer>();
			
			for(int i = 0; i < n; i++) deque.add(Integer.parseInt(st.nextToken()));
			
			AC(input, deque);
			
		}
		
		System.out.println(sb);
	}

	public static void AC(String input, ArrayDeque<Integer> deque) {
		
		boolean reverse = true;
		
		for(char cmd : input.toCharArray()) {
			
			if(cmd == 'R') {
				reverse = !reverse;	
				continue;
			}
			
			
			if(reverse) {
				
				if(deque.pollFirst() == null) {
					sb.append("error\n");
					return;
				}
				
			} else {
				
				if(deque.pollLast() == null) {
					sb.append("error\n");
					return;
				}	
				
			}
		}
		
		makeString(deque, reverse);
		
	}

	public static void makeString(ArrayDeque<Integer> deque, boolean reverse) {
		
		sb.append('[');	
		
		if(deque.size() > 0) {	
			
			if(reverse) {	
				
				sb.append(deque.pollFirst());	
				while(!deque.isEmpty()) sb.append(',').append(deque.pollFirst());
				
			} else {	
				
				sb.append(deque.pollLast());	
				while(!deque.isEmpty()) sb.append(',').append(deque.pollLast());
				
			}
		}
		
		sb.append(']').append('\n');	
		
	}
}
