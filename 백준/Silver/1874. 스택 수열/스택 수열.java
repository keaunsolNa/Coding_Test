import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

    public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < testCase; i++) {
			queue.add(Integer.parseInt(br.readLine()));
		}
		
		StringBuilder sb = new StringBuilder();
		while(!queue.isEmpty()) {
			
			for(int i = 1; i <= testCase; i++) {
				stack.push(i);
				sb.append("+").append("\n");
				while(stack.contains(queue.peek())) {
					stack.pop();
					queue.poll();
					sb.append("-").append("\n");
					continue;
				}
			}
			break;
		}

		if(stack.isEmpty()) {
			System.out.println(sb);
		} else {
			System.out.println("NO");
		}
    }
}
