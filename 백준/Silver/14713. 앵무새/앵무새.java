import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		List<Stack<String>>  list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			Stack<String> temp = new Stack<>();
			while(st.hasMoreTokens()) temp.push(st.nextToken());
			list.add(temp);
		}
		
		st = new StringTokenizer(br.readLine());
		Stack<String> stack = new Stack<>(); 
		while(st.hasMoreTokens()) stack.push(st.nextToken());

		while(true)	{
			boolean flag = false;
			
			for(int i = 0; i< N; i++) {
				if(list.get(i).isEmpty()) continue;
				if(list.get(i).peek().equals(stack.peek())) {
					list.get(i).pop();
					stack.pop();
					flag = true;
					break;
				}
			}
			
			if(!flag || stack.isEmpty()) break;
			
		}
		
		System.out.println(stack.isEmpty() ? "Possible" : "Impossible");
	}
}
