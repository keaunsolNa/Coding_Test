import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			PriorityQueue<Integer> minPq = new PriorityQueue<Integer>();
			PriorityQueue<Integer> maxPq = new PriorityQueue<Integer>(Collections.reverseOrder());
			StringBuilder sb = new StringBuilder();
			int M = Integer.parseInt(br.readLine());
			
			int chk = 0;
			int length = 0;
			for(int i = 0; i < M / 10 + 1; i++) {
				st = new StringTokenizer(br.readLine());
				
				int cnt = 1;
				while(st.hasMoreTokens()) {
					int temp = Integer.parseInt(st.nextToken());
					
					if(minPq.size() == maxPq.size()) maxPq.add(temp);
					else minPq.add(temp);
					
					if(!minPq.isEmpty() && maxPq.peek() > minPq.peek()) {
						minPq.add(maxPq.poll());
						maxPq.add(minPq.poll());
					}
					
					if(cnt % 2 != 0) {
						sb.append(maxPq.peek() + " ");
						chk++;
						length++;
					}
					
					if(chk == 10) {
						sb.append("\n");
						chk = 0;
					}
					
					cnt++;
				}
				
			}
			sb.insert(0, length + "\n");
			sb.append("\n");
			ans.append(sb);
		}
		
		
		System.out.print(ans);
   }
}