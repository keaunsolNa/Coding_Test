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
		test06();
	}

	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		Queue<Integer> que = new LinkedList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0;  i < T; i++) que.add(Integer.parseInt(st.nextToken()));
		int[] arr = new int[T];
		int cnt = 1;
		boolean[] chk = new boolean[T];
		
		while(!que.isEmpty()) {
			
			for(int i = 0; i < T; i++) {
				
				if(!chk[i]) {
					if(que.peek() == 1) {
						arr[i] = cnt;
						chk[i] = true;
						que.poll();
						cnt++;
					}
					else {
						arr[i] = cnt;
						cnt++;
						que.add(que.poll() - 1);
					}
				}
			}
			
		}
		
		for (int i : arr) System.out.print(i + " ");
		
	}
}
