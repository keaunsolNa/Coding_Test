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
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> que = new LinkedList<>();
		int maxLine = 0;
		int target = Integer.MAX_VALUE;
		while(n --> 0) {
			
			st = new StringTokenizer(br.readLine());
			
			int order = Integer.parseInt(st.nextToken());
			
			if(order == 1) que.add(Integer.parseInt(st.nextToken()));
			else que.poll();

			if(que.size() > maxLine) {
				maxLine = que.size();
				target = que.peekLast();
			}
			if(que.size() == maxLine) {
				if(target > que.peekLast()) target = que.peekLast();
			}
			
		}
		
		System.out.println(maxLine + " " + target);
	}
}
