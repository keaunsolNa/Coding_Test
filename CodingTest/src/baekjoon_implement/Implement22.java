package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;

public class Implement22 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 2009년
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int dd = Integer.parseInt(st.nextToken());
		int mm = Integer.parseInt(st.nextToken());
		
		
		LocalDate date = LocalDate.of(2009, mm, dd);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US));

		
	}
	
	// 피시방 알바
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		Set<Integer> set = new HashSet<>();
		int cnt = 0;
		while(N --> 0) {
			set.add(Integer.parseInt(st.nextToken()));
			cnt++;
		}
		
		System.out.println(cnt - set.size());
	}
	
	// 초6 수학
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		while(T --> 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			int gcdX = x;
			int gcdY = y;
			while(gcdX != gcdY) {
				if(gcdX > gcdY) 
					gcdX = gcdX - gcdY;
				else gcdY = gcdY - gcdX;
			} 
			
			int result = x * y;
			
			while(x != y) {
				if(x > y)
					x = x - y;
				else y = y - x;
			}
			
			int result2 = y;
			
			System.out.println(result/result2 + " " + gcdY);
		}
	}
	
	// 카드게임
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr1 = new int[10];
		for(int i = 0; i < 10; i++)arr1[i] = Integer.parseInt(st.nextToken());
	
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr2 = new int[10];
		for(int i = 0; i < 10; i++)arr2[i] = Integer.parseInt(st.nextToken());
		
		int AW = 0;
		int BW = 0;
		for(int i = 0; i < 10; i++) {
			
			if(arr1[i] > arr2[i]) AW++;
			else if(arr1[i] < arr2[i]) BW++;
		}
		
		if(AW > BW) System.out.println("A");
		else if(AW < BW) System.out.println("B");
		else System.out.println("D");
	}
	
	// 찍기 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		char[] A = {'A', 'B', 'C'};
		char[] B = {'B', 'A', 'B', 'C'};
		char[] C = {'C', 'C', 'A', 'A', 'B', 'B'};
		int AW = 0;
		int BW = 0;
		int CW = 0;
		for(int i = 0; i < N; i++) {
			
			char t = input.charAt(i);
			
			
			if(A[i%3] == t) AW++;
			if(B[i%4] == t) BW++;
			if(C[i%6] == t) CW++;
			
		}
		
		System.out.println(Math.max(AW, Math.max(CW, BW)));
		
		if (AW > BW && AW > CW) System.out.println("Adrian");
		else if (BW > CW && BW > AW) System.out.println("Bruno");
		else if (CW > AW && CW > BW) System.out.println("Goran");
		else {
			
			if(AW == BW && AW == CW) System.out.println("Adrian\nBruno\nGoran");
			else if(AW == BW && AW > CW) System.out.println("Adrian\nBruno");
			else if(AW == CW && AW > BW) System.out.println("Adrian\nGoran");
			else if(BW == CW && BW > AW) System.out.println("Bruno\nGoran");
			
		}
		
	}
	
	// 탄산 음료 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		

		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(st.nextToken());

		int sum = 0;
		int num = arr[0] + arr[1]; 
		while (num >= arr[2]) {
			
			sum += num / arr[2];
			num = num / arr[2] + num % arr[2];
			
		}
		
		System.out.println(sum);
		
	}
	
	// 숫자의 개수 2
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long A = Integer.parseInt(br.readLine());
		long B = Integer.parseInt(br.readLine());
		long C = Integer.parseInt(br.readLine());
		
		long total = A * B * C;
		
		System.out.println(countChar(total+"", '0'));
		System.out.println(countChar(total+"", '1'));
		System.out.println(countChar(total+"", '2'));
		System.out.println(countChar(total+"", '3'));
		System.out.println(countChar(total+"", '4'));
		System.out.println(countChar(total+"", '5'));
		System.out.println(countChar(total+"", '6'));
		System.out.println(countChar(total+"", '7'));
		System.out.println(countChar(total+"", '8'));
		System.out.println(countChar(total+"", '9'));
	}

	private static long countChar(String str, char ch) {
		return str.chars()
   				  .filter(c -> c == ch)
   				  .count();
	}
	
	// 오르막길
	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        int max = 0;
        int stair = 0;
        for(int i = 1; i < arr.length; i++) {
        	if(arr[i] > arr[i-1]) {
        		stair += arr[i] - arr[i-1];
        	} else {
        		if(max < stair) max = stair;
        		stair = 0;
        	}
        }
        
        if(max < stair) max = stair;
        
        System.out.println(max);
	}
	
	// 바구니 뒤집기
	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        for(int i = 1; i <= N; i++) arr[i-1] = i;
        
        for(int i = 0; i < M; i++) {
        	st = new StringTokenizer(br.readLine()," ");
        	int a = Integer.parseInt(st.nextToken()) - 1;
        	int b = Integer.parseInt(st.nextToken()) - 1;

        	
			while (a < b) {
				int temp = arr[a];
				arr[a++] = arr[b];
				arr[b--] = temp;
			}
        	
        }
        
        for (int i : arr) System.out.print(i + " ");
	}
	
	// 오르막
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String input = "";
		String answer = "Good";
		int prev = Integer.parseInt(st.nextToken());
		while(st.hasMoreTokens()) {
			int now = Integer.parseInt(st.nextToken());
			if(now < prev) {
				answer = "Bad";
				break;
			} else {
				prev = now;
			}
		}
		
		System.out.println(answer);
		
	}
	
}
