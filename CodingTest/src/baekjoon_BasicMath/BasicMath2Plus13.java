package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;


public class BasicMath2Plus13 {

   public static void main(String[] args) throws IOException {
      test01();
   }
   
   // 카드 뽑기
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      int N = Integer.parseInt(st.nextToken());
      int O = Integer.parseInt(st.nextToken());
      int X = N - O;
      int O2 = Integer.parseInt(st.nextToken());
      int X2 = N - O2;
      
      int O3 = Math.min(O, O2);
      int X3 = Math.min(X, X2);
      
      System.out.print( O3+X3);
      
   }
   

   // ЧАСОВНИК
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int t1 = Integer.parseInt(st.nextToken());
      int m1 = Integer.parseInt(st.nextToken());
      int t2 = Integer.parseInt(st.nextToken());
      int m2 = Integer.parseInt(st.nextToken());
      
      int tMinute = (t1*60) + m1;
      int mMinute = (t2*60) + m2;
      int sMinute = 0;
      
      if(mMinute < tMinute) {
    	  sMinute = ((24*60) - tMinute) + mMinute;
      } else {
    	  sMinute = mMinute - tMinute;
      }
      System.out.println(sMinute + " " + sMinute/30);
      
   }

   
   // 점수 계산
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
	   int totalCount = 0;
	   int nowCount = 1;
	   for(int i = 0; i < N; i++) {
		   int answer = Integer.parseInt(st.nextToken());
		   
		   if(answer == 1) {
			   totalCount += nowCount;
			   nowCount++;
		   } else {
			   nowCount = 1;
		   }
	   }
	   
	   System.out.println(totalCount);
   }
   
   
   // Circus
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       BigDecimal tentArea = new BigDecimal(br.readLine());

       double tentPerimeter = tentArea
               .multiply(BigDecimal.valueOf(Math.PI))
               .multiply(BigDecimal.valueOf(4))
               .sqrt(new MathContext(12)).doubleValue();

       System.out.println(tentPerimeter);
       
   }
   
   //영수증
   public static void test09() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int sumMoney = Integer.parseInt(br.readLine());
      for(int i = 0; i < 9; i++) {
    	  
    	  sumMoney -= Integer.parseInt(br.readLine());
      }
      
      System.out.println(sumMoney);
      
   }
   

}