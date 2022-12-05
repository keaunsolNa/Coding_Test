package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Implement13 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 세 수
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		if(A + B == C) {
			System.out.println(A + "+" + B + "=" + C);
		} else if(A - B == C) {
			System.out.println(A + "-" + B + "=" + C);
		} else if(A * B == C) {
			System.out.println(A + "*" + B + "=" + C);
		} else if(A / B == C) {
			System.out.println(A + "/" + B + "=" + C);
		} else if(A == B + C) {
			System.out.println(A + "=" + B + "+" + C);
		} else if(A == B - C) {
			System.out.println(A + "=" + B + "-" + C);
		} else if(A == B * C) {
			System.out.println(A + "=" + B + "*" + C);
		} else if(A == B / C) {
			System.out.println(A + "=" + B + "/" + C);
		}
	}
	
	// 양수 개수 세기
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] numberArr = br.readLine().split(" ");
		int answer = 0;
		for(int i = 0; i < numberArr.length; i++) {
			if(Integer.parseInt(numberArr[i]) > 0) {
				answer++;
			}
		}
		System.out.println(answer);
		
	}
	
	// 헬멧과 조끼
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int halmet = 0;
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(halmet < temp) halmet = temp;
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int armor = 0;
		for(int i = 0; i < M; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(armor < temp) armor = temp;
		}
		
		System.out.println(halmet + armor);
		
	}
	
	// 고급 여관
	public static void test04() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		int pAA = Integer.parseInt(st.nextToken());
		int pAL = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int pBA = Integer.parseInt(st.nextToken());
		int pBL = Integer.parseInt(st.nextToken());
		
		while(pAL > 0 && pBL > 0) {
			pAL -= pBA;
			pBL -= pAA;
		}
		
		if(pAL > 0) {
			System.out.println("PLAYER A");
		} else if(pBL > 0) {
			System.out.println("PLAYER B");
		} else {
			System.out.println("DRAW");
		}
		
	}
	
	// 줄 세기
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		int cnt = 0;
		while((input = br.readLine()) != null) {
			cnt++;
		}
		System.out.println(cnt);
	}
	
	// 스트릿 코딩 파이터
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int T = Integer.parseInt(br.readLine());
		
		int winner = 0;
		for(int i = 0; i < T; i++) {
			
			int max = 0;
			for(int j = 0; j < 3; j++) {
				st = new StringTokenizer(br.readLine());
				
				max += Integer.parseInt(st.nextToken()) * A;
				max += Integer.parseInt(st.nextToken()) * B;
				max += Integer.parseInt(st.nextToken()) * C;
			}
			
			if(max > winner) winner = max;
		}
		
		System.out.println(winner);
	}
	
	// 중간계 전쟁
	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < T; i++) {
			int good = 0;
			int evil = 0; 
			st = new StringTokenizer(br.readLine());
			
			good += Integer.parseInt(st.nextToken()) * 1;
			good += Integer.parseInt(st.nextToken()) * 2;
			good += Integer.parseInt(st.nextToken()) * 3;
			good += Integer.parseInt(st.nextToken()) * 3;
			good += Integer.parseInt(st.nextToken()) * 4;
			good += Integer.parseInt(st.nextToken()) * 10;
					
			st = new StringTokenizer(br.readLine());
			
			evil += Integer.parseInt(st.nextToken()) * 1;
			evil += Integer.parseInt(st.nextToken()) * 2;
			evil += Integer.parseInt(st.nextToken()) * 2;
			evil += Integer.parseInt(st.nextToken()) * 2;
			evil += Integer.parseInt(st.nextToken()) * 3;
			evil += Integer.parseInt(st.nextToken()) * 5;
			evil += Integer.parseInt(st.nextToken()) * 10;
			
			if(good > evil) {
				System.out.println("Battle " + (i+1) + ": Good triumphs over Evil" );
			} else if(good < evil) {
				System.out.println("Battle " + (i+1) + ": Evil eradicates all trace of Good" );
			} else {
				System.out.println("Battle " + (i+1) + ": No victor on this battle field" );
			}
		}
		
	}
	
	// 꿍의 우주여행
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int N = Integer.parseInt(st.nextToken());
        	int D = Integer.parseInt(st.nextToken());
        	int answer = 0;
        	
        	for(int j = 0; j < N; j++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		double V = Integer.parseInt(st.nextToken());
        		double F = Integer.parseInt(st.nextToken());
        		double C = Integer.parseInt(st.nextToken());
        		
        		double FC = F / C;
        		double TV = FC * V;
        		if(TV >= D) {
        			answer++;
        		}
        	}
        	System.out.println(answer);
        }
        
	}
	
	// 삼각수의 합
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	int n = Integer.parseInt(br.readLine());
        	int total = 0;
        	
            for (int j = 1; j <= n; j++) {
                total += j * (j + 1) * (j + 2) / 2;
            }
            
            System.out.println(total);
        }
	}
	
	// 미국 스타일
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String[] temp = br.readLine().split(" ");
			double target = Double.parseDouble(temp[0]);
			String unit = temp[1];
			StringBuilder sb = new StringBuilder();
			switch(unit) {
				case "kg" : 
					target *= 2.2046;
					unit = "lb";
					break;
				case "lb" :
					target *= 0.4536;
					unit = "kg";
					break;
				case "l"  :
					target *= 0.2642;
					unit = "g";
					break;
				case "g"  :
					target *= 3.7854;
					unit = "l";
					break;
			}
			
			System.out.printf("%.4f", target);
			System.out.println(" " + unit);
		}
	}
	
}
