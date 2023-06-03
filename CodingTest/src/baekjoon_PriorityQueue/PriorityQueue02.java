package baekjoon_PriorityQueue;

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

public class PriorityQueue02 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	private static class Assignment implements Comparable<Assignment> {
		
		int day;
		int point;
		
		Assignment(int day, int point) {
			this.day = day;
			this.point = point;
		}
		
		@Override
		public int compareTo(Assignment o) {

			if(this.point == o.point) {
				return this.day - o.day;
			}
			
			return o.point - this.point;
		}
		
	}
	
	private static class Point implements Comparable<Point> {
		
		int idx;
		int basepoint;
		int upPoint;
		
		Point(int idx, int basePoint, int upPoint) {
			this.idx = idx;
			this.basepoint = basePoint;
			this.upPoint = upPoint;
		}

		@Override
		public int compareTo(Point o) {
			
			return Math.min(100	- o.basepoint, o.upPoint) - Math.min(100 - this.basepoint, this.upPoint);
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
	
	private static class Jewelry {
		
		int m;
		int v;
		
		Jewelry(int m, int v) {
			this.m = m;
			this.v = v;
		}
		
	}
	
	private static class GasStation implements Comparable<GasStation> {
		
		int distance;
		int canFill;
		
		GasStation(int distance, int canFill) {
			this.distance = distance;
			this.canFill = canFill;
		}

		@Override
		public int compareTo(GasStation o) {
			
			return this.distance - o.distance;
		}
		
		
	}
	
	// 13904번 - 과제
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	
		int N = Integer.parseInt(br.readLine());
		List<Assignment> list = new ArrayList<>();
		
		int maxD = 0;
		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			
			int d = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			list.add(new Assignment(d, w));
			maxD = Math.max(maxD, d);
			
		}
		
		int answer = 0;
		for(int i = maxD; i > 0; i--) answer += solve(list, i);
		
		
		System.out.println(answer);
	}
	
	public static int solve(List<Assignment> assignmentList, int now) {
	
		int idx = -1;
	    int result = 0;
	    
	    for (int i = 0; i < assignmentList.size(); i++) {
	    
	    	if (assignmentList.get(i).day >= now && result < assignmentList.get(i).point) {
	    		idx = i;
	    		result = assignmentList.get(i).point;
	    	}
	    }
	    
	    if (result == 0) return 0;

	    assignmentList.remove(idx);
	    return result;
	  
	}
	
	// 2109번 - 순회강연
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	
		int N = Integer.parseInt(br.readLine());
		List<Assignment> list = new ArrayList<>();
		
		int maxD = 0;
		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			
			int w = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			list.add(new Assignment(d, w));
			maxD = Math.max(maxD, d);
			
		}
		
		int answer = 0;
		for(int i = maxD; i > 0; i--) answer += solve(list, i);
		
		
		System.out.println(answer);
	}
	
	// 23254번 - 나는 기말고사형 인간이야
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int totalTime = N * 24;
		
		int[] basePoint = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) basePoint[i] = Integer.parseInt(st.nextToken());
		
		int[] upPoint = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) upPoint[i] = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Point> pq = new PriorityQueue<>();
		for(int i = 0; i < M; i++) pq.add(new Point(i, basePoint[i], upPoint[i]));

		while(!pq.isEmpty()) {
			
			Point p = pq.poll();
			p.basepoint += p.upPoint;
			
			if(p.basepoint < 100) pq.add(p);
			else basePoint[p.idx] = 100;
			totalTime--;
			
			if(totalTime == 0) {
				while(!pq.isEmpty()) {
					Point pp = pq.poll();
					basePoint[pp.idx] = pp.basepoint;
				}
				break;
			}
			
		}
		
		int total = 0;
		for (int point : basePoint) total += point > 100 ? 100 : point;
			
		System.out.println(total);
	}
	
	// 22252번 - 정보 상인 호석
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int Q = Integer.parseInt(br.readLine());
		Map<String, PriorityQueue<Integer>> map = new HashMap<>();
		long answer = 0;
		
		while(Q --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int number = Integer.parseInt(st.nextToken());
			
			String name = st.nextToken();
			int count = Integer.parseInt(st.nextToken());
			
			if(number == 1) {
				
				for(int i = 0; i < count; i++) {
					
					if(map.containsKey(name)) map.get(name).add(Integer.parseInt(st.nextToken()));
					
					else {
						
						PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
						pq.add(Integer.parseInt(st.nextToken()));
						map.put(name, pq);
						
					}
				}
				
			}
			
			else {
				
				if(map.containsKey(name)) {
					
					while(!map.get(name).isEmpty() && count > 0) {
						answer += map.get(name).poll();
						count--;
					}
				}
			}
		}
		
		System.out.println(answer);
	}

	// 14622번 - 소수 게임
	private static boolean[] isPrime;
	public static void test05() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        sieve(5000000);
        boolean[] visited = new boolean[5000001];
        
        long dw = 0;
        long gs = 0; 
        
        PriorityQueue<Integer> dws = new PriorityQueue<>(); 
        PriorityQueue<Integer> gss = new PriorityQueue<>();
        
        for (int i = 0; i < N; i++) {
        	
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            
            if (!isPrime[d]) {
            	
                if (gss.size() == 3) gs += gss.peek();
                else gs += 1000;
                
            }
            
            else if (visited[d]) dw -= 1000;
            
            else {
            	
                visited[d] = true;
                if (dws.size() < 3) dws.offer(d);
                
                else {
                	
                    if (dws.peek() < d) {
                        dws.poll();
                        dws.add(d);
                    }
                    
                }
            }
            
            if (!isPrime[g]) {

            	if (dws.size() == 3) dw += dws.peek();
                else dw += 1000;
            	
            }
            
            else if (visited[g]) gs -= 1000;
            
            else {
            	
                visited[g] = true;
                
                if (gss.size() < 3) gss.offer(g);
                
                else {
                	
                    if (gss.peek() < g) {
                        gss.poll();
                        gss.add(g);
                    }
                    
                }
            }
        }
        
        if (dw > gs) System.out.println("소수의 신 갓대웅");
        else if (dw < gs) System.out.println("소수 마스터 갓규성");
        else System.out.println("우열을 가릴 수 없음");
        
	}
	
	// 에라토스테네스의 체
	private static void sieve(int N) {
		
        isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j < N + 1; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
    
	// 25101번 - Robin Hood
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
	
	// 15577번 - Prosjek 
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Double> pq = new PriorityQueue<>();
		while(N --> 0) pq.add(Double.parseDouble(br.readLine()));
		
		while(pq.size() != 1) {
			
			Double first = pq.poll();
			Double second = pq.poll();
			pq.add((first + second) / 2);
			
		}
		
		System.out.printf("%.6f", pq.poll());
	}
	
	// 1202번 - 보석 도둑
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Jewelry[] jewelries = new Jewelry[N];
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			jewelries[i] = new Jewelry(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			
		}
		
        Arrays.sort(jewelries, new Comparator<Jewelry>() {
        	 
            @Override
            public int compare(Jewelry o1, Jewelry o2) {
                if (o1.m == o2.m) {
                    return o2.v - o1.v;
                }
                return o1.m - o2.m;
            }
 
        });
		
        int[] pack = new int[K];
        for (int i = 0; i < K; i++) pack[i] = Integer.parseInt(br.readLine());
        Arrays.sort(pack);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        long ans = 0;
        for (int i = 0, j = 0; i < K; i++) {
        	
            while (j < N && jewelries[j].m <= pack[i]) pq.offer(jewelries[j++].v);
            if (!pq.isEmpty()) ans += pq.poll();
            
        }
		
		System.out.println(ans);
	}
	
	// 27315번 - 틀리는 건 싫으니까 쉬운 문제에 올인하려고 합니다
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
        PriorityQueue<int[]> question = new PriorityQueue<>(new Comparator<int[]>() {
        	
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        
        while (N --> 0) {
        	
            st = new StringTokenizer(br.readLine());
            int D = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int T = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            
            if (T == 1) P = 0;
            
            question.add(E == 1 ? new int[]{D / 2 + D % 2, P / 2} : new int[]{D, P});
            
        }
        
        st = new StringTokenizer(br.readLine());
        int hd = Integer.parseInt(st.nextToken());
        int hp = Integer.parseInt(st.nextToken());
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long ans = 0;
        
        while (M --> 0) {
            while (!question.isEmpty() && question.peek()[0] <= hd) pq.add(question.poll()[1]);
            
            if (pq.isEmpty()) { 
            	
            	System.out.println(-1); 
            	System.exit(0); 
            	
        	}
            
            int p = pq.poll();
            if (p > hp) ans += p-hp;
            hd += 1; 
            hp += 1;
            
        }
        
        System.out.println(ans);
	}
	
	// 1826번 - 연료 채우기
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<GasStation> pq = new PriorityQueue<>();
		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken()); 
			
			pq.add(new GasStation(a, b));
		}
		
		st = new StringTokenizer(br.readLine());
		int L = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
	
		PriorityQueue<Integer> fuels = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        
        while (P < L) {
            
        	while (!pq.isEmpty() && pq.peek().distance <= P) fuels.add(pq.poll().canFill);
            

            if (fuels.isEmpty()) {
                System.out.println(-1);
                return;
            }

            answer++;
            P += fuels.poll();
    
        }

        System.out.println(answer);
		
	}
	
	
}
