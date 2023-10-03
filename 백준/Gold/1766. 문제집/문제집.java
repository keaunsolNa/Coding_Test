
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<ArrayList<Integer>> map = new ArrayList<>();
		int [] preCnt = new int[N + 1];
		
		for(int i = 0; i <= N; ++i) map.add(new ArrayList<>());
		
		for(int i = 0; i < M; ++i) {
			
            st = new StringTokenizer(br.readLine());
            int prev = Integer.parseInt(st.nextToken());
            int next = Integer.parseInt(st.nextToken());

            map.get(prev).add(next);
            preCnt[next]++;
            
        }
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
	        
		for(int i = 1; i <= N; ++i) if(preCnt[i] == 0) pq.add(i);

		while(!pq.isEmpty()) {
			
            int cur = pq.poll();
            sb.append(cur).append(" ");

            for(int i : map.get(cur)) {
            	
                preCnt[i]--;
                if(preCnt[i] == 0) pq.add(i);
                
            }
        }

        System.out.print(sb.toString());
   }
}