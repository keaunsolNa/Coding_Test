import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for(int p = 0; p < N; p++) {
			
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < t; i++) pq.add(new Pair(Integer.parseInt(st.nextToken()), p));
				
		}
		
		while(!pq.isEmpty()) {
			
			sb.append((char)(pq.poll().player + 'A'));
		}
		
		System.out.println(sb);
	}

	private static class Pair implements Comparable<Pair> {
        
		int number;
        int player;
        
        Pair(int number, int player) {
        	this.number = number; 
        	this.player = player;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.number, o.number);
        }
        
    }
}
