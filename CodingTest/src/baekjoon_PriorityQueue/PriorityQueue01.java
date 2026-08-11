package baekjoon_PriorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class PriorityQueue01 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	
	private static class flavor implements Comparable<flavor> {
		
		int a;
		int b;
		int dif;
		
		flavor(int a, int b, int dif) {
			this.a = a;
			this.b = b;
			this.dif = dif;
		}
		
		@Override
		public int compareTo(flavor o) {
			
			if(this.dif != o.dif) return this.dif - o.dif;
			return this.a - o.a;
		}
		
		
	}
	
	
	// 1715번 - 카드 정렬하기
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Long> pq = new PriorityQueue<>();
		for(int i = 0; i < N; i++) {
			pq.add(Long.parseLong(br.readLine()));
		}
		
		long ans = 0;
		while(pq.size() > 1) {
			long temp1 = pq.poll();
			long temp2 = pq.poll();
			
			ans += temp1 + temp2;
			pq.add(temp1 + temp2);
		}
		
		System.out.println(ans);
	}
	

	// 2359번 - 밥
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		PriorityQueue<flavor> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			pq.add(new flavor(A, B, A - B));
		}

		int ans = 0;
		int restDay = N - 1;
		for(int i = 0; i < N; i++) {
			
			flavor temp = pq.poll();
			
			if(temp.dif <= 0) {
				ans += temp.b;
				X -= 1000;
			}
			
			else if(X - 5000 >= restDay * 1000) {
				ans += temp.a;
				X -= 5000;
			}
			
			else {
				ans += temp.b;
				X -= 1000;
			}
			
			restDay--;
		}
		
		System.out.println(ans);
	}
	
	
	// 22254번 - 공정 컨설턴트 호석
	private static int[] present;
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		present = new int[N + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) present[i] = Integer.parseInt(st.nextToken());

		int left = 1;
		int right = N;
		
		while(left <= right) {
			int mid = (left + right) /2;
			
			if(check(mid, X, N)) right = mid - 1; 
			else left = mid + 1;
			
		}
		
		System.out.println(left);

	}
	
    public static boolean check(int mid, int X, int N) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        
        for(int i = 0; i < mid; i++) que.add(0);
 
        for(int i = 1; i <= N; i++) {
        	
            int time = que.poll();
            if(time + present[i] > X) return false;
            que.offer(time + present[i]);
        }

        return true;
    }
    
	// 27896번 - 특별한 서빙
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		int ans = 0;
		st = new StringTokenizer(br.readLine());
		
		for(int i, s = 0; N --> 0;) {
			
			i = Integer.parseInt(st.nextToken());
			pq.add(i);
			s += i;
			
			while(s >= M) {
				ans++;
				s -= pq.poll() * 2;
			}
		}
		
		System.out.println(ans);
		
		
	}
	
}
