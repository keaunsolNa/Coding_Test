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
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int res = 0;
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		List<Integer> list[] = new ArrayList[n + 1];
		
		for(int i = 0; i < n; i++) list[i] = new ArrayList<Integer>();
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			list[a].add(b);
			list[b].add(a);
		}
		
		boolean[] visited = new boolean[n];
		visited[0] = true;
		
		Queue<Integer> que = new LinkedList<>();
		que.add(0);
		int cnt = 0;
		
		while(!que.isEmpty()) {
			
			int size = que.size();
			
			for (int i = 0; i < size; i++) {
			
				int x = que.poll();
				
				for (int nowx : list[x]) {
					
					if (visited[nowx]) continue;
					visited[nowx] = true;
					res++;
					que.add(nowx);
					
				}
			}
			
			cnt++;
			if(cnt==2) break;
			
		}
		
		System.out.println(res);
	}
}
