package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BasicMath2Plus41 {

   public static void main(String[] args) throws IOException {
      test10();
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
   
   // 27225번 - Класс 
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
   
   // 27194번 - Meeting Near the Fountain
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   st = new StringTokenizer(br.readLine());
	   
	   double n = Integer.parseInt(st.nextToken());
	   double T = Integer.parseInt(st.nextToken());
	   
	   double m = Integer.parseInt(br.readLine());
	   
	   st = new StringTokenizer(br.readLine());
	   double x = Integer.parseInt(st.nextToken());
	   double y = Integer.parseInt(st.nextToken());
	   
       double a = 1 * m / (x * 60);
       double b = 1 * (n - m) / (y * 60);
       
       if (a + b < T) 
           System.out.println(0);
       else 
           System.out.println((int)(a + b - T + 1));
	   
   }
   
   // 1350번 - 진짜 공간
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int N = Integer.parseInt(br.readLine());
	   
	   long[] file = new long[N];
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) file[i] = Integer.parseInt(st.nextToken());
	   long cluster = Integer.parseInt(br.readLine());
		   
	   long ans = 0;
	   for(int i = 0; i < N; i++) {
		   if(file[i] != 0) {
			   
			   if(file[i] <= cluster) ans += cluster;
			   else ans += (file[i] % cluster == 0) ? (file[i] / cluster) * cluster : (file[i] / cluster + 1) * cluster;
		   }
	   }
	   
	   System.out.println(ans);
	   
   }
   
   // 2858번 - 기숙사 바닥 
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int R = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   
	   for(int i = 3; ; i++) {
		   for(int j = 3; j <= i; j++) {
			   
			   if(i * 2 + ((j - 2) * 2) == R && i * j - R == B) {
				   
				   System.out.println(Math.max(i, j) + " " + Math.min(i, j));
				   return;
			   }
		   }
	   }
   }
   
   // 21756번 - 지우개 
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int n = Integer.parseInt(br.readLine());
	   List<Integer> list = new ArrayList<>();
	   for(int i = 0; i < n; i++) list.add(i + 1);
	   
	   if(list.size() == 1) {
		   System.out.println(list.get(0));
		   return;
	   }
	   
	   while(true) {
		   
		   for(int i = 0; i < list.size(); i++) if(i == 0 || i % 2 == 0) list.set(i, 0);
		   list.removeAll(Arrays.asList(Integer.valueOf(0)));
		   if(list.size() == 1) break;
	   }
	   
	   System.out.println(list.get(0));
	   
   }
   
   // 9546번 - 3000번 버스
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T -- > 0) {
		   int k = Integer.parseInt(br.readLine());
		   double p = 0;
		   
		   for(int i = 0; i < k; i++) {
			   p += 0.5;
			   p *= 2;
		   }
		   
		   System.out.println((int)p);
		   
	   }
	   
   }
   
   
}