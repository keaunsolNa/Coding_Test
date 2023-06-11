package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus52 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 6871번 - The Cell Sell
   public static void test01() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int day = Integer.parseInt(br.readLine());
	   int night = Integer.parseInt(br.readLine());
	   int weekend = Integer.parseInt(br.readLine());
	   
	   double planA = day > 100 ? day - 100 : 0;
	   planA *= 25;
	   planA += night * 15;
	   planA += weekend * 20;
	   
	   double planB = day > 250 ? day - 250 : 0;
	   planB *= 45;
	   planB += night * 35;
	   planB += weekend * 25;

	   System.out.println("Plan A costs " + planA / 100);
	   System.out.println("Plan B costs " + planB / 100);
	   System.out.println(planB > planA ? "Plan A is cheapest." : planA > planB ? "Plan B is cheapest." : "Plan A and B are the same price.");
	   
   }
   
   // 27855번 - Cornhole
   public static void test02() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   int A2 = Integer.parseInt(st.nextToken());
	   int B2 = Integer.parseInt(st.nextToken());
	   
	   int AS = 3 * A + B;
	   int BS = 3 * A2 + B2;
	   
	   if(AS > BS) System.out.println(1 + " " + (AS - BS));
	   else if(AS < BS) System.out.println(2 + " " + (BS - AS));
	   else System.out.println("NO SCORE");
	   
   }
   
   // 28061번 - 레몬 따기
   public static void test03() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   int house = N + 1;
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int max = 0;
	   for(int i = 1; i <= N; i++) {
		   
		   int tree = Integer.parseInt(st.nextToken());
		   
		   max = Math.max(max, i - house + tree);
	   }
	   
	   System.out.println(max);
   }
   
   // 14730번 - 謎紛芥索紀 (Small)
   public static void test04() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   int prime = 0;
	   
	   for(int i = 0; i < N; i++) {
		   
		   StringTokenizer st = new StringTokenizer(br.readLine());
		   int C = Integer.parseInt(st.nextToken());
		   int K = Integer.parseInt(st.nextToken());
		   
		   prime += C * K ;
	   }
	   
	   System.out.println(prime);
   }
   
   // 14723번 - 이산수학 과제
   public static void test05() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   int i = 1;
	   
	   while(i * (i + 1) / 2 < N) i += 1;
	   

	   int b = N - (i - 1) * i / 2;
	   int a = i + 1 - b;
			   
	   System.out.println(a + " " + b);
   }
   
   // 4436번 - 엘프의 검
   public static void test06() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = "";
	   
	   while((input = br.readLine()) != null) {
		   
		   int n = Integer.parseInt(input);
		   int k = 0;
		   long s = 0;
		   int rest = 10;
		   boolean[] check = new boolean[10];
		   
		   while(rest > 0) {
			   
			   k++;
			   s += n;
			   
			   long q = s;
			   while(q > 0) {
				   int r = (int)(q % 10);
				   q /= 10;
				   
				   if(!check[r]) {
					   check[r]	= true;
					   rest--;
					   
					   if(rest == 0) break;
				   }
			   }
		   }
		   System.out.println(k);
	   }
	   
   }
   
   // 28224번 - Final Price
   public static void test07() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   int price = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < N - 1; i++) price += Integer.parseInt(br.readLine());
	   
	   System.out.println(price);
   }
   
   // 1816번 - 암호 키
   public static void test08() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());	   
	   sieve(1000001);
	   
	   for(int i = 0; i < N; i++) {
		   
		   long S = Long.parseLong(br.readLine());
		   boolean chk = true;
		   
		   for(int j = 2; j < 1000001; j++) {
			   if(isPrime[j] && S % j == 0) {
				   chk = false;
			   }
		   }
		   
		   System.out.println(chk ? "YES" : "NO");
	   }
   }

   private static boolean[] isPrime;
   private static void sieve(int N) {
		
	   isPrime = new boolean[N + 1];
	   Arrays.fill(isPrime, true);
	   isPrime[0] = false;
	   isPrime[1] = false;

	   for (int i = 2; i * i <= N; i++) {
		   if (isPrime[i]) {
			   for (int j = 2 * i; j < N + 1; j += i) {
				   isPrime[j] = false;
			   }
		   }
	   }
   }
	
   // 1312번 - 소수
   public static void test09() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   int N = Integer.parseInt(st.nextToken());
	
	   int result = 0;
	   for(int i = 0; i < N; i++) {
		   A = A % B * 10;
		   result = A / B;
	   }

	   System.out.println(result);
   }
   
   // 1094번 - 막대기
   public static void test10() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   int stick = 64;
	   
	   int ans = 0;
	   
	   while(stick > 0) {
		   
		   if(stick <= N) {
			   N -= stick;
			   ans++;
		   }
		   
		   if(N == 0) break;
		   
		   stick /= 2;
			   
	   }
	   
	   System.out.println(ans);
	   
   }
   
}