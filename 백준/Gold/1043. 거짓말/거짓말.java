import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		ArrayList<Integer> know = new ArrayList<>();
		int answer;
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		ArrayList<Integer>[] party = new ArrayList[M];
		answer = M;
		
		st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < cnt; i++) 
			know.add(Integer.parseInt(st.nextToken()));
		
		for(int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			cnt = Integer.parseInt(st.nextToken());
			party[i] = new ArrayList<>();
			
			for(int j = 0; j < cnt; j++) 
				party[i].add(Integer.parseInt(st.nextToken()));
			
		}
		
		Queue<Integer> q = new LinkedList<>();
		int[] partyCheck = new int[M];
		int[] peopleCheck = new int[N + 1];
		
		for(int i = 0; i < know.size(); i++) {
			
			q.add(know.get(i));
			peopleCheck[know.get(i)] = 1;
			
		}
		
		while(!q.isEmpty()) {
			
			int now = q.poll();
			for(int i = 0; i < M; i++) {
				
				if(partyCheck[i] == 1) continue;
				
				if(!party[i].contains(now)) continue;
				
				for(int j = 0; j < party[i].size(); j++) {
					
					if(peopleCheck[party[i].get(j)] == 1) continue;
					
					peopleCheck[party[i].get(j)] = 1;
					q.add(party[i].get(j));
				}
				
				partyCheck[i] = 1;
				answer--;
			}
		}
		
		
		System.out.println(answer);
   }
}