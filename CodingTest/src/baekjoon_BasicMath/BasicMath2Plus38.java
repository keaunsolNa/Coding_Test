package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus38 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 11368번 - A Serious Reading Problem 
   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   while(true) {
		   st = new StringTokenizer(br.readLine());
		   
		   long A = Long.parseLong(st.nextToken());
		   long B = Long.parseLong(st.nextToken());
		   long C = Long.parseLong(st.nextToken());
		   long D = Long.parseLong(st.nextToken());
		   
		   if(A == 0 && B == 0 && C == 0 && D == 0) break;
		   
		   long sum = (long) Math.pow(A, B);
		   sum = (long) Math.pow(sum, C);
		   sum = (long) Math.pow(sum, D);
		   
		   System.out.println(sum);
	   }
   }
   
   // 21105번 - New Financial Year 
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   while(N --> 0) {
		   st = new StringTokenizer(br.readLine());
		   
		   double P = Double.parseDouble(st.nextToken());
		   double C = Double.parseDouble(st.nextToken());
		   
		   System.out.printf("%.9f", P / (C + 100) * 100);
		   System.out.println();
	   }

   }
   
   // 6779번 - Who Has Seen The Wind 
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int H = Integer.parseInt(br.readLine());
	   int M = Integer.parseInt(br.readLine());
	   
	   int t;
	   boolean falling = true;
	   for(t = 1; t <= M; t++) {
		   
		   double A = ((-6 * (Math.pow(t, 4))) + (H * (Math.pow(t, 3))) + (2 * (Math.pow(t, 2))) + t);
		   
		   if(A <= 0) break;
		   if(t == M) {
			   falling = false;
			   break;
		   }
	   }
	   
	   if(falling) System.out.println("The balloon first touches ground at hour: " + t);
	   else System.out.println("The balloon does not touch ground in the given time.");
	   
   }
   
   // 11434번 - Ampelmännchen 
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   
	   int K = Integer.parseInt(br.readLine());
	   
	   for(int i = 1; i <= K; i++) {
		   
		   st = new StringTokenizer(br.readLine());
		   
		   int n = Integer.parseInt(st.nextToken());
		   int W = Integer.parseInt(st.nextToken());
		   int E = Integer.parseInt(st.nextToken());
		   
		   int ans = 0;
		   
		   for(int j = 0; j < n; j++) {
			   st = new StringTokenizer(br.readLine());
			   
			   int a = Integer.parseInt(st.nextToken());
			   int b = Integer.parseInt(st.nextToken());
			   int c = Integer.parseInt(st.nextToken());
			   int d = Integer.parseInt(st.nextToken());
			   
			   
			   ans += Math.max(a * W + c * E, E * d + b * W);
		   }
		   
		   System.out.print("Data Set " +  i + ":");
		   System.out.println();
		   System.out.println(ans);
		   System.out.println();
	   
	   }	   
   }
   
   // 26548번 - Quadratics 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   double a = Double.parseDouble(st.nextToken());
		   double b = Double.parseDouble(st.nextToken());
		   double c = Double.parseDouble(st.nextToken());
		   
		   double x = ((b * -1) + Math.sqrt(b * b - (4 * a * c))) / (2 * a);
		   double y = ((b * -1) - Math.sqrt(b * b - (4 * a * c))) / (2 * a);
		   
		   System.out.printf("%.3f", x);
		   System.out.print(", ");
		   System.out.printf("%.3f", y);
		   System.out.println();
	   }
   }
   
   // 9945번 - Centroid of Point Masses  
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   
	   int idx = 1;
	   while(true) {
		   
		   int n = Integer.parseInt(br.readLine());
		   
		   if(n < 0) break;
		   
		   double X = 0;
		   double Y = 0;
		   double Z = 0;
		   
		   for(int i = 0; i < n; i++) {
			   st = new StringTokenizer(br.readLine());
			   
			   double x = Integer.parseInt(st.nextToken());
			   double y = Integer.parseInt(st.nextToken());
			   double z = Integer.parseInt(st.nextToken());
			   
			   X += x * z; 
			   Y += y * z; 
			   Z += z;
		   }
		   
		   
		   String XA = String.format("%.2f", X/Z);
		   String XB = String.format("%.2f", Y/Z);
		   sb.append("Case " + idx + ": " + XA + " " + XB);
		   sb.append("\n");
		   idx++;
		   
		   br.readLine();
	   }
	   
	   System.out.print(sb);
   }
   
   // 27130번 - Long Multiplication
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   BigInteger A = new BigInteger(br.readLine());
	   String B = br.readLine();
	   
	   sb.append(A + "\n");
	   sb.append(B + "\n");
	   
	   for(int i = B.length() - 1; i >= 0; i--) {
		   
		   sb.append(A.multiply(new BigInteger(B.charAt(i) + "")) + "\n");
	   }
	   
	   sb.append(A.multiply(new BigInteger(B)));
	   System.out.println(sb);
   }
   
   // 26509번 - Triangle 
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   int[] one = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		   Arrays.sort(one);
		   
		   st = new StringTokenizer(br.readLine());
		   int[] two = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		   Arrays.sort(two);
		   
		   String ans = "NO";
		   if((one[0] * one[0]) + (one[1] * one[1]) == one[2] * one[2]) {
			   if((two[0] * two[0]) + (two[1] * two[1]) == two[2] * two[2]) {
				   if(one[0] == two[0] && one[1] == two[1] && one[2] == two[2]) ans = "YES";
			   }
		   }
		   
		   sb.append(ans + "\n");
	   }
	   
	   System.out.print(sb);
   }
   
   // 21645번 - Ролевая игра
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int n = Integer.parseInt(st.nextToken());
	   int m = Integer.parseInt(st.nextToken());
	   int k = Integer.parseInt(st.nextToken());
	   
	   long ans = 0;
	   
	   if (m < k) ans = n * m;
	   else ans = n * ((k - 1) + m / k);
		
	   System.out.println(ans);
   }
   
   // 17466번 - N! mod P (1)
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   long N = Long.parseLong(st.nextToken());
	   long P = Long.parseLong(st.nextToken());
	   
	   System.out.println(factorial(N, P));
	   
   }
   
   private static long factorial(long N, long P) {
		
	   long result = 1;

	   for (long i = 1; i <= N; i++) {

		   result = result * i;
		   result = result % P;
	   }
	 
	   return result;

   }
   
   
}