package codingTestLevel0;

import java.util.Scanner;

public class Lessons40 {
	
	// 직각삼각형 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            
            for(int j = n - i; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
}