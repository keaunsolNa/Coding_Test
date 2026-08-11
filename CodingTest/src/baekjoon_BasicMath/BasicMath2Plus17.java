package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus17 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // Большой удой 
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int A = Integer.parseInt(br.readLine());
      int B = Integer.parseInt(br.readLine());
      
      System.out.println(B*2 - A);
   }
   

   // 완전 제곱수
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   int cnt = 0;
	   for(int b = 1; b <= 500; b++) {
		   
		   for(int a = b + 1; a <= 500; a++) {
			   if(a * a - N == b * b) cnt++;
		   }
	   }
	   
	   System.out.println(cnt);
   }
   
   
   // 더하기 4
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = "";
	   int index = 1;
	   
	   while(!(input = br.readLine()).equals("0 0 0")) {
		   StringTokenizer st = new StringTokenizer(input, " ");
		   
		   double a = Integer.parseInt(st.nextToken());
		   double b = Integer.parseInt(st.nextToken());
		   double c = Integer.parseInt(st.nextToken());
		   
		   if(a == 0 && b == 0 && c ==0)break;
		   
		   System.out.println("Triangle #" + index);
		   
			if(a == -1) {
				if(c <= b) {
					System.out.println("Impossible.");
				}else {
					a = Math.sqrt((c * c) - (b * b));
					System.out.println("a = " + String.format("%.3f", a));
				}
			}
			if(b == -1) {
				if(c <= a) {
					System.out.println("Impossible.");
				}else {
					b = Math.sqrt((c * c) - (a * a));
					System.out.println("b = " + String.format("%.3f", b));
				}
			}
			if(c == -1) {
				c = Math.sqrt((a * a) + (b * b));
				System.out.println("c = " + String.format("%.3f", c));
			}
			index++;
			System.out.println();
	   }
   }

}