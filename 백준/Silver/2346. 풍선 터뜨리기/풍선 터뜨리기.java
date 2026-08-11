import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<int[]> ballon = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("1 ");
		int target = arr[0];
		
		for(int i = 1; i < N; i++){
			ballon.add(new int[] {(i+1), arr[i]}); 
		}
		
		while(!ballon.isEmpty()) {

			if(target > 0) {
				for(int i = 1; i < target; i++) {
					ballon.add(ballon.poll());
				}
				
				int[] nxt = ballon.poll();
				target = nxt[1];
				sb.append(nxt[0]+ " ");
			}
			
			else {
				for(int i = 1; i < -target; i++	) {
					ballon.addFirst(ballon.pollLast());
				}
				
				int[] nxt = ballon.pollLast();
				target = nxt[1];
				sb.append(nxt[0]+" ");
			}
		}
				
		System.out.println(sb.toString());
	}
}
