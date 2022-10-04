package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test08_BasicMath2Plus5 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// 가희와 방어율 무시
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int c = a*(100-b)/100;
		if(c >= 100) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
	
	// 인공지능 시계
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		int T = Integer.parseInt(br.readLine());
		
		M += T / 60;
		S += T % 60;
		
		M += S / 60;
		S = S % 60;

		H += M / 60;
		M = M %60;
		
		H = H % 24;
		System.out.println(H + " " + M + " " + S);
	}
	
	// 수학은 체육과목 입니다 2
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int finger = n%8;
		
		switch(finger) {
			case 0 : System.out.println("2"); break;
			case 1 : System.out.println("1"); break;
			case 2 : System.out.println("2"); break;
			case 3 : System.out.println("3"); break;
			case 4 : System.out.println("4"); break;
			case 5 : System.out.println("5"); break;
			case 6 : System.out.println("4"); break;
			case 7 : System.out.println("3"); break;
		}
	}
	
	// 파티가 끝나고 난 뒤 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int people = Integer.parseInt(st.nextToken());
		int area = Integer.parseInt(st.nextToken());
		
		int areaPeople = area*people;
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < 5; i++) {
			int temp = Integer.parseInt(st.nextToken());
			System.out.println(temp - areaPeople);
		}
	}
	
	// 과자
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(K*N <= M) {
			System.out.println(0);
		} else {
			System.out.println(Math.abs(M - (K*N)));
		}
	}
	
	// 심부름 가는 길
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		
		int TT = A + B + C + D;
		
		System.out.println(TT/60 +"\n"+ TT%60);
	}
	
	// 방학 숙제
	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int L  = Integer.parseInt(br.readLine());
		int A  = Integer.parseInt(br.readLine());
		int B  = Integer.parseInt(br.readLine());
		int C  = Integer.parseInt(br.readLine());
		int D  = Integer.parseInt(br.readLine());
		
		double mathDay = Math.ceil((double)B/D);
		double langDay = Math.ceil((double)A/C);
		
		int SD = (int)Math.max(mathDay, langDay);
		System.out.println(L - SD);
	}
	
	// 시험 점수
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int S = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int T = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

		if(S == T) {
			System.out.println(S);
		} else {
			System.out.println(Math.max(S, T));
		}
		
	}
	
	// 파일 옮기기
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		System.out.println(Math.min(A + D,  B + C));
	}
	
	// 타임 카드
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int AGW = Integer.parseInt(st.nextToken())*60*60 + Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken());
		int AOW = Integer.parseInt(st.nextToken())*60*60 + Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken());
		System.out.println((AOW-AGW)/3600 + " " + (AOW-AGW)%3600/60 + " " + (AOW-AGW)%60);
		
		st = new StringTokenizer(br.readLine(), " ");
		int BGW = Integer.parseInt(st.nextToken())*60*60 + Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken());
		int BOW = Integer.parseInt(st.nextToken())*60*60 + Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken());
		System.out.println((BOW-BGW)/3600 + " " + (BOW-BGW)%3600/60 + " " + (BOW-BGW)%60);
		
		st = new StringTokenizer(br.readLine(), " ");
		int CGW = Integer.parseInt(st.nextToken())*60*60 + Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken());
		int COW = Integer.parseInt(st.nextToken())*60*60 + Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken());
		System.out.println((COW-CGW)/3600 + " " + (COW-CGW)%3600/60 + " " + (COW-CGW)%60);
		
	}
}
