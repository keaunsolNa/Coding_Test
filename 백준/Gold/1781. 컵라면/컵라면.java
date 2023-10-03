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

    	
	private static class DeadLine implements Comparable<DeadLine>{
		
		private int deadLine;
		private int cuplamen;
		
		private DeadLine(int deadLine, int cuplamen) {
			this.deadLine = deadLine;
			this.cuplamen = cuplamen;
		}
		
        @Override
        public int compareTo(DeadLine o) {
        	
        	if(this.deadLine == o.deadLine) {
        		return o.cuplamen - this.cuplamen;
        	}
        	
            return this.deadLine - o.deadLine;
        }
	}
	
    
   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> list = new PriorityQueue<Integer>();
		StringTokenizer st;
	
		int N = Integer.parseInt(br.readLine());
		DeadLine[] arr = new DeadLine[N];
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int deadLine = Integer.parseInt(st.nextToken());
			int cup = Integer.parseInt(st.nextToken());
			
			arr[i] = new DeadLine(deadLine, cup);
			
		}

		long cnt = 0;
		Arrays.parallelSort(arr);
		
		for(DeadLine question : arr) {
			
			int size = list.size();
			
			if(size < question.deadLine) list.offer(question.cuplamen);
			
			else if(size == question.deadLine) {
				
				int noodleCount = list.peek();
				if(noodleCount < question.cuplamen) {
					
					list.poll();
					list.offer(question.cuplamen);
					
				}
			}
		}
		
		while(!list.isEmpty()) cnt += list.poll();
		
		System.out.println(cnt);    
   }
}