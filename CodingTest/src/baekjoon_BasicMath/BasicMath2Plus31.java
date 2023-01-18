package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus31 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 덧셈과 곱셈
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      
      long tmp = (s + 1) * s / 2;
      tmp %= 14579;
      long answer = tmp;
      
      for (int i = s + 1; i <= e; i++){
    	  
          answer *= (tmp += i);
          answer %= 14579;
      }
      
      System.out.println(answer);
      
   }
   
   // Chanukah Challenge
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine());
		   int c = Integer.parseInt(st.nextToken());
		   int P = Integer.parseInt(st.nextToken());
		   
		   long total = 0;
		   for(int i = 1; i <= P; i++)  total += (i+1);
		   
		   sb.append(c + " " + total + "\n");
	   }
	   
	   System.out.print(sb);
	   
   }
   
   // Dominos 
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   int sum = 0;
	   for(int i = 0; i <= N; i++) sum += (3 * i + N) * (N - i + 1) /2;
	   System.out.println(sum);
   }
   
   // Volta 
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int X = Integer.parseInt(st.nextToken());
	   int Y = Integer.parseInt(st.nextToken());

	   int ans = 0;
	   for(; (Y - X) * ans < Y; ans++);
	   
	   System.out.println(ans);
   }
   
   // Automated Telephone Exchange
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   
	   int cnt = 0;
	   for(int i = 0; i < 100; i++) {
		   
		   for(int j = 0; j < 100; j++) if(N - i - j == 0) cnt++;
		   
	   }
	   
	   System.out.println(cnt);
   }
   
   // Ship Selection 
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine());
		   int N = Integer.parseInt(st.nextToken());
		   int D = Integer.parseInt(st.nextToken());
		   
		   int ans = 0;
		   
		   for(int i = 0; i < N; i++) {
			   
			   st = new StringTokenizer(br.readLine());
			   double speed = Integer.parseInt(st.nextToken());
			   double fuel = Integer.parseInt(st.nextToken());
			   double fe = Integer.parseInt(st.nextToken());
			   
			   double can = fuel / fe;
			   if(can * speed >= D) ans++;
			   
		   }
		   
		   System.out.println(ans);
	   }
	   
   }
   
   // Cuboids 
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   String input = "";
	   
	   while(!(input = br.readLine()).equals("0 0 0 0")) {
		   st = new StringTokenizer(input);
		   
		   int l = Integer.parseInt(st.nextToken());
		   int w = Integer.parseInt(st.nextToken());
		   int h = Integer.parseInt(st.nextToken());
		   int v = Integer.parseInt(st.nextToken());
		   
		   if(l == 0) {
			   sb.append((v / h / w) + " " + w + " " + h + " " + v);
		   } else if(w == 0) {
			   sb.append(l + " " + (v / h / l) + " " + h + " " + v);
		   } else if(h == 0) {
			   sb.append(l + " " + w + " " + (v / w / l) + " " + v);
		   } else if(v == 0) {
			   sb.append(l + " " + w + " " + h + " " + (l * w * h));
		   }
		   
		   sb.append("\n");
		   
	   }
	   
	   System.out.println(sb);
	   
   }
   
   // Grass Seed Inc. 
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   double C = Double.parseDouble(br.readLine());
	   int L = Integer.parseInt(br.readLine());
	   
	   double cost = 0;
	   for(int i = 0; i < L; i++) {
		   st = new StringTokenizer(br.readLine());
		   
		   double w = Double.parseDouble(st.nextToken());
		   double l = Double.parseDouble(st.nextToken());
		   
		   cost += (w * l * C);
	   }
	   
	   System.out.printf("%.7f",cost);
   }
   
   // ДИНИ 
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());

	   int[] arr = new int[4];
	   for(int i = 0; i < 4; i++) arr[i] = Integer.parseInt(st.nextToken());
	   
	   Arrays.sort(arr);
	   int min = Integer.MAX_VALUE;
	   
	   min = Math.min(min, Math.min(Math.abs(arr[3] - (arr[0] + arr[1] + arr[2])), Math.abs((arr[3] + arr[0]) - (arr[1] + arr[2])))); 
	   
	   System.out.println(min);
   }
   
   // Breaking Branches 
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   
	   if(N % 2 == 1) System.out.println("Bob");
	   else {
		   System.out.println("Alice");
		   System.out.println(N / 2);
	   }
   }
   
}