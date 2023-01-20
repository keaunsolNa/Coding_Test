package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus33 {

   public static void main(String[] args) throws IOException {
      test10();
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
   
   // Sums 
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   int number = Integer.parseInt(br.readLine());
		   
		   long sum1 = 0;
		   long sum2 = 0;
		   long sum3 = 0;
		   
		   for(int i = 1; i <= number; i++) sum1 += i;
		   for(int i = 1; i <= number * 2; i += 2) sum2 += i;
		   for(int i = 2; i <= number * 2; i += 2) sum3 += i;
		   
		   sb.append(sum1 + " " + sum2 + " " + sum3 + "\n");
		   
	   }
	   
	   System.out.println(sb);
   }
   
   // Unit Conversion 
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st; 
	   
	   st = new StringTokenizer(br.readLine());
	   
	   double x = Double.parseDouble(st.nextToken());
	   double y = Double.parseDouble(st.nextToken());
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   double A = Double.parseDouble(st.nextToken());
		   char key = st.nextToken().charAt(0);
		   
		   if(key == 'A') sb.append(A / x * y);
		   else sb.append(A / y * x);
			   
		   sb.append("\n");
	   }
	   
	   System.out.println(sb);
   }
   
   // Number Fun
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st; 
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   while(N --> 0) {
		   st = new StringTokenizer(br.readLine());
		   double A = Integer.parseInt(st.nextToken());
		   double B = Integer.parseInt(st.nextToken());
		   double C = Integer.parseInt(st.nextToken());
		   
		   boolean can = false;
		   
		   if(A + B == C) can = true;
		   if(A - B == C) can = true;
		   if(A * B == C) can = true;
		   if(A / B == C) can = true;
		   if(B + A == C) can = true;
		   if(B - A == C) can = true;
		   if(B * A == C) can = true;
		   if(B / A == C) can = true;
		   
		   if(can) sb.append("Possible");
		   else sb.append("Impossible");
		   
		   sb.append("\n");
		   
	   }
	   
	   System.out.println(sb);
	   
   }
   
   // Life Savings 
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st; 
	   
	   st = new StringTokenizer(br.readLine());
	   
	   double[] p = new double[3];
	   
	   p[0] = Double.parseDouble(st.nextToken());
	   p[1] = Double.parseDouble(st.nextToken());
	   p[2] = Double.parseDouble(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   
	   double c1 = Double.parseDouble(st.nextToken());
	   double c2 = Double.parseDouble(st.nextToken());
	   double c3 = Double.parseDouble(st.nextToken());
	   
	   Arrays.sort(p);
	   
	   double one = (p[0] + p[1] + p[2]) * (c1 / 100);
	   double two = ((p[2] * (Math.max(c2, c3) / 100)) + (p[1] * (Math.min(c2, c3) / 100)));
	   
	   if(one > two) System.out.printf("one " + "%.2f",one);
	   else System.out.printf("two " + "%.2f", two);
   }
   
   // ПЪТУВАНЕ 
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st; 
	   st = new StringTokenizer(br.readLine());
	   int t1 = Integer.parseInt(st.nextToken());
	   int t2 = Integer.parseInt(st.nextToken());
	   
	   int startTime = t1 * 60 + t2;
	   
	   int t3 = Integer.parseInt(br.readLine());
	   st = new StringTokenizer(br.readLine());
	   int t4 = Integer.parseInt(st.nextToken());
	   int t5 = Integer.parseInt(st.nextToken());
	   
	   int goingTime = t4 * 60 + t5;
	   
	   int stu = Integer.parseInt(br.readLine());
	   
	   int t6 = Integer.parseInt(br.readLine());
	   int totalT3 = t6 * (stu + 1);
	   
	   
	   int ansM = startTime -  goingTime - totalT3 - t3 - 10;
	   
	   int H = ansM / 60;
	   int M = ansM % 60;
	   
	   if(H < 10) {
		   
		   if(M < 10) System.out.println("0" + H + " " + "0" + M);
		   else System.out.println("0" + H + " " + M);
		   
	   } else if(M < 10) {
		   
		   System.out.println(H + " 0" + M);
	   } else {
		   
		   System.out.println(H + " " + M);
		   
	   }
	   
   }
   
}