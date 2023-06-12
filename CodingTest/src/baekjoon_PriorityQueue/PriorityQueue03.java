package baekjoon_PriorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class PriorityQueue03 {

	public static void main(String[] args) throws IOException {
		test01();
	}
	
	private static class Pair implements Comparable<Pair> {
        
		int start;
        int end;
        
        Pair(int a, int b) {
            start = a; end = b;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.end, o.end);
        }
        
    }
	
	// 13334번 - 철로
	private static ArrayList<Pair> pairs = new ArrayList<>();
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N ; i++){

			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if(a > b){
            
				int temp = a;
				a = b;
				b = temp;
				
			}

			pairs.add(new Pair(a,b));
         
		}
	

        int length = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        Collections.sort(pairs);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int count = 0;
        int maximum = 0;
        
        for (Pair pair : pairs) {
        	
            while (!pq.isEmpty() && pq.peek() < pair.end - length) {
            	
                pq.poll();
                count--;
                
            }

            if (pair.start >= pair.end - length) {
            	
                count++;
                pq.add(pair.start);
                
            }

            maximum = Math.max(maximum, count);
        }
        
        System.out.println(maximum);
	}
	
	
	
	// 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	}
	
	
	// 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	}
	
	
	
}
