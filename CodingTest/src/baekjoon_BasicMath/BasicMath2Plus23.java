package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus23 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 3n+1 수열
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int C = Integer.parseInt(br.readLine());
      int cnt = 1;
      
      while(C != 1) {
    	  
    	  if(C % 2 == 0) {
    		  C /= 2;
    		  cnt++;
    	  } else {
    		  C = 3*C + 1;
    		  cnt++;
    	  }
      }
      
      System.out.println(cnt);
   }
   
   // 폰 노이만 
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 1; i <= T; i++) {
		   st = new StringTokenizer(br.readLine(), " ");
		   
		   double N = Double.parseDouble(st.nextToken());
		   double D = Double.parseDouble(st.nextToken());
		   double A = Double.parseDouble(st.nextToken());
		   double B = Double.parseDouble(st.nextToken());
		   double F = Double.parseDouble(st.nextToken());
		   
		   double time = D / (A + B);
		   
		   System.out.print(i + " ");
		   System.out.printf("%.6f", time * F);
		   System.out.println();
	   }
   }

   // 삼각형 분류
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      StringTokenizer st;
      
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 1; i <= T; i++) {
    	  st = new StringTokenizer(br.readLine(), " ");
    	  int A = Integer.parseInt(st.nextToken());
    	  int B = Integer.parseInt(st.nextToken());
    	  int C = Integer.parseInt(st.nextToken());
    	  int[] temp = new int[3];
    	  temp[0] = A;
    	  temp[1] = B;
    	  temp[2] = C;
    	  
    	  Arrays.sort(temp);
    	  
    	  sb.append("Case #").append(i).append(": ");
    	  if(temp[2] >= temp[0] + temp[1]) sb.append("invalid!");
    	  else if(A == B && A == C) sb.append("equilateral");
    	  else if (A == B || A == C || B == C) sb.append("isosceles");
    	  else sb.append("scalene");
    		  
    	  sb.append("\n");
      }
      
      sb.deleteCharAt(sb.length()-1);
      System.out.print(sb);
   }

   // 오버플로우와 모듈러
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   int N = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   String[] temp = br.readLine().split(" ");
	   
	   long sum = 1;
	   for(int i = 0; i < N; i++) {
		   int A = Integer.parseInt(temp[i]);
		   
		   sum *= A % M;
		   sum %= M;
	   }
	   
	   System.out.println(sum);
	   
   }
   
   // 접시 안의 원
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   double T = Integer.parseInt(br.readLine());
	   
	   System.out.printf("%.0f", (T/2) * (T/2));
   }
   
   // 행운의 편지
   public static void test06() throws IOException {
      System.out.println(-1);
   }
   
   // 부호
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
       
       for(int i = 0; i < 3; i++) {
    	   BigInteger sum = new BigInteger("0");
    	   int T = Integer.parseInt(br.readLine());
    	   
    	   while(T --> 0) sum = sum.add(new BigInteger(br.readLine()));
    	   
    	   switch(sum.signum()) {
    	   		case 1 : sb.append("+"); break; 
    	   		case 0 : sb.append("0"); break; 
    	   		case -1 : sb.append("-"); break;
    	   }
    	   
    	   
    	   sb.append("\n");
       }
       
       sb.deleteCharAt(sb.length()-1);
       System.out.print(sb);
       
   }
   
   // Some Sum
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       long T = Long.parseLong(br.readLine());
       
       if(T % 4 == 0) System.out.println("Even");
       else if(T % 2 == 0) System.out.println("Odd");
       else System.out.println("Either");
    	   
       
   }
   
   // Even or Odd?
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());
       
       if(T % 2 == 1) System.out.println("0");
       else if((1 + T) % 2 == 1 && T/2 % 2 == 1) System.out.println("1");
       else System.out.println("2");
   }
   
   // 쿠키애호가
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine(), " ");
		   
		   int N = Integer.parseInt(st.nextToken());
		   int C = Integer.parseInt(st.nextToken());
		   
		   if(N%C == 0) System.out.println(N/C);
		   else System.out.println(N/C + 1);
		   
	   }
   }
}