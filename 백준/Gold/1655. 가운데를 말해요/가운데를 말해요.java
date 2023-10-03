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
		PriorityQueue<Integer> minPq = new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxPq = new PriorityQueue<Integer>(Collections.reverseOrder());
       StringBuilder sb = new StringBuilder(); 
       
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			
			if(minPq.size() == maxPq.size()) maxPq.add(temp);
			
			else minPq.add(temp);
			
			if(!minPq.isEmpty() && maxPq.peek() > minPq.peek()) {
				minPq.add(maxPq.poll());
				maxPq.add(minPq.poll());
			}
			
			sb.append(maxPq.peek() + "\n");
		}
		
		System.out.print(sb);
   }
}