package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BasicMath2Plus9 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // Contest Timing
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
      int day = Integer.parseInt(st.nextToken());
      int H = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());
      
      int t1 = (day*1440) + (H*60) + M;
      int t2 = (11*1440) + (11*60) + 11;
      
      if(t1-t2 < 0) {
         System.out.println(-1);
      } else {
         System.out.println(t1-t2);
      }
   }
   
   // 치킨댄스를 추는 곰곰이를 본 임스
   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int total = 0;

      for(int i = 1; i <= B; i++) {
         if(N - 1 >= 0) {
            N -= 1;
            total++;
         }
      }
      
      for(int i = 2; i <= A; i = i+2) {
         if(N - 1 >= 0) {
            N -= 1;
            total++;
         }
      }
      
      System.out.println(total);
   }

   // 욱 제
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      double A = Double.parseDouble(st.nextToken());
      double B = Double.parseDouble(st.nextToken());
      
      double answer = 1 / (1 + Math.pow(10, (B - A) / 400.0));
      
      System.out.println(answer);
   }

   // SASA 모형을 만들어보자
   public static void test04() throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      StringTokenizer st = new StringTokenizer(br.readLine());
	      int S = Integer.parseInt(st.nextToken());
	      int A = Integer.parseInt(st.nextToken());
	      
	      System.out.println(Math.min(S/2, A/2));
   }
   
   // 녹색 거탑
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   int sum = 1;
	   for(int i = 0; i < N; i++) {
		   sum *= 2;
	   }
	   System.out.println(sum);
   }
   
   // Square Pasture
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int x1 = Integer.parseInt(st.nextToken());
	   int y1 = Integer.parseInt(st.nextToken());
	   int x2 = Integer.parseInt(st.nextToken());
	   int y2 = Integer.parseInt(st.nextToken());

	   st = new StringTokenizer(br.readLine());
	   int X1 = Integer.parseInt(st.nextToken());
	   int Y1 = Integer.parseInt(st.nextToken());
	   int X2 = Integer.parseInt(st.nextToken());
	   int Y2 = Integer.parseInt(st.nextToken());
	   
	   int maxX = Math.max(Math.max(Math.max(x1, x2), X1), X2);
	   int minX = Math.min(Math.min(Math.min(x1, x2), X1), X2);
	   int maxY = Math.max(Math.max(Math.max(y1, y2), Y1), Y2);
	   int minY = Math.min(Math.min(Math.min(y1, y2), Y1), Y2);
	   
	   int answer = Math.max(maxX - minX, maxY - minY);
	   System.out.println(answer*answer);
	   
   }
   
   // РАВЕНСТВО
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   BigInteger A = new BigInteger(br.readLine());
	   BigInteger B = new BigInteger(br.readLine());
	   BigInteger C = new BigInteger(br.readLine());
	   
	   BigInteger answer = (B.subtract(C)).divide(A);
	   System.out.println(answer);
   }
   
   // Shares
   public static void test08() throws IOException {
	   Scanner sc = new Scanner(System.in);
	   
	   while(sc.hasNext()) {
		   int n = sc.nextInt();
		   int s = sc.nextInt();
		   System.out.println(s/(n+1));
	   }
   }
   
   // Dog Treats 
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int S = Integer.parseInt(br.readLine());
	   int M = Integer.parseInt(br.readLine());
	   int L = Integer.parseInt(br.readLine());
	   
	   int happy = S + (2*M) + (3*L);
	   
	   if(happy >= 10) {
		   System.out.println("happy");
	   } else {
		   System.out.println("sad");
	   }
   }
   
   // Abbey Courtyard
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   double a = Math.sqrt(Double.parseDouble(br.readLine()));
	   
	   System.out.println(a*4);
   }



}