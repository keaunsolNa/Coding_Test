package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus33 {

   public static void main(String[] args) throws IOException {
      test05();
   }
   
   // Basalt Breakdown 
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      float N = Float.parseFloat(br.readLine());
      double X = Math.sqrt((2 * N) / (3 * Math.sqrt(3)));
      
      System.out.printf("%.8f", X * 6);
   }
   
   // Scaling Recipe
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int N = Integer.parseInt(st.nextToken());
	   int x = Integer.parseInt(st.nextToken());
	   int y = Integer.parseInt(st.nextToken());
	   
	   double per = (double)y / x;

	   for(int i = 0; i < N; i++) {
		   double need = Integer.parseInt(br.readLine());
		   
		   System.out.println(Math.round(per * need));
	   }
   }
   
   // Math Homework
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int b = Integer.parseInt(st.nextToken());
	   int d = Integer.parseInt(st.nextToken());
	   int c = Integer.parseInt(st.nextToken());
	   int l = Integer.parseInt(st.nextToken());
	   
	   for(int i = 0; i <= l; i++) {
		   
		   for(int j = 0; j <= l; j++) {
			   
			   for(int q = 0; q <= l; q++) {
				   
				   if((i * b) + (j * d) + (q * c) == l) sb.append(i + " " + j + " " + q + "\n");
			   }
		   }
	   }
	   
	   if(sb.length() == 0) System.out.println("impossible");
	   else System.out.println(sb);
   }
   
   // БОЯДИСВАНЕ НА ОГРАДА
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   int C = Integer.parseInt(st.nextToken());
	   int D = Integer.parseInt(st.nextToken());

	   boolean[] pence = new boolean [1000000000];
	   for(int i = Math.min(A, B); i <= Math.max(A, B); i++) pence[i] = true;
	   for(int i = Math.min(C, D); i <= Math.max(C, D); i++) pence[i] = true;
	   
	   int ans = 0;
	   for(int i = 0; i < pence.length; i++) if(pence[i] == true) ans++;
	   
	   System.out.println(ans);
		   
   }
   
   // Пары 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	  
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   int C = Integer.parseInt(st.nextToken());
	   int D = Integer.parseInt(st.nextToken());
	   
	   System.out.println(Math.max((A * B + C * D), Math.max(A * C + B * D, A * D + B * C)));
	   
   }
   
   // 
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st; 
   }
   
   
   // 
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st; 
   }
   
   
   // 
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st; 
   }
   
   
   // 
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st; 
   }
   
   
   // 
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st; 
   }
   
   
   
}