package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BasicMath2Plus45 {

   public static void main(String[] args) throws IOException {
      test04();
   }
   
   // 14710번 - 고장난 시계
   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st  = new StringTokenizer(br.readLine());
	   
	   int H = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   int Z = H % 30;
	   
	   if(Z * 12 == M )  System.out.println("O");
	   else System.out.println("X");
	   
   }
   
   // 19563번 - 개구리 1
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   int c = Integer.parseInt(st.nextToken());
	   
	   int plus = Math.abs(a) + Math.abs(b);
	   
	   if(plus <= c && ((plus % 2 == 0 && c % 2 == 0) || (plus % 2 != 0 && c % 2 != 0))) System.out.println("YES");
	   else System.out.println("NO");
	   
   }
   
   // 15792번 - A/B - 2 
   @SuppressWarnings("deprecation")
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String[] num = br.readLine().split(" ", -1);
	   System.out.println(new BigDecimal(num[0]).divide(new BigDecimal(num[1]), 1000, BigDecimal.ROUND_HALF_UP));
   }
   
   // 17206번 - 준석이의 수학 숙제
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   int T = Integer.parseInt(br.readLine());
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
       int[] answer = new int[80001];
       answer[10] = 25;
       int tmp = 25;
	   
       for (int i = 11; i <= 80000; i++) {
    	   
    	   if (i % 3 == 0 || i % 7 == 0) {
               answer[i] = tmp + i;
               tmp = answer[i];
           }
         
    	   else answer[i] = tmp;

       }
	   
       for (int i = 0; i < T; i++) {
           int n = Integer.parseInt(st.nextToken());
           sb.append(answer[n] + "\n");
       }
       
       System.out.println(sb);	   
   }
   
   //
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   
	   
   }
   
   //
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   
	   
   }
   
   //
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   
	   
   }
   
   //
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   
	   
   }
   
   //
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   
	   
   }
   
   //
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   
	   
   }
   
   
   
}