package baekjoon_implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implement07 {

	public static void main(String[] args) throws IOException {
		test10();
	}
	
	// Speed fines are not fine! 
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int pay = 0;
		if(A < B) {
			if(B-A <= 20) {
				pay = 100;
			} else if(B-A <= 30) {
				pay = 270;
			} else {
				pay = 500;
			}
			System.out.println("You are speeding and your fine is $"+pay+".");
		} else {
			System.out.println("Congratulations, you are within the speed limit!");
		}
	}
	
	// Sounds fishy!
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		String answer = "";
		if(A < B) {
			if(B < C) {
				if(C < D) {
					answer = "Fish Rising";
				} else {
					answer = "No Fish";
				}
			} else {
				answer = "No Fish";
			}
		} else if (A > B) {
			if(B > C) {
				if(C > D) {
					answer = "Fish Diving";
				} else {
					answer = "No Fish";
				}
			} else {
				answer = "No Fish";
			}
		} else if(A == B) {
			if(B == C) {
				if(C == D) {
					answer ="Fish At Constant Depth";
				} else {
					answer = "No Fish";
				}
			} else {
				answer = "No Fish";
			}
		}
		
		System.out.println(answer);
	}
	
	// Judging Moose
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int point = 0;
		String isMoose = "";
		if(A == 0 && B == 0) {
			isMoose = "Not a moose";
		} else if(A!=B) {
			isMoose ="Odd ";
			point = Math.max(A, B)*2;
		} else {
			isMoose = "Even ";
			point = A*2;
		}
		
		if(point != 0) {
			System.out.println(isMoose + point);
		} else {
			System.out.println(isMoose);
		}
	}
	
	// Boiling Water 
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int B = Integer.parseInt(br.readLine());
		
		int P = 5*B-400;
		System.out.println(P);
		
		if(P == 100) {
			System.out.println(0);
		} else if(P > 100) {
			System.out.println(-1);
		} else {
			System.out.println(1);
		}
	}
	
	// 計算 (Calculation) 
	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		System.out.println(Math.max(A+B, A-B));
		System.out.println(Math.min(A+B, A-B));
	}
	
	// Archivist 
	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year = Integer.parseInt(br.readLine());
		
		switch(year) {
			case 1995 : System.out.println("ITMO"); break;
			case 1996 : System.out.println("SPbSU"); break;
			case 1997 : System.out.println("SPbSU"); break;
			case 1998 : System.out.println("ITMO"); break;
			case 1999 : System.out.println("ITMO"); break;
			case 2000 : System.out.println("SPbSU"); break;
			case 2001 : System.out.println("ITMO"); break;
			case 2002 : System.out.println("ITMO"); break;
			case 2003 : System.out.println("ITMO"); break;
			case 2004 : System.out.println("ITMO"); break;
			case 2005 : System.out.println("ITMO"); break;
			case 2006 : System.out.println("PetrSU, ITMO"); break;
			case 2007 : System.out.println("SPbSU"); break;
			case 2008 : System.out.println("SPbSU"); break;
			case 2009 : System.out.println("ITMO"); break;
			case 2010 : System.out.println("ITMO"); break;
			case 2011 : System.out.println("ITMO"); break;
			case 2012 : System.out.println("ITMO"); break;
			case 2013 : System.out.println("SPbSU"); break;
			case 2014 : System.out.println("ITMO"); break;
			case 2015 : System.out.println("ITMO"); break;
			case 2016 : System.out.println("ITMO"); break;
			case 2017 : System.out.println("ITMO"); break;
			case 2018 : System.out.println("SPbSU"); break;
			case 2019 : System.out.println("ITMO"); break;
		}
		
	}
	
	// Covid-19
	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		if(A <= 50 && B <= 10) {
			System.out.println("White");
		} else if(B > 30) {
			System.out.println("Red");
		} else {
			System.out.println("Yellow");
		}
		 
	}
	
	// HOMWRK 
	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int cnt = Integer.parseInt(br.readLine());
			
			for(int j = 0; j < cnt; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				
				System.out.println((A+B) + " " + (A*B));
			}
		}
		
	}
	
	// Bank Transfer
	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double K = Double.parseDouble(br.readLine());
		
		double answer = K*0.01+25;
		
		if(answer < 100) {
			answer = 100.00;
		} else if(answer > 2000) {
			answer = 2000.00;
		}
		
		String A = answer+"";
		if(A.split("\\.")[1].length() == 1) {
			System.out.println(A+"0");
		} else {
			System.out.println(A);
		}
	}
	
	// Äpplen och päron 
	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int APay = A*7;
		int BPay = B*13;
		
		if(APay > BPay) {
			System.out.println("Axel");
		} else if(APay == BPay) {
			System.out.println("lika");
		} else {
			System.out.println("Petra");
		}
	}
	
}
