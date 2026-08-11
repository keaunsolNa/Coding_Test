import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test06();
	}

	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			queue.add(Integer.parseInt(st.nextToken()));
		}
		
		Stack<Integer> stack = new Stack<>();
		int number = 1;
		while(!queue.isEmpty()) {
			if(number == queue.peek()) {
				queue.poll();
				number++;
				continue;
			} else {
				if(!(stack.isEmpty()) && stack.peek() == number) {
					stack.pop();
					number++;
					continue;
				}
				stack.add(queue.poll());
			}
		}
		
		while(!stack.isEmpty()) {
			if(number == stack.peek()) {
				stack.pop();
				number++;
				continue;
			} else {
				break;
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println("Nice");
		} else {
			System.out.println("Sad");
		}
	}
}
