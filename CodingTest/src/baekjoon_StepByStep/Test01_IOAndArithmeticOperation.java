package baekjoon_StepByStep;

import java.util.Scanner;

public class Test01_IOAndArithmeticOperation {

	
	// A + B
	public static void test03(){
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
	}
	
	// A - B
	public static void test04(){
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a - b);
	}
	
	// A * B
	public static void test05(){
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a * b);
	}
	
	// A / B
	public static void test06(){
		Scanner sc = new Scanner(System.in);
		double a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a / b);
	}
	
	// 사칙연산
	public static void test07(){
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
	}
	
	// ??!
	public static void test08(){
		Scanner sc = new Scanner(System.in);
		String a;
		a = sc.next();
		
		System.out.println(a + "??!");
	}
	
	
	// 나머지
	public static void test11(){
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();        
		System.out.println((a+b)%c);
		System.out.println(((a%c) + (b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c) * (b%c))%c);
	}
	
	// 곱셈
	public static void test12(){
		Scanner sc = new Scanner(System.in);
		int a;
		String b;
		a = sc.nextInt();
		b = sc.next();
		System.out.println(a*Character.getNumericValue(b.charAt(2)));
		System.out.println(a*Character.getNumericValue(b.charAt(1)));
		System.out.println(a*Character.getNumericValue(b.charAt(0)));
		
		System.out.println(a*Integer.parseInt(b));
	}
	
	// 고양이
	public static void test13(){
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}
	
	// 개
	public static void test14(){
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}
	
	// 새싹
	public static void test15(){
		System.out.println("         ,r'\"7");
		System.out.println("r`-_   ,'  ,/");
		System.out.println(" \\. \". L_r'");
		System.out.println("   `~\\/");
		System.out.println("      |");
		System.out.println("      |");
	}
}
