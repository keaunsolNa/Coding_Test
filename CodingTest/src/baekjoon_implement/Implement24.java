package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement24 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 골뱅이 찍기 - 돌아간 ㄹ
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < 3 * N; i++) sb.append("@");
			for(int i = 0; i < N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
			
		}
		
		for(int j = 0; j < 3 * N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
			
		}
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < N; i++) sb.append(" ");
			for(int i = 0; i < 3 * N; i++) sb.append("@");
			sb.append("\n");
			
		}
		System.out.println(sb);
	}
	
	// 골뱅이 찍기 - 돌아간 ㅈ
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");

		}
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 2 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
			
		}
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < 3 * N; i++) sb.append("@");
			sb.append("\n");
			
		}
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 2 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");
			
		}
		
		for(int j = 0; j < N; j++) {
			
			for(int i = 0; i < N; i++) sb.append("@");
			for(int i = 0; i < 3 * N; i++) sb.append(" ");
			for(int i = 0; i < N; i++) sb.append("@");
			sb.append("\n");

		}
		
		System.out.println(sb);
		
	}
	
	// 싱기한 네자리 숫자
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for(int i = 2992; i < 10000; i++) {
			String A = Integer.toString(i, 10);
			int sumA = 0;
			for(int j = 0; j < A.length(); j++) sumA += Character.getNumericValue(A.charAt(j));
			String B = Integer.toString(i, 12);
			int sumB = 0; 
			for(int j = 0; j < B.length(); j++) {
				switch(B.charAt(j)) {
					case 'a' : sumB += 10; break;
					case 'b' : sumB += 11; break;
					default : sumB += Character.getNumericValue(B.charAt(j));
				}
			}
			
			if(sumA != sumB) continue;
			String C = Integer.toString(i, 16);
			int sumC = 0;
			for(int j = 0; j < C.length(); j++) {
				switch(C.charAt(j)) {
					case 'a' : sumC += 10; break;
					case 'b' : sumC += 11; break;
					case 'c' : sumC += 12; break;
					case 'd' : sumC += 13; break;
					case 'e' : sumC += 14; break;
					case 'f' : sumC += 15; break;
					default : sumC += Character.getNumericValue(C.charAt(j));
				}
			}
			
			if(sumB == sumC) sb.append(i).append("\n");
		}
		
		System.out.println(sb);
	}
	
	// CTP공국으로 이민 가자
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" ");
			int QA = Integer.parseInt(input[0]);
			String Q = input[1];
			
			if(Q.equals("N")) {
				
				String[] number = br.readLine().split(" ");
				
				for(int j = 0; j < QA; j++) {
					char temp =  (char)(Integer.parseInt(number[j]) + 64);
					sb.append(temp + " ");
				}
				
				sb.append("\n");
				
			} else {
				
				String[] number = br.readLine().split(" ");
				for(int j = 0; j < QA; j++) 
					sb.append((int)number[j].charAt(0) - 64).append(" ");
				
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	// 헤일스톤 수열 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int N = Integer.parseInt(br.readLine());
			
			int max = N;
			while(N != 1) {
				if(N % 2 == 0) {
					N /= 2;
					if(max < N) max = N;
				} else {
					N = N*3 + 1;
					if(max < N) max = N;
				}
			}
			
			System.out.println(max);
		}
	}
	
	// 이교수님의 시험
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());
		int[] result = new int[10];

		for(int i = 1; i <= 10; i++) result[i-1] = ((i - 1) % 5) + 1;
		
		for(int i = 0; i < num; i++) {
		
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int count = 0;
			
			for(int j = 0; j < 10; j++) {
				if(Integer.parseInt(st.nextToken()) == result[j]) count++;
			}
			
			if(count == 10) sb.append(i + 1).append("\n");
		}
		
		System.out.print(sb);
		
	}
	
	// 양념 반 후라이드 반
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		
		int price = 0;
		if(A + B > C * 2) {
			price += C * 2 * Math.min(X, Y);
			if(X > Y) { 
				if(C * 2 < A) price += C * 2 * (X - Y);
				else price += (X - Y) * A;
			}
			else {
				if(C * 2 < B) price += C * 2 * (Y - X);
				else price += (Y - X) * B;
			}
		}
		else {
			price += A*X + B*Y;
		}
		
		System.out.println(price);
	}
	
	// 치킨 쿠폰
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String input = br.readLine();
            if (input == null) break;
            String[] inputs = input.split(" ");
            
            int n = Integer.parseInt(inputs[0]);
            int k = Integer.parseInt(inputs[1]);
            
            System.out.println(solve(n, 0, k));

        }
        
	}	
	
    private static int solve(int coupon, int ordered, int k) {
        if (coupon < k) return ordered + coupon;
        
        return solve((coupon / k) + (coupon % k), ordered + (coupon - coupon % k), k);
    }
    
	// 쿼리 맛보기
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        long[] arr = new long[n];
        long[] ans = new long[m];
        
        st = new StringTokenizer(br.readLine());
        int idx = 0;
        while(st.hasMoreTokens()){
            arr[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }
        
        for(int i = 0; i < m; i++){
            StringTokenizer queryst = new StringTokenizer(br.readLine());
            String qr = queryst.nextToken();
            
            if("1".equals(qr)){
            	
                long a = Integer.parseInt(queryst.nextToken());
                long b = Integer.parseInt(queryst.nextToken());
                
                long sum = 0;
                long temp;
        
                for(long j = a - 1; j <= b - 1; j++) sum += arr[(int)j];
        
                temp = arr[(int)a - 1];
                arr[(int)a - 1] = arr[(int)b - 1];
                arr[(int)b - 1] = temp;
        
                ans[i] = sum;
            }
            
            else if("2".equals(qr)){
            	
                long a = Integer.parseInt(queryst.nextToken());
                long b = Integer.parseInt(queryst.nextToken());
                long c = Integer.parseInt(queryst.nextToken());
                long d = Integer.parseInt(queryst.nextToken());
                
                long sum1 = 0;
                long sum2 = 0;
        
                for(long j = a - 1; j <= b - 1; j++) sum1 += arr[(int)j];
                for(long j = c - 1; j <= d - 1; j++) sum2 += arr[(int)j];
        
                ans[i] = sum1 - sum2;
            }
        }  
        
        for(int i = 0; i < m; i++) System.out.println(ans[i]);
	
	}
	
	// 욱제는 건축왕이야!!
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int x0 = x;
		int y0 = y;
		long ans = 0;
		for(int i = 0; i < N - 1; i++) {
			
			st = new StringTokenizer(br.readLine());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			double len = Math.sqrt(Math.pow(Math.abs(x2 - x) - Math.abs(y2 - y), 2));
			
			x = x2;
			y = y2;
		
			ans += len;
		}
		
		ans += Math.sqrt(Math.pow(Math.abs(x - x0) - Math.abs(y - y0), 2));
		
		System.out.println(ans);
	}
	
	
	
}
