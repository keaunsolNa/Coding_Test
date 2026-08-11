package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus17 {

   public static void main(String[] args) throws IOException {
      test01();
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
   
   
}