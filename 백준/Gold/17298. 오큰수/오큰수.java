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
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		Stack<Integer> stack = new Stack<Integer>();
		int N = Integer.parseInt(br.readLine());
		int[] sq = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) sq[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			
			while(!stack.isEmpty() && sq[stack.peek()] < sq[i]) sq[stack.pop()] = sq[i];
			
			stack.push(i);
			System.out.println(stack);
		}

		while(!stack.isEmpty()) sq[stack.pop()] = -1;
		
		for(int i = 0; i < N; i++) sb.append(sq[i] + " ");
		
		System.out.println(sb);
	}
}
