import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

    public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());	

		while (T-- > 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			LinkedList<int[]> importantQueue = new LinkedList<>();	
			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < N; i++) {
				importantQueue.add(new int[] { i, Integer.parseInt(st.nextToken()) });
			}
			
			int count = 0;	
			
			while (!importantQueue.isEmpty()) {	
				
				int[] front = importantQueue.poll();	
				boolean isMax = true;	
				
				for(int i = 0; i < importantQueue.size(); i++) {
					
					if(front[1] < importantQueue.get(i)[1]) {
						
						importantQueue.add(front);
						for(int j = 0; j < i; j++) {
							importantQueue.add(importantQueue.poll());
						}
						
						isMax = false;
						break;
					}
				}
				
				if(isMax == false) {
					continue;
				}
				
				count++;
				if(front[0] == M) {	
					break;
				}

			}

			sb.append(count).append('\n');

		}
		System.out.println(sb);
	}
}
