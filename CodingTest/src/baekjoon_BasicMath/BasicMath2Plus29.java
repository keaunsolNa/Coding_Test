package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath2Plus29 {

   public static void main(String[] args) throws IOException {
      test01();
   }
   
   // 問題 １
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      
      int N = Integer.parseInt(br.readLine());
      
      int AP = 0;
      int BP = 0;
      while(N --> 0) {
    	  st = new StringTokenizer(br.readLine());
    	  int A = Integer.parseInt(st.nextToken());
    	  int B = Integer.parseInt(st.nextToken());
    	  
    	  if(A > B) AP += A + B;
    	  else if(A < B) BP += A + B;
    	  else {
    		  AP += A;
    		  BP += B;
    	  }
      }
      
      System.out.println(AP + " " + BP);
   }
   
   // 割り勘
   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      String input = "";
      
      while(!(input = br.readLine()).equals("0 0")) {
    	  st = new StringTokenizer(input);
    	  int N = Integer.parseInt(st.nextToken());
    	  int M = Integer.parseInt(st.nextToken());
    	  
    	  st = new StringTokenizer(br.readLine());
    	  int tax = M/N;
    	  int totalMoney = 0;
    	  for(int i = 0; i < N; i++) {
    		  
    		  int money = Integer.parseInt(st.nextToken());
    		  
    		  if(money > tax) totalMoney += tax;
    		  else totalMoney += money;
    			  
    	  }
    	  
    	  System.out.println(totalMoney);
      }
      
   }
   
   
   // 이진수 변환
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println(Long.toBinaryString(Long.parseLong(br.readLine())));
   }
   
   // 팩토리얼
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < T; i++) {
		   int N = Integer.parseInt(br.readLine());
		   int ans = 1;

		   for (int j = 1; j <= N; j++) {
			
			   ans *= j;
				
			   ans %= 100000;
				
			   while (ans % 10 == 0) ans /= 10;
			   
		   }
		   
		   System.out.println(ans % 10);
	   }
   }
   
}