package baekjoon_StepByStep;

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
	
	
}
