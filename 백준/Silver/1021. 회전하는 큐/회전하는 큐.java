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
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] idxs = new int[m];
		st = new StringTokenizer(br.readLine());

		for(int i = 0; i < m; i++) {
			idxs[i] = Integer.parseInt(st.nextToken());
		}
		
		LinkedList<Integer> dq = new LinkedList<>();
		
		for(int i=1; i<n+1; i++) dq.offer(i);
		
		int count = 0;
		for(int idx : idxs) {
			
			while(true) {
				
				if(dq.peek() == idx) {
					
					dq.poll();
					break;
					
				} else {
					
					if(dq.indexOf(idx) < (double)dq.size() / 2) {
						
						while(dq.peek() != idx) {
							dq.offerLast(dq.pollFirst());
							count++;
						}
						
					} else {
						
						while(dq.peek() != idx) {
							dq.offerFirst(dq.pollLast());
							count++;
						}
						
					}
				}
			}
		}
		
		System.out.println(count);
		
		
	}
}
