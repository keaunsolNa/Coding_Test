package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Implement54 {
    
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	private static class runner implements Comparable<runner> {
		int number = 0;
		int time = 0;
		
		runner(int number, int time){
			this.number = number;
			this.time = time;
		}
		
		@Override
		public int compareTo(runner o) {
			
			return this.time - o.time;
		}
		
	}
	
	// 5566번 - 주사위 게임 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] map = new int[N];
		for(int i = 0; i < N; i++) map[i] = Integer.parseInt(br.readLine());

		int now = 0;
		int count = 0 ;
		for(int i = 1; i <= M; i++) {
			int roll = Integer.parseInt(br.readLine());
			
			now += roll;
			if(now >= N - 1) {
				count = i;
				break;
			}
			
			int going = map[now];
			now += going;
			
			if(now >= N - 1) {
				count = i;
				break;
			}
			
		}
		
		System.out.println(count);
	}
	
	// 10262번 - 주사위 게임
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());
		int a2 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		
		
		st = new StringTokenizer(br.readLine());
		int a3 = Integer.parseInt(st.nextToken());
		int b3 = Integer.parseInt(st.nextToken());
		int a4 = Integer.parseInt(st.nextToken());
		int b4 = Integer.parseInt(st.nextToken());
		
		int Ga = a1 + a2;
		int Gb = b1 + b2;
		int Ea = a3 + a4;
		int Eb = b3 + b4;
		
		if(Ga - Ea + Gb - Eb == 0) System.out.println("Tie");
		else if(Ga - Ea + Gb - Eb > 0) System.out.println("Gunnar");
		else System.out.println("Emma");
		
	}
	
	// 14696번 - 딱지놀이
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int aa = 0;
			int ab = 0;
			int ac = 0;
			int ad = 0;
			
			for(int i = 0; i < a; i++) {
				
				int temp = Integer.parseInt(st.nextToken());
				
				if(temp == 4) aa++;
				else if(temp == 3) ab++;
				else if(temp == 2) ac++;
				else ad++;
				
			}
			
			st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			int ba = 0;
			int bb = 0;
			int bc = 0;
			int bd = 0;
			
			for(int i = 0; i < b; i++) {
				
				int temp = Integer.parseInt(st.nextToken());
				
				if(temp == 4) ba++;
				else if(temp == 3) bb++;
				else if(temp == 2) bc++;
				else bd++;
				
			}
			
			String answer = aa > ba ? "A" : aa < ba ? "B"
						   : ab > bb ? "A" : ab < bb ? "B"
						   : ac > bc ? "A" : ac < bc ? "B"
						   : ad > bd ? "A" : ad < bd ? "B" : "D";
		
			System.out.println(answer);
		}
	}
	
	// 24399번 - 알고리즘 수업 - 선택 알고리즘 2
	private static int N;
	private static int Q;
	private static int K;
	private static int[] A;
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		Q = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		A = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
		
		select(0, N - 1, Q);
		
		System.out.println(-1);
		
	}
	
	public static int select(int p, int r, int q) {
	    if (p == r) return A[p];  

	    int t = partition(p, r);  
	    int k = t - p + 1;           
	    
	    if (q < k) return select(p, t - 1, q);  
	    else if (q == k) return A[t];          
	    else return select(t + 1, r, q - k);  
	    
	}

	public static int partition(int p, int r) {
		
	    int x = A[r];  
	    int i = p - 1; 

	    for (int j = p; j < r; j++) {
	    	
	        if (A[j] <= x) {
	            i++;
	            swap2(i, j);
	        }
	    }
	    
	    if(i + 1 != r) {
	    	swap2(i + 1, r);
	    }
	    return i + 1;
	    
	}

	public static void swap(int i, int j) {

		K--;
	    int temp = A[i];
	    A[i] = A[j];
	    A[j] = temp;
	    
	    if(K == 0) {
	    	
	    	System.out.println(Math.min(A[i], A[j]) + " " + Math.max(A[i], A[j]));
	    	
	    	System.exit(0);
	    	
	    }
	}
	
	// 24398번 - 알고리즘 수업 - 선택 알고리즘 1
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		Q = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		A = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
		
		select(0, N - 1, Q);
		
		System.out.println(-1);
	}

	public static void swap2(int i, int j) {

		if(K > 0) {
			K--;
			int temp = A[i];
			A[i] = A[j];
			A[j] = temp;
		}
	    
	    if(K == 0) {
	    	
	    	System.out.println(Math.min(A[i], A[j]) + " " + Math.max(A[i], A[j]));
	    	System.exit(0);
	    	
	    }
	}
	
	// 9339번 - 마라토너
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int K = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			PriorityQueue<runner> pq = new PriorityQueue<>();
			List<Integer> runner = new ArrayList<>();
			
			for(int i = 0; i < K; i++) runner.add(Integer.parseInt(st.nextToken()));
			
			int N = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < N; i++) {
				
				st = new StringTokenizer(br.readLine());
				
				int number = Integer.parseInt(st.nextToken());
				int t = Integer.parseInt(st.nextToken());
				int m = Integer.parseInt(st.nextToken());
				
				int time = t * 60 + m;
				
				if(time > 0 && time <= 360 && runner.contains(number)) {
					pq.add(new runner(number, time));
				}
			}
			
			System.out.println(pq.peek().number + " " +  pq.size());
		}
	}
	
	// 12353번 - Dr. Spaceman의 특별한 알고리즘
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		char BG;
		String F;
		String M;
		int f;
		String i;
		int I;
		int Ftall;
		int Mtall;
		int Ctall;
		boolean odd;
		
		int T = Integer.parseInt(br.readLine());
		for(int t = 1; t <= T; t++) {
			
			st = new StringTokenizer(br.readLine());
			BG = st.nextToken().charAt(0);
			F = st.nextToken();
			M = st.nextToken();
			
			f = Integer.parseInt(F.split("'")[0]);
			i = F.split("'")[1];
			I = Integer.parseInt(i.substring(0, i.length() - 1));
			Ftall = f * 12 + I;

			f = Integer.parseInt(M.split("'")[0]);
			i = M.split("'")[1];
			I = Integer.parseInt(i.substring(0, i.length() - 1));
			Mtall = f * 12 + I;;

			Ctall = Ftall + Mtall + (BG == 'G' ? -5 : 5);
			
			odd = ((Ctall & 1) == 1) ? true : false;
			Ctall /= 2;
			
			System.out.print("Case #" + t + ": ");
			
			if(odd) {
				
				print(Ctall - 3);
                System.out.print(" to ");
                print(Ctall + 4);
                System.out.println();
                
			} else {
				
				print(Ctall - 4);
				System.out.print(" to ");
				print(Ctall + 4);
				System.out.println();
			}
		}
	}
	
	public static void print(int x) {
		
		System.out.print(x / 12 + "'" + x % 12 + "\"");
	}
	
	// 4108번 - 지뢰찾기
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			int R = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			if(R == 0 && C == 0) break;
			
			int[][]map = new int[R][C];
			
			for(int i = 0; i < R; i++) {
				
				input = br.readLine();
				for(int j = 0; j < C; j++) 
					map[i][j] = (input.charAt(j) == '*') ? -1 : 0;
			}
			
			for(int x = 0; x < R; x++) {
				
				for(int y = 0; y < C; y++) {
					
					if(map[x][y] == -1) continue;
					if(x - 1 >= 0 && map[x - 1][y] == -1) map[x][y]++;
					if(x - 1 >= 0 && y - 1 >= 0 && map[x - 1][y - 1] == -1) map[x][y]++;
					if(x - 1 >= 0 && y + 1 < C && map[x - 1][y + 1] == -1) map[x][y]++;
					if(y - 1 >= 0 && map[x][y - 1] == -1) map[x][y]++;
					if(y + 1 < C && map[x][y + 1] == -1) map[x][y]++;
					if(x + 1 < R && map[x + 1][y] == -1) map[x][y]++;
					if(x + 1 < R && y - 1 >= 0 && map[x + 1][y - 1] == -1) map[x][y]++;
					if(x + 1 < R && y + 1 < C && map[x + 1][y + 1] == -1) map[x][y]++;
				}
			}
			
			for(int x = 0; x < R; x++) {
				
				for(int y = 0; y < C; y++) {
					
					System.out.print(map[x][y] == -1 ? "*" : map[x][y]);
				}
				System.out.println();
			}
			
		}
		
	}
	
	// 1384번 - 메시지
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		
		int idx = 1;
		while(true) {
			
			sb = new StringBuilder();
			
			sb.append("Group " + idx + "\n");
			int N = Integer.parseInt(br.readLine());
			if(N == 0) break;
			
			String list[][] = new String[N][N];
			 
            for (int i = 0; i < N; i++) {
                String str[] = br.readLine().split(" ");
                list[i] = str;
            }
 
            int CR = 0;
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
 
                    if (list[i][j].equals("N")) {
 
                        CR = i - j;
                        if (CR < 0) CR += N;
 
                        sb.append(list[CR][0] + " was nasty about " + list[i][0] + "\n");
                        cnt++;
                    }
                }
            }
            
            if(cnt == 0) sb.append("Nobody was nasty"+"\n");
            
            System.out.println(sb);
			idx++;
		}
		
		
	}
	
	// 13015번 - 별 찍기 - 23
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int a = 0; 
		int b = N - 1;
		int c = 3 * N - 3;
		int d = 4 * N - 4;
		
		for (int i = 1; i < 2 * N; ++i) {
			
	        if (i == 1 || i == (2 * N) - 1) {
	        	
	            for (int j = a; j <= b; j++) System.out.print("*");
	            for (int j = b + 1; j < c; j++) System.out.print(" ");
	            for (int j = c; j <= d; j++) System.out.print("*");
	        }
	        
	        else {
	        	
	            for (int j = 0; j < a; j++) System.out.print(" ");
	            System.out.print("*"); 
	            for (int j = a + 1; j < b; j++) System.out.print(" ");
	            System.out.print("*"); 
	            for (int j = b + 1; j < c; j++) System.out.print(" ");
	            if(b != c) System.out.print("*"); 
	            for (int j = c + 1; j < d; j++) System.out.print(" ");
	            System.out.print("*");
	        }
	        System.out.println();
	 
	 
	        if (i < N) {
	            a++; b++; c--; d--;
	        }
	        else {
	            a--; b--; c++; d++;
	        }
	    }
	}
	
	
	
}
