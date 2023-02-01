package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BasicMath2Plus41 {

   public static void main(String[] args) throws IOException {
      test05();
   }
   
   // 15415번 - Shattered Cake 
   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   int W = Integer.parseInt(br.readLine());
	   int N = Integer.parseInt(br.readLine());
	   
	   long res = 0;
	   for(int i = 0; i < N; i++) {
		   st = new StringTokenizer(br.readLine());
		   
		   long w = Long.parseLong(st.nextToken());
		   long l = Long.parseLong(st.nextToken());
		   
		   res += w * l;
	   }
	   
	   System.out.println(res / W);
	   
   }
   
   // 1252번 - 이진수 덧셈
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   String A = st.nextToken();
	   String B = st.nextToken();
	   
	   BigInteger A_binary = new BigInteger(A, 2);
	   BigInteger B_binary = new BigInteger(B, 2);  
	   
	   BigInteger sum = A_binary.add(B_binary);
	   String sum_binary = sum.toString(2);
		
	   System.out.println(sum_binary);
   }
   
   
   // 24871번 - Календарь на Альфе Центавра
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   st = new StringTokenizer(br.readLine());
	   
	   long d = Integer.parseInt(st.nextToken());
	   long m = Integer.parseInt(st.nextToken());
	   long w = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   long i = Integer.parseInt(st.nextToken());
	   long j = Integer.parseInt(st.nextToken());
	   long k = Integer.parseInt(st.nextToken());
	   
	   
	    long year = (j - 1) * d + i - 1;
	    long totalDays = (k - 1) * m * d + year;
	    long result = totalDays % w;
	    System.out.println((char)('a' + result));
   }
   
   // 27246번 - Различные квадраты 
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   long n = Long.parseLong(br.readLine());

	   long i = 0;
	   long count = 0;
	   long total = 0;
	   
	   while(total < n) {
		   i += 1;
		   total += (i * i);
		   
		   if(total > n) break;
		   count += 1;
	   }
	   
	   System.out.println(count);
	   
   }
   
   // 27225번 -Класс 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int m = Integer.parseInt(br.readLine());
	   int f = Integer.parseInt(br.readLine());
	   
	   int ans = Math.min(m, f) * 2;
	   
	   if(m > f) ans += ((m - Math.min(m, f)) % 2 == 1) ? 1 : 0;
	   else ans += ((f - Math.min(m, f)) % 2 == 1) ? 1 : 0;
	   
	   System.out.println(ans);
   }
   
   // 
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
   }
   
   // 
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
   }
   
   // 
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
   }
   
   // 
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
   }
   
   // 
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
   }
   
   
}