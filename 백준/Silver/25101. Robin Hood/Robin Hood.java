import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		PriorityQueue<Money> pq = new PriorityQueue<>();
		for(int i = 0; i < N; i++) pq.add(new Money(i, Integer.parseInt(st.nextToken())));

		boolean flag = true;
		while(K --> 0) {
			
			int idx = pq.peek().idx;
			int target = pq.poll().money;
			
			if(target - 100 > 0) pq.add(new Money(idx, target - 100));
			
			else {
				flag = false;
				break;
			}
		}
		
		if(K > 0 || !flag) System.out.println("impossible");
		else {
			
			int[] money = new int[N];
			
			while(!pq.isEmpty()) money[pq.peek().idx] = pq.poll().money;
			
			for(int i = 0; i < N - 1; i++) System.out.print(money[i] + " ");
			System.out.print(money[N - 1]);
			
		}
	}

	private static class Money implements Comparable<Money> {
		
		int idx;
		int money;
		
		Money(int idx, int money) {
			this.idx = idx;
			this.money = money;
		}

		@Override
		public int compareTo(Money o) {
			
			if(o.money == this.money) return this.idx - o.idx;
			return o.money - this.money;
		}
		
		
	}
}
