package baekjoon;

import java.util.Scanner;

public class Test01_IOAndArithmeticOperation {
	
	public static void main(String[] args) {
		test01();
		test02();
		test03();
		test04();
		test05();
		test06();
		test07();
		test08();
		test09();
		test10();
		test11();
		test12();
		test13();
		test14();
		test15();
	}
	
	public static void test01() {
		System.out.println("Hello World!");
	}
	
	public static void test02(){
		System.out.println("강한친구 대한육군");
        System.out.println("강한친구 대한육군");
	}
	
	public static void test03(){
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + b);
	}
	
	public static void test04(){
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a - b);
	}
	
	public static void test05(){
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a * b);
	}
	
	public static void test06(){
		Scanner sc = new Scanner(System.in);
		double a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a / b);
	}
	
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
	
	public static void test08(){
		Scanner sc = new Scanner(System.in);
		String a;
		a = sc.next();
		
		System.out.println(a + "??!");
	}
	
	public static void test09(){
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		System.out.println(a - 543);
	}
	
	public static void test10(){
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e, f;
		a = sc.nextInt();
		b = sc.nextInt();
     	c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
		System.out.println((1-a) + " " + (1-b) + " " + (2-c) + " " + (2-d) + " " + (2-e) + " " + (8-f));
	}
	
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
	
	public static void test13(){
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}
	
	public static void test14(){
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}
	
	public static void test15(){
		System.out.println("         ,r'\"7");
		System.out.println("r`-_   ,'  ,/");
		System.out.println(" \\. \". L_r'");
		System.out.println("   `~\\/");
		System.out.println("      |");
		System.out.println("      |");
	}
}
