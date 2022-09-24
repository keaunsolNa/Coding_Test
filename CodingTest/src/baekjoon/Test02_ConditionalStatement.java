package baekjoon;

import java.util.Scanner;

public class Test02_ConditionalStatement {

	// 두 수 비교하기
	public static void test01(){
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		if(a > b){
            System.out.println('>');
        } else if(a < b) {
        	System.out.println('<');
        } else {
        	System.out.println("==");
        }
	}
	
	// 시험 성적
	public static void test02(){
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		if(a >= 90){
            System.out.println('A');
        } else if(a >= 80) {
        	System.out.println('B');
        } else if(a >= 70) {
        	System.out.println('C');
        } else if(a >= 60) {
        	System.out.println('D');
        } else {
        	System.out.println('F');
        }
	}
	
	// 윤년
	public static void test03(){
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		if(a%4 == 0 && a%100 != 0){
            System.out.println(1);
        } else if(a % 400 == 0) {
        	System.out.println(1);
        } else {
        	System.out.println(0);
        }
	}

	// 사분면 고리기
	public static void test04(){
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > 0 && b > 0){
            System.out.println(1);
        } else if(a < 0 && b > 0) {
        	System.out.println(2);
        } else if(a < 0 && b < 0) {
        	System.out.println(3);
        } else if(a > 0 && b < 0) {
        	System.out.println(4);
        } 
	}
	
	// 알람 시계
	public static void test05(){
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(b >= 45) {
			System.out.println(a + " " + (b-45));
		} else if(a == 1) {
			System.out.println(0 + " " + (b+15));
		} else if(a < 1) {
			System.out.println(23 + " " + (b+15));
		} else {
			System.out.println((a - 1) + " " + (b+15));
		}
	}
	
	// 오븐 시계
	public static void test06(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = sc.nextInt();
		
		int min = 60 * a + b;
		min += c;
		
		
		int hour = (min / 60) % 24;
		int minute = min % 60;
		
		System.out.println(hour + " " +  minute);
		
	}
	
	// 주사위 세개
	public static void test07(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && b == c) {
			System.out.println(10000 + (a * 1000));
		} else if(a != b && b != c && a != c) {
			System.out.println((Math.max(a, Math.max(b, c)) * 100));
		} else if(a != b && b == c) {
			System.out.println(1000 + (b * 100));
		} else if(a != c && a == b) {
			System.out.println(1000 + (b * 100));
		} else if(a == c && b != a){
            System.out.println(1000 + (a * 100));
        }
		
	}
	
}
