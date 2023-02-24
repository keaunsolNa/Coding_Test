package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Implement48 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 27541번 - 末尾の文字 (Last Letter)
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		if(input.endsWith("G")) System.out.println(input.substring(0, T - 1));
		else System.out.println(input + "G");
	}
	
	// 14041번 - Arrival Time
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		
		int HH = Integer.parseInt(st.nextToken());
		int MM = Integer.parseInt(st.nextToken());
		
		int time = HH * 60 + MM;
		
	    for (int i = 0; i < 120; i++) {
	    	
	    	if ((time >= 420 && time < 600) || (time >= 900 && time < 1140)) time += 2;
	    	else time++;
	    	
	    	time %= 1440;
	    	
	    }
	    
	    String H = (time / 60 < 10) ? "0" + (time / 60) : (time / 60) + "";
	    String M = (time % 60 < 10) ? "0" + (time % 60) : (time % 60) + "";
	    System.out.println(H + ":" + M);
	}
	
	// 16503번 - 괄호 없는 사칙연산
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		String oper1 = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		String oper2 = st.nextToken();
		int C = Integer.parseInt(st.nextToken());
		
		int ans1 = calculation(calculation(A, B, oper1), C, oper2); 
		int ans2 = calculation(A, calculation(B, C, oper2), oper1);
		
		System.out.println(Math.min(ans1, ans2));
		System.out.print(Math.max(ans2, ans1));
		
	}
	
	private static int calculation(int N1, int N2, String oper) {
		
		switch(oper) {
		
			case "+" : return N1 + N2; 
			case "-" : return N1 - N2;
			case "*" : return N1 * N2;
			case "/" : 
				
				if(N1 < 0) return (Math.abs(N1) / N2 * -1);
				else if(N2 < 0) return (N1 / Math.abs(N2) * -1);
				else return N1 / N2;
		}
		
		return -1;
	}
	
	// 14625번 - 냉동식품
	public static void test04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken())*100 + Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken())*100 + Integer.parseInt(st.nextToken());
        
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        
        while (s <= e) {
            if (chk1(s, n)) cnt++;
            s = chk2(s);
        }
        
        System.out.println(cnt);
	}
	
    private static boolean chk1(int a, int n) {

    	if (a < 1000 && n == 0) return true;
        
    	while (a!= 0) {
    		
            if (a % 10 == n) return true;
            a/=10;
            
        }
    	
        return false;
    }
    
    private static int chk2(int a) {

    	if (a % 100 == 59)
            return (a / 100 + 1) * 100;
    	
        return ++a;
    }
	
	// 14649번 - 문홍안
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int P = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		char[] stone = new char[101];
		for(int i = 0; i < 101; i++) stone[i] = 'B';
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			int position = Integer.parseInt(st.nextToken());
			char dir = st.nextToken().charAt(0);
			
			if(dir == 'R') 
				for(int j = position + 1; j < 101; j++) stone[j] = (stone[j] == 'B') ? 'R' : (stone[j] == 'R') ? 'G' : 'B';
			else 
				for(int j = position - 1; j > 0; j--) stone[j] = (stone[j] == 'B') ? 'R' : (stone[j] == 'R') ? 'G' : 'B';
			
		}
		
		int m = 0;
		int h = 0;
		int a = 0;
		for(int i = 1; i < 101; i++) {
			
			switch(stone[i]) {
				case 'R' : h++; break;
				case 'B' : m++; break;
				case 'G' : a++; break;
			}
		}
		
		String mM = String.format("%.2f", (double)P/100*m);
		String hM = String.format("%.2f", (double)P/100*h);
		String aM = String.format("%.2f", (double)P/100*a);
		
		System.out.println(mM);
		System.out.println(hM);
		System.out.println(aM);
	}
	
	// 17285번 - XORChic
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String T = br.readLine();
		
		int ans = 0;
		char temp = T.charAt(0);
		
		while((char)((int)temp ^ ans) != 'C') ans++;
		
		for(int i = 0; i < T.length(); i++) sb.append((char)((int)T.charAt(i) ^ ans));
		
		System.out.println(sb);
	}
	
	// 23320번 - 홍익 절대평가
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		
		st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		
		int yP = 0;
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] >= Y) yP++;
			else break;
		}
		
		System.out.println((N*X/100) + " " + yP);
		
	}
	
	// 25177번 - 서강의 역사를 찾아서
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[Math.max(N, M)];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < Math.max(N, M); i++) {
			
			int x = arr[i] == 0 ? 0 : arr[i];
			
			if(st.hasMoreTokens())
				arr[i] = Integer.parseInt(st.nextToken()) - x;
			else arr[i] = 0;
		}
		
		Arrays.sort(arr);
		System.out.println(Math.max(arr[arr.length - 1], 0));
	}
	
	// 17122번 - 체스 
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		boolean[][] map = new boolean[8][8];
		
		for(int i = 0; i < 8; i++) {
			if(i > 0) if(!map[i - 1][0]) map[i][0] = true;
			for(int j = 0; j < 7; j++) 
				if(!map[i][j]) map[i][j + 1] = true;
			
		}
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			String A = st.nextToken();
			int B = Integer.parseInt(st.nextToken());
			int prev = A.charAt(0) - 'A';
			int next = Integer.parseInt(A.substring(1, A.length())) -1;
			
			if(map[prev][next] == map[(B - 1) % 8][(B - 1) / 8]) System.out.println("YES");
			else System.out.println("NO");
			
		}
	}
	
	// 2669번 - 직사각형 네개의 합집합의 면적 구하기
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[101][101];
		
		for (int i = 0; i < 4; i++) {
			
			String[] str = br.readLine().split(" ");
			int lx = Integer.parseInt(str[0]);
			int ly = Integer.parseInt(str[1]);
			int rp = Integer.parseInt(str[2]);
			int rq = Integer.parseInt(str[3]);
 
			for (int j = ly; j < rq; j++) 
				for (int k = lx; k < rp; k++) 
					arr[j][k] = 1; 
			
		}
		
		int cnt = 0;
		
		for (int i = 1; i <= 100; i++) 
			for (int j = 1; j <= 100; j++) 
				if (arr[i][j] == 1) cnt++;
		
		System.out.println(cnt);
		
	}
	
	
}
