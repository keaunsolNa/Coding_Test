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
		test28();
	}

	public static void test28() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < K; i++) {
			int temp = Integer.parseInt(br.readLine());
			
			if(temp != 0) {
				stack.add(temp);
			} else {
				stack.pop();
			}
		}

		if(stack.isEmpty()) {
			System.out.println(0);
		} else {
			long sum = 0;
			while(!stack.isEmpty()) {
				sum += stack.pop();
			}
			
			System.out.println(sum);
		}
	}
}
