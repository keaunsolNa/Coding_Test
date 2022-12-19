package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath2Plus20 {

   public static void main(String[] args) throws IOException {
      test05();
   }
   
   // 평균 중앙값 문제
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      String input = "";
      
      while(!(input = br.readLine()).equals("0 0")) {
    	  st = new StringTokenizer(input, " ");
    	  int a = Integer.parseInt(st.nextToken());
    	  int b = Integer.parseInt(st.nextToken());
    	  
    	  System.out.println(a - (b-a));
      }
   }
   
   // 일반 화학 실험
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   double pre = Double.parseDouble(br.readLine());
	   double input = 0;
	   while((input = Double.parseDouble(br.readLine())) != 999) {
		   System.out.printf("%.2f", input - pre);
		   System.out.println();
		   pre = input;
	   }
   }

   // 5의 수난
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String input = br.readLine();
      int total = 0;
      for(int i = 0; i < input.length(); i++) {
    	  int temp = Character.getNumericValue(input.charAt(i));
    	  
    	  total += Math.pow(temp, 5);
      }
      System.out.println(total);
   }

   //숫자 놀이
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = "";
	   
	   while(!(input = br.readLine()).equals("0")) {
		   while(input.length() != 1) {
			   int num = 0;
			   for(int i = 0; i < input.length(); i++) {
				   num += Character.getNumericValue(input.charAt(i));
			   }
			   input = num+"";
		   }
		   
		   System.out.println(input);
	   }
   }
   
   // 자기복제수
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   int N = Integer.parseInt(br.readLine());
		   int NLength = (N+"").length();
		   String pow = (int)Math.pow(N, 2) + "";
		   
		   String x = pow.substring(pow.length() - NLength, pow.length());

		   if(x.equals(N+"")) {
			   System.out.println("YES");
		   } else {
			   System.out.println("NO");
		   }
	   }
	   
   }
   
   // 
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
   }
   
   // 
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
   }
   
   //
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
   }
   
   //
   public static void test09() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
   }
   
   // 
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   
   }
}