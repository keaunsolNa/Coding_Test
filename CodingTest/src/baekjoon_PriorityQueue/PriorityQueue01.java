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
	
	private static class process implements Comparable<process> {
		
		int pid;
		int needTime;
		int priority;
		
		process(int pid, int needTime, int priority) {
			this.pid = pid;
			this.needTime = needTime;
			this.priority = priority;
		}
		
		@Override
		public int compareTo(process o) {

			if(this.priority == o.priority) {
				return this.pid - o.pid;
			}
			
			return o.priority - this.priority;
		}
		
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
	
    private static class employee implements Comparable<employee>{
    	
        boolean isDeka; 
        int D;
        int H;
        int L;    

        public employee(boolean isDeka, int D, int H, int L) {
            this.isDeka = isDeka;
            this.D = D;
            this.H = H;
            this.L = L;
        }

		@Override
		public int compareTo(employee o) {
			
			if (this.D == o.D) {
				
				if(this.H == o.H) return this.L - o.L;
				
				else return o.H - this.H;
			}
			
			return o.D - this.D;
			
		}
    }
	
	// 21773번 - 가희와 프로세스 1
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		PriorityQueue<process> pq = new PriorityQueue<>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			pq.add(new process(A, B, C));
		}
		
		while(T --> 0) {
			process temp = pq.poll();
			sb.append(temp.pid + "\n");
			temp.priority -= 1;
			temp.needTime -= 1;
			
			if(temp.needTime != 0) pq.add(temp);
		}
		
		System.out.println(sb);
	}
	
	// 23843번 - 콘센트
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Integer> pq2 = new PriorityQueue<>();
		Queue<Integer> q = new LinkedList<>();
		 
		st = new StringTokenizer(br.readLine());
		while(N --> 0) pq1.add(Integer.parseInt(st.nextToken()));
		
		charge(pq1, pq2, M);
        
        int ans = 0;
        while(!pq2.isEmpty()) {
            int t = pq2.peek();

            for(int i = 0; i < M; i++) {
            	
                if(pq2.peek() - t == 0) pq2.poll();
                else q.add(pq2.poll() - t);
                
                if(pq2.isEmpty()) break;
            }

            while(!q.isEmpty()) pq2.add(q.poll());

            ans += t;

            charge(pq1, pq2, M);
        }
        
        System.out.println(ans);
	}
	
    private static void charge(PriorityQueue<Integer> pq1, PriorityQueue<Integer> pq2, int M) {
        while(pq2.size() != M) {
            if(pq1.isEmpty()) break;
            pq2.add(pq1.poll());
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
	
	// 13975번 - 파일 합치기 3
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int K = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			PriorityQueue<Long> pq = new PriorityQueue<>();
			
			while(K --> 0) pq.add(Long.parseLong(st.nextToken()));
			
			long ans = 0;
			while(pq.size() > 1) {
				long temp1 = pq.poll();
				long temp2 = pq.poll();
				
				ans += temp1 + temp2;
				pq.add(temp1 + temp2);
			}
			
			sb.append(ans + "\n");
		}
		
		System.out.println(sb);
	}

	// 14698번 - 전생했더니 슬라임 연구자였던 건에 대하여 (Hard)
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());
			PriorityQueue<Long> pq = new PriorityQueue<>();
			st = new StringTokenizer(br.readLine());
			while(N --> 0) pq.add(Long.parseLong(st.nextToken()));
			
			long ans = 1;
			
			while(pq.size() > 1) {
				long temp1 = pq.poll();
				long temp2 = pq.poll();
				long temp = temp1 * temp2;
				
				ans *= temp % 1000000007;
				ans %= 1000000007;
				
				pq.add(temp);
			}
			
			sb.append(ans + "\n");
		}
		
		System.out.println(sb);
	}
	
	// 5464번 - 주차장
	public static void test06() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] cP = new int[n + 1]; 
        int[] cW = new int[m + 1]; 
        int[] pW = new int[n + 1]; 

        int sum = 0;

        for (int i = 1; i <=n; i++) pW[i] = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <=m; i++) cW[i] = Integer.parseInt(br.readLine());
        
        Queue<Integer> queue = new LinkedList<>();

        start: for (int i = 0; i < 2 * m; i++) {
            int car = Integer.parseInt(br.readLine());

            if (car > 0) { 
                for (int j = 1; j < n + 1; j++) { 
                    if (cP[j] == 0) { 
                    	cP[j] = car; 
                        continue start;
                    }
                }
                
                queue.offer(car);
                
            } else { 
            	
                for (int j = 1; j < n + 1; j++) {
                	
                    if (cP[j] == car * (-1)) {
                    	cP[j] = 0;
                        sum += pW[j] * cW[car * (-1)];
                        if (!queue.isEmpty()) cP[j] = queue.poll();
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
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
	
	// 19640번 - 화장실의 규칙
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

        Queue<employee>[] lines = new LinkedList[M];
        for(int i = 0; i < M; i++) lines[i] = new LinkedList<employee>();
        
	
        for(int i = 0; i < N; i++) {
        	
            st = new StringTokenizer(br.readLine());

            boolean isDeka = false;
            int D = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            int L = i%M;

            if(i == K) isDeka = true;

            lines[L].add(new employee(isDeka, D, H, L));
        }

        PriorityQueue<employee> firsts = new PriorityQueue<employee>();

        for(int i = 0; i < M; i++) {
        	
            if(lines[i].size() > 0) firsts.add(lines[i].poll());
            else break;
        }
        
        int cnt = 0;
        while(true) {
        	
            ++cnt;
            employee curEmployee = firsts.poll();

            if(curEmployee.isDeka) break;

            if(lines[curEmployee.L].size() > 0) 
            	firsts.add(lines[curEmployee.L].poll());
        }

        System.out.println(cnt-1);
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
