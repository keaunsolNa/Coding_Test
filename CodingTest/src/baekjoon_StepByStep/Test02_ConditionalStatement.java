package baekjoon_StepByStep;

import java.util.Scanner;

public class Test02_ConditionalStatement {

	
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
