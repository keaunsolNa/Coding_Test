package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BasicMath2Plus40 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 25869번 - Window on the Wall 
   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int w = Integer.parseInt(st.nextToken());
	   int h = Integer.parseInt(st.nextToken());
	   int d = Integer.parseInt(st.nextToken()) * 2;
	   
	   if(w >= d && h >= d) System.out.println((w - d) * (h - d));
	   else System.out.println(0);
   }
   
   // 25774번 - Simplified Calendar System
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   
	   int d1 = Integer.parseInt(st.nextToken());
	   int m1 = Integer.parseInt(st.nextToken());
	   int y1 = Integer.parseInt(st.nextToken());
	   int k = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   
	   int d2 = Integer.parseInt(st.nextToken());
	   int m2 = Integer.parseInt(st.nextToken());
	   int y2 = Integer.parseInt(st.nextToken());
	   
	   int term = ((y2 - y1) * 360) + ((m2 - m1) * 30) + (d2 - d1);
	   
	   k = (k + term) % 7;
	   
	   if(k == 0) k = 7;
	   
	   System.out.println(k);
	   
   }
   
   // 26027번 - Disc District
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int r = Integer.parseInt(br.readLine());
	   
	   System.out.println(r + " " + 1);
   }
   
   // 25084번 - Infinity Area
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 1; i <= T; i++) {
		   st = new StringTokenizer(br.readLine());
		   double total = 0;
		   
		   long R = Integer.parseInt(st.nextToken());
		   long A = Integer.parseInt(st.nextToken());
		   long B = Integer.parseInt(st.nextToken());
		   
		   while(R != 0) {
			   
			   total += Math.PI * (R * R);
			   total += Math.PI * ((R * A) * (R * A));
			   
			   R = (R * A) / B;
		   }
		   String ans = String.format("%.6f", total);
		   
		   sb.append("Case #" + i + ": " + ans + "\n");
	   }
	   
	   System.out.println(sb);
   }
   
   // 27245번 - Комната
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int w = Integer.parseInt(br.readLine());
	   int l = Integer.parseInt(br.readLine());
	   int h = Integer.parseInt(br.readLine());
	   
	   if(w > l) {
		   
		   if(w / l > 2) {
			   System.out.println("bad");
			   return;
		   }
		   
		   if(l / h < 2) {
			   System.out.println("bad");
			   return;
		   }
		   
	   } else {
		   
		   if(l / w > 2) {
			   System.out.println("bad");
			   return;
		   }
		   
		   if(w / h < 2) {
			   System.out.println("bad");
			   return;
		   }
	   }
	   
	   System.out.println("good");
	   
   }
   
   // 27213번 - Граничные клетки 
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   long A = Long.parseLong(br.readLine());
	   long B = Long.parseLong(br.readLine());
	   
	   if(A == 1 || B == 1) {
		   System.out.println(Math.max(A, B));
	   } else {
		   System.out.println((A * 2) + ((B - 2) * 2));
	   }
   }
   
   // 22061번 - Покупка велосипеда
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine());
		   
		   int a = Integer.parseInt(st.nextToken());
		   int b = Integer.parseInt(st.nextToken());
		   int c = Integer.parseInt(st.nextToken());
		   boolean chk = false;
		   
		   if(c - a <= 0) chk = true;
		   
		   if(a != 0) 
			   if(c - (2 * b) - a <= 0) chk = true;
		   
		   if(chk) sb.append("YES");
		   else sb.append("NO");
		   
		   sb.append("\n");
		   
	   }
	   
	   System.out.println(sb);
   }
   
   // 24867번 - Два станка 
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   
	   long k = Long.parseLong(br.readLine());
	   st = new StringTokenizer(br.readLine());
	   long a = Long.parseLong(st.nextToken());
	   long x = Long.parseLong(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   long b = Long.parseLong(st.nextToken());
	   long y = Long.parseLong(st.nextToken());
	   
	   long A = (Math.max(0, (k - a) * x)) + Math.max(0, ((k - a - b) * y)); 
	   long B = (Math.max(0, (k - b) * y) + Math.max(0, ((k - a - b) * x)));
	   
	   System.out.println(Math.max(B, A));
	   
   }
   
   // 27182번 - Rain Diary 
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int n = Integer.parseInt(st.nextToken());
	   int m = Integer.parseInt(st.nextToken());
	   
	   if(n - 7 > 0) System.out.println(n - 7);
	   else {
		   int last = m + 14 - n;
		   
		   if(m + 7 <= last) System.out.println(m + 7);
		   else System.out.println(m + 7 - last);
	   }
   }
   
   // 4998번 - 저금
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   String input = "";
	   
	   while((input = br.readLine()) != null) {
		   st = new StringTokenizer(input);
		   
		   double n = Double.parseDouble(st.nextToken());
		   double b = Double.parseDouble(st.nextToken());
		   double m = Double.parseDouble(st.nextToken());
		   
		   int year = 0;
		   
		   while(n <= m) {
			   n += (n * (b / 100)) ;
			   year++;
		   }
		   
		   System.out.println(year);
	   }
   }
   
}