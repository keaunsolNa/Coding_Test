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

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

	public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Deque<Integer> dq = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		int num = 0;
		for(int i = 1; i <= N; i++) dq.add(i);
		
		while(!dq.isEmpty()) {
			
			while(num != M) {
				if(dq.isEmpty()) break;
				for(int i = 0; i < K-1; i++) dq.add(dq.pollFirst());
				list.add(dq.pollFirst());
				num++;
			}
			while(num != 0) {
				if(dq.isEmpty()) break;
				for(int i = 0; i < K-1; i++) dq.addFirst(dq.pollLast());
				list.add(dq.pollLast());
				num--;
			}
				
		}
		
		for (Integer integer : list) System.out.println(integer);
		
	}
}
