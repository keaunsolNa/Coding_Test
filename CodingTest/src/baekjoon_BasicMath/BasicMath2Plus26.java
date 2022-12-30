package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus26 {

   public static void main(String[] args) throws IOException {
      test02();
   }
   
   // 보물
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      
      int[] A = new int[N];
      int[] B = new int[N];
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
      
      st = new StringTokenizer(br.readLine());
      for(int i = 0; i < N; i++) B[i] = Integer.parseInt(st.nextToken());
      
      Arrays.sort(A);
      Arrays.sort(B);
      
      int sum = 0;
      for(int i = 0; i < N; i++) sum += A[i] * B[N - i - 1];
      
      
      System.out.println(sum);
      
   }
   
   // 
   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

   }

   //
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      StringBuilder sb = new StringBuilder();
   }
   
   //  
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   
   }
   
   // 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   
	   
   }
   
   //
   public static void test06() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       
   }
   
   //
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
   }
   
   // 
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   }
   
   // 
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
       
   }
   
   //
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int T = Integer.parseInt(br.readLine());
	   int idx = 1;
	   
   }
}