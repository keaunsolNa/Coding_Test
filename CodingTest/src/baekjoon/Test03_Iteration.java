package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test03_Iteration {

	public static void main(String[] args) throws IOException {
		
//		test01();
//		test02();
//		test03();
//		test04();
//		test05();
//		test06();
//		test07();
//		test08();
//		test09();
//		test10();
//		test11();
//		test12();
		test13();
		
	}
	
	public static void test01(){
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(a + " * " + i + " = " + a*i);
		}
	}
	
	public static void test02(){
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
	}
	
	public static void test03(){
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		int result = 0;
		for(int i = 1; i <= a; i++) {
			result += i;
		}
		
		System.out.println(result);
	}
	
	public static void test04(){
		Scanner sc = new Scanner(System.in);
		int totalCount, amount;
		totalCount = sc.nextInt();
		amount = sc.nextInt();
		
		for(int i = 1; i <= amount; i++) {
			totalCount -= (sc.nextInt() * sc.nextInt());
		}
		
		if(totalCount == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public static void test05() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= a; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');
		}
		
		br.close();
		
		System.out.println(sb.toString());
	}
	
	public static void test06(){
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			System.out.println("Case #" + i + ": " + (sc.nextInt() + sc.nextInt()));
		}
	}
	
	public static void test07(){
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			int temp = sc.nextInt();
			int temp2 = sc.nextInt();
			System.out.println("Case #" + i + ": " + temp + " + " + temp2 + " = " + (temp+temp2));
		}
	}
	
	public static void test08(){
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void test09(){
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		for(int i = a; i > 0; i--) {
			
			for(int j = i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < a - i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void test10(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			int temp = sc.nextInt();
			if(temp < b) {
				System.out.println(temp);
			}
		}
	}
	
	public static void test11(){
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 1;
		
		while(1 == 1) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a == 0 && b == 0) {
				break;
			}
			System.out.println(a + b);
		}
	}
	
	public static void test12() {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
	}
	
	public static void test13() {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		if(a.length() == 1) {
			a = a + "0";
		}
		
		int origin = Integer.parseInt(a);
		int cnt = 0;
		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;
		
		while(1 == 1) {
			temp1 = Character.getNumericValue(a.charAt(a.length() - 1));
			
			for(int i = 0; i < a.length(); i++) {
				temp2 += Character.getNumericValue(a.charAt(i));
			}
			
			temp2 = Character.getNumericValue((temp2+"").charAt((temp2+"").length() - 1));
			temp3 = Integer.parseInt(temp1 + "" +  temp2);
			cnt++;
			
			a = temp3 +"";
			temp1 = 0; 
			temp2 = 0;
			if(a.equals(origin + "")) {
				break;
			}
		}
		
		System.out.println(cnt);
	}
}


//import java.util.Scanner;
//
//public class Main{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//    }
//}