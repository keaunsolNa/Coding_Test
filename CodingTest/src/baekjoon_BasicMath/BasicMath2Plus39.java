package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BasicMath2Plus39 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 27323번 - 長方形 (Rectangle)
   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int A = Integer.parseInt(br.readLine());
	   int B = Integer.parseInt(br.readLine());
	   
	   System.out.println(A * B);
   }
   
   // 27324번 - ゾロ目 (Same Numbers) 
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = br.readLine();
	   
	   if(input.charAt(0) == input.charAt(1)) System.out.println(1);
	   else System.out.println(0);
   }
   
   // 27328번 - 三方比較 (Three-Way Comparison)
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int A = Integer.parseInt(br.readLine());
	   int B = Integer.parseInt(br.readLine());
	   
	   if(A > B) System.out.println(1);
	   else if(A < B) System.out.println(-1);
	   else System.out.println(0);
   }
   
   // 27327번 - 時間 (Hour)
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int A = Integer.parseInt(br.readLine());
	   
	   System.out.println(A * 24);
   }
   
   // 15036번 - Just A Minim
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   st = new StringTokenizer(br.readLine());
	   double total = 0;
	   for(int i = 0; i < N; i++) {
		   int temp = Integer.parseInt(st.nextToken());
		   
		   switch(temp) {
		   
		       case 0 : total += 2; break;
		       case 1 : total += 1; break;
		       case 2 : total += 0.5; break;
		       case 4 : total += 0.25; break;
		       case 8 : total += 0.125; break;
		       case 16 : total += 0.0625; break;
		   }
	   }
	   
	   System.out.println(total);
   }
   
   // 21146번 - Rating Problems 
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   int n = Integer.parseInt(st.nextToken());
	   int k = Integer.parseInt(st.nextToken());
	   
	   double rest = n - k;
	   double totalP = 0;
	   while(k --> 0) totalP += Integer.parseInt(br.readLine());
	   
	   double min = ((rest * -3) + totalP) / n;
	   double max = ((rest * 3) + totalP) / n;

	   System.out.println(min + " " + max);
	   
   }
   
   // 11161번 - Negative People in Da House
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   
		   int M = Integer.parseInt(br.readLine());
           int people = 0;
           int minPeople = 0;
           
		   for(int i = 0; i < M; i++) {
			   st = new StringTokenizer(br.readLine());
			   
			   int in = Integer.parseInt(st.nextToken());
			   int out = Integer.parseInt(st.nextToken());
			   
               people += (in - out);
               minPeople = Math.min(minPeople, people);
               
		   }
		   
		   System.out.println(Math.abs(minPeople));
	   }

	   
   }
   
   // 27332번 - 11 月 (November) 
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int A = Integer.parseInt(br.readLine());
	   int B = Integer.parseInt(br.readLine());
	   
	   A = A + (B * 7);
	   
	   if(A <= 30) System.out.println(1);
	   else System.out.println(0);
   }
   
   // 16428번 - A/B - 3
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   BigInteger A = new BigInteger(st.nextToken());
	   BigInteger B = new BigInteger(st.nextToken());
	   
	   System.out.println(A.divide(B));
	   System.out.println(A.mod(B));
   }
   
   // 5157번 - Bailout Bonus 
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   
	   int k = Integer.parseInt(br.readLine());
	   
	   for(int i = 1; i <= k; i++) {
		   
		   st = new StringTokenizer(br.readLine());
		   int C = Integer.parseInt(st.nextToken());
		   int B = Integer.parseInt(st.nextToken());
		   int n = Integer.parseInt(st.nextToken());
		   int r = Integer.parseInt(st.nextToken());
		   
		   st = new StringTokenizer(br.readLine());
		   boolean[] index = new boolean[C + 1];
		   for(int j = 0; j < B; j++) index[Integer.parseInt(st.nextToken())] = true;
			   
		   long total = 0;
		   for(int j = 0; j < n; j++) {
			   st = new StringTokenizer(br.readLine());
			   int idx = Integer.parseInt(st.nextToken());
			   int pay = Integer.parseInt(st.nextToken());
			   
			   if(index[idx] == true) total += (pay * r / 100);
			   
		   }
		   
		   System.out.println("Data Set " + i + ":");
		   System.out.println(total);
		   System.out.println();
	   }
	   
	   
   }
   
   
   
}