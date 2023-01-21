package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BasicMath2Plus35 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // ZAMKA 
   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   int L = Integer.parseInt(br.readLine());
	   int D = Integer.parseInt(br.readLine());
	   int X = Integer.parseInt(br.readLine());
	   
	   int min = Integer.MAX_VALUE;
	   int max = Integer.MIN_VALUE;
	   
	   for(int i = L; i <= D; i++) {
		   
		   int x = 0;
		   
		   for(int j = 0; j < (i+"").length(); j++) {
			   
			   x += Character.getNumericValue((i+"").charAt(j));
		   }
		   
		   if(x == X) {
			   
			   min = Math.min(min, i);
			   max = Math.max(max, i);
			   
		   }
	   }
	   
	   System.out.println(min);
	   System.out.println(max);
   }
   
   // Sarah's Toys
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();

	   String input = "";
	   
	   while(!(input = br.readLine()).equals("0 0")) {
		   st = new StringTokenizer(input);
		   
		   int a = Integer.parseInt(st.nextToken());
		   int b = Integer.parseInt(st.nextToken());
		   
		   int two = Math.max((a - b) / 2 - (a - b) % 2, 0);
		   int three = a - b <= 1 ? 0 : (a - b) % 2;
		   
		   System.out.println(two + " " + three);
	   }
   }
   
   // Heart Rate
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   while(N --> 0) {
		   st = new StringTokenizer(br.readLine());
		   double b = Double.parseDouble(st.nextToken());
		   double p = Double.parseDouble(st.nextToken());
		   
		   double bpm = 60.0 * b / p;
		   double min = bpm * (1 - 1.0 / b) ;
		   double max = bpm * (1 + 1.0 / b) ;
		   
		   System.out.printf("%.4f", min);
		   System.out.print(" ");
		   System.out.printf("%.4f", bpm);
		   System.out.print(" ");
		   System.out.printf("%.4f", max);
		   
		   System.out.println();
	   }
   }
   
   // Papier kamień nożyczki 
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	
	   int Z = Integer.parseInt(br.readLine());
	   while(Z -- > 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   double[] adam = new double[3];
		   adam[0] = Double.parseDouble(st.nextToken());
		   adam[1] = Double.parseDouble(st.nextToken());
		   adam[2] = Double.parseDouble(st.nextToken());
		   
		   st = new StringTokenizer(br.readLine());
		   double[] gosia = new double[3];
		   gosia[0] = Double.parseDouble(st.nextToken());
		   gosia[1] = Double.parseDouble(st.nextToken());
		   gosia[2] = Double.parseDouble(st.nextToken());
		   
		   double p = 0;

		   for (int j = 0; j < 3; j++) 
			   p += adam[j] *  gosia[(j + 1) % 3] - adam[j] * gosia[(j + 2) % 3];
	        
	        if(p > 0) System.out.println("ADAM");
	        else if (p < 0) System.out.println("GOSIA");
	        else System.out.println("=");
		   
	   }
   }
   
   // Сапсан 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   System.out.println(N / 6 * 4);
   }
   
   // カレー作り
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   List<Integer> res = new ArrayList<>();
	   
	   while(true) {
		   
		   st = new StringTokenizer(br.readLine());
		   int R0 = Integer.parseInt(st.nextToken());
		   int W0 = Integer.parseInt(st.nextToken());
		   int C = Integer.parseInt(st.nextToken());
		   int R = Integer.parseInt(st.nextToken());
		   
           if (R0 == 0 && W0 == 0 && C == 0 && R == 0) break;

           if (W0 * C <= R0) res.add(0);
           else res.add((W0 * C - R0 + R - 1) / R);
           
	   }
	   
	   for (Integer integer : res) 
		   System.out.println(integer);
	   
   }
   
   // Another Cow Number Game 
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   long N = Long.parseLong(br.readLine());
	   
	   int point = 0;
	   while(N != 1) {
		   
		   if(N % 2 != 0) N = N * 3 + 1;
		   else N /= 2;
		   point++;
	   }
	   
	   System.out.println(point);
   }
   
   // 세 막대
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int[] arr = new int[3];
	   arr[0] = Integer.parseInt(st.nextToken());
	   arr[1] = Integer.parseInt(st.nextToken());
	   arr[2] = Integer.parseInt(st.nextToken());
	   
	   Arrays.sort(arr);
	   
	   int res = arr[0] + arr[1] + Math.min(arr[2], arr[0] + arr[1] - 1);
	   
	   System.out.println(res);
	   
   }
   
   // Лифт 
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int n = Integer.parseInt(st.nextToken());
	   int k = Integer.parseInt(st.nextToken());
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   
	   int ele = (k - 1) * b + ((n - 1) * b);
	   int walk = (n - 1) * a;
	   System.out.println(ele + " " + walk);
   }
   
   // 자전거 속도 
   public static void test10() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int i = 1;
	
	   while(true) {
		
		   StringTokenizer st = new StringTokenizer(br.readLine());
		   double A = Double.parseDouble(st.nextToken());
		   double B = Double.parseDouble(st.nextToken());
		   double C = Double.parseDouble(st.nextToken());

		   if(B == 0) break;

		   C = (C / 60) / 60;
			
		   double distance = ((((A * 3.1415927) * B) / 12) / 5280);
		   double MPH = (distance / C); 
			
		   sb.append("Trip #" + i + ": " + String.format("%.2f", distance) + " " + String.format("%.2f", MPH) + "\n");
		   i++;
		}

	   System.out.println(sb);
   }
   
   
	   
   
}