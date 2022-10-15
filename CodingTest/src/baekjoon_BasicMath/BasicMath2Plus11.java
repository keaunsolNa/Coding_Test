package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BasicMath2Plus11 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 短針 (Hour Hand) 
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int A = Integer.parseInt(br.readLine());
      int B = Integer.parseInt(br.readLine());
      
      int answer = A+B;
      if(answer > 12) {
    	  answer %= 12;
    	  if(answer == 0) {
    		  answer = 12;
    	  }
      }
      
      System.out.println(answer);
   }
   
   // 移動 (Moving)
   public static void test02() throws IOException {
      
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int X = Integer.parseInt(br.readLine());
	   int Y = Integer.parseInt(br.readLine());
	   int Z = Integer.parseInt(br.readLine());
	   
	   if(X+Y > Z) {
		   System.out.println(0);
	   } else {
		   System.out.println(1);
	   }
   }

   // Petrol
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());
      
      int total1500 = k+60;
      
      if(total1500 - n > 0) {
    	  System.out.println(n*1500);
      } else {
    	  System.out.println((total1500*1500) + ((n-total1500)*3000));
      }
   }

   // 상근이의 친구들
   public static void test04() throws IOException {
	     
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = "";
	   
	   while(!(input = br.readLine()).equals("0 0")) {
		   String[] f = input.split(" ");
		   System.out.println(Integer.parseInt(f[0]) + Integer.parseInt(f[1]));
	   }
   }
   
   // Silnia 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   
	   if(N < 4) {
		   System.out.println(factorial(N));
	   } else if(N == 4) {
		   System.out.println(4);
	   } else {
		   System.out.println(0);
	   }
   }
   
   public static int factorial(int n) {
		
	   if(n < 2) return 1;
	   return n*factorial(n-1);
	
   }
   
   // アイスクリーム (Ice Cream) 
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int S = Integer.parseInt(br.readLine());
      int A = Integer.parseInt(br.readLine());
      int B = Integer.parseInt(br.readLine());
      
      if(S-A <= 0) {
    	  System.out.println(250);
      } else {
    	  if((S-A)%B == 0) {
    		  System.out.println(250 + (((S-A)/B)*100));
    	  } else {
    		  System.out.println(350 + (((S-A)/B)*100));
    	  }
      }
	   
   }
   
   // 샤틀버스
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       
       int X = Integer.parseInt(st.nextToken());
       int Y = Integer.parseInt(st.nextToken());
       
       if(X > Y) {
    	   System.out.println(X + Y);
       } else {
    	   System.out.println(Y - X);
       }
   }
   
   // Tabliczka 
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       
       long A  = Long.parseLong(st.nextToken());
       long B  = Long.parseLong(st.nextToken());
       
       if(A%2 == 0 || B%2 == 0) {
    	   System.out.println(0);
       } else {
    	   System.out.println(Math.min(A, B));
       }
   }
   
   // IT Passport Examination
   public static void test09() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int testCase = Integer.parseInt(br.readLine());
      
      for(int i = 0; i < testCase; i++) {
    	  StringTokenizer st = new StringTokenizer(br.readLine());
    	  int people = Integer.parseInt(st.nextToken());
    	  int T1 = Integer.parseInt(st.nextToken());
    	  int T2 = Integer.parseInt(st.nextToken());
    	  int T3 = Integer.parseInt(st.nextToken());
    	  int total = T1+T2+T3;
    	  
    	  String SF = "FAIL";
    	  if(total >= 55) {
    		  
    		  if(T1 >= 11 && T2 >= 8 && T3 >=12) {
    			  SF = "PASS";
    		  }
    	  }
    	  
    	  
    	  System.out.println(people + " " + (T1+T2+T3) + " " + SF);
      }
      
   }
   
   // Triathlon
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   int max = 0;
	   for(int i = 0; i < T; i++) {
		   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		   
		   int a = Integer.parseInt(st.nextToken());
		   int d = Integer.parseInt(st.nextToken());
		   int g = Integer.parseInt(st.nextToken());
		   
		   int count = a * (d+g);
		   if(a == (d+g)) {
			   count *= 2;
		   }
		   
		   if(max < count) {
			   max = count;
		   }
		   
	   }
	   
	   System.out.println(max);
   }



}