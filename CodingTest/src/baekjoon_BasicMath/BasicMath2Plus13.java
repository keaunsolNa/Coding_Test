package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;


public class BasicMath2Plus13 {

   public static void main(String[] args) throws IOException {
      test10();
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
   
   // Betting
   public static void test02() throws IOException {
      
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   double percent = Double.parseDouble(br.readLine());
	   System.out.printf("%.10f", (100/percent));
	   System.out.println();
	   System.out.printf("%.10f", (100/(100-percent)));
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

   // TGN
   public static void test04() throws IOException {
	     
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < N; i++) {
		   
		   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		   int r = Integer.parseInt(st.nextToken());
		   int e = Integer.parseInt(st.nextToken());
		   int c = Integer.parseInt(st.nextToken());
		   
		   if(e - c > r) {
			   System.out.println("advertise");
		   } else if(e - c == r) {
			   System.out.println("does not matter");
		   } else if(e - c < r) {
			   System.out.println("do not advertise");
		   }
	   }
	   

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
   
   // 사과
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      int totalCount = 0;
      
      for(int i = 0; i < N; i++) {
    	  StringTokenizer st = new StringTokenizer(br.readLine());
    	  int student = Integer.parseInt(st.nextToken());
    	  int apple = Integer.parseInt(st.nextToken());
    	
    	  totalCount += apple%student;
      }
      
      System.out.println(totalCount);
   }
   
   // Arm Coordination
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int x = Integer.parseInt(st.nextToken());
       int y = Integer.parseInt(st.nextToken());
       int r = Integer.parseInt(br.readLine());
       
       System.out.println((x-r) + " "+ (y+r));
       System.out.println((x+r) + " "+ (y+r));
       System.out.println((x+r) + " "+ (y-r));
       System.out.println((x-r) + " "+ (y-r));
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
   
   // Rulltrappa
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   int M = Integer.parseInt(st.nextToken());
	   int S = Integer.parseInt(st.nextToken());
	   int G = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine(), " ");
	   double A = Double.parseDouble(st.nextToken());
	   double B = Double.parseDouble(st.nextToken());

	   st = new StringTokenizer(br.readLine(), " ");
	   int L = Integer.parseInt(st.nextToken());
	   int R = Integer.parseInt(st.nextToken());
	   
	   double stop = (1 / A) * L + (double)M / (double)G;
	   double move = (1 / B) * R + (double)M / (double)S;
	   
	   if(stop < move) {
		   System.out.println("friskus");
	   } else {
		   System.out.println("latmask");
	   }
	   
   }



}