package baekjoon_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Greedy02 {
	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 수들의 합
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long S = Long.parseLong(br.readLine());

		int answer = sum(S);
		
		System.out.println(answer);
		
	}
	
	public static int sum(long S) {
		long sum = 0;
		int idx = 0;
		int N = 0;
		
		while(true) {
			sum += ++idx;
			
			if (sum > S) {
				return N;
			}
			N++;
		}
	}
	
	// UCPC는 무엇의 약자일까?
	public static void test02() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
        char[] ucpc = {'U', 'C', 'P', 'C'};
        int index = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ucpc[index]) {
                index++;
            }

            if(index == 4) {
            	break;
            }
        }
        
        if(index == 4) {
        	System.out.println("I love UCPC"); 
        } else {
        	System.out.println("I hate UCPC");
        }
		
	}
	
    
	// 소가 길을 건너간 이유 3 
	public static void test03() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
        cows = new Cow[N];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            cows[i] = new Cow(Integer.parseInt(st.nextToken()), 
                    Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(cows);
        
        int time = cows[0].arrive;
        
        for (int i = 0; i < N; i++) {
            // 바로 검문을 받을 수 있는데, 소가 늦게 도착할 경우
            if(time < cows[i].arrive) time = cows[i].arrive;
            
            time += cows[i].check;
        }
        
        System.out.println(time);
        
	}

	static int N;
	static Cow[] cows;
	public static class Cow implements Comparable<Cow>{
        int arrive, check;
        
        public Cow(int arrive, int check) {
            super();
            this.arrive = arrive;
            this.check = check;
        }
 
        @Override
        public int compareTo(Cow o) {
            return Integer.compare(this.arrive, o.arrive);
        }
	}
	
	// 컵홀더
	public static void test04() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String seat = br.readLine().replaceAll("LL", "L");
		
		if(N <= seat.length()+1) {
			System.out.println(N);
		} else {
			System.out.println(seat.length()+1);
		}
		
		
	}
    
	// 한조서열정리하고옴ㅋㅋ
	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] peekArr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			peekArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int maxKill = 0;
		for(int i = 0; i < N-1; i++) {
			int kill = 0;
			for(int j = i+1; j < N; j++) {
				
				if(peekArr[i] < peekArr[j]) {
					break;
				} else {
					kill++;
				}
			}
			if(kill > maxKill) maxKill = kill;
		}
		
		System.out.println(maxKill);
	}
	
	// 폴리오미노
	public static void test06() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String board = br.readLine();  

		board = board.replaceAll("XXXX", "AAAA");
		board = board.replaceAll("XX", "BB");
		
		if(board.contains("X")) {
			System.out.println(-1);
		} else {
			System.out.println(board);
		}
	}

	// 라디오
	public static void test07() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		 
		int N = Integer.parseInt(br.readLine());
		int[] bookmark = new int[N];
		int maxTerm = 10000;
		for(int i = 0; i < N; i++) {
			bookmark[i] = Integer.parseInt(br.readLine());
			if(maxTerm > Math.abs(bookmark[i] - B)) maxTerm = Math.abs(bookmark[i] - B);
		}
		
		if(Math.abs(A - B) <= maxTerm) {
			System.out.println(Math.abs(A - B));
		} else {
			System.out.println(maxTerm+1);
		}
		
	}

	// 최대 상승
	public static void test08() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int answer = 0;
        int min = Integer.MAX_VALUE;
        
        while (n--> 0) {
            int temp = Integer.parseInt(st.nextToken());
            answer = Math.max(answer, temp - min);
            min = Math.min(min, temp);
        }
        
        System.out.println(answer);
	}

	// ATM
	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] point = new int[N];

		for(int i= 0; i < N; i++) {
			point[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(point);
		 
		int prev = 0;
		int total = 0;
		for(int i = 0; i < N; i++){
			total += prev + point[i];
			prev += point[i];
		}
		
		System.out.println(total);
		
	}
	

	// 포인트 카드
	public static void test10() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] token = new int[N];
		for(int i = 0; i < N; i++) {
			token[i] = Integer.parseInt(br.readLine());
		}
		
		int maxT = 0;
		int maxAmount = 0;
		while(true) {
			for(int i = 0; i < N; i++) {
				if(token[i] <= K) {
					maxT = token[i];
				} else break;
			}
			int count  = K/maxT;
			
			K = K%maxT;
			maxAmount += count;
			
			if(K == 0) break;
		}
		
		System.out.println(maxAmount);
	}
	
	
}