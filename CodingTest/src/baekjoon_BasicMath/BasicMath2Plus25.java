package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BasicMath2Plus25 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 쉽게 푸는 문제
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      StringBuilder sb = new StringBuilder();
      List<Integer> arr = new ArrayList<>();
      for(int i = 1; i <= B; i++) {
    	  
    	  for(int j = 1; j <= i; j++)  arr.add(i);
      }
      
      int sum = 0;
      for(int i = A - 1; i <= B - 1; i ++) sum += arr.get(i);
      
      System.out.println(sum);
   }
   
   // 0의 개수 
   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      
      int T = Integer.parseInt(br.readLine());
      
      while(T --> 0) {
    	  StringBuilder sb = new StringBuilder();
    	  st = new StringTokenizer(br.readLine()," ");
    	  int N = Integer.parseInt(st.nextToken());
    	  int M = Integer.parseInt(st.nextToken());
    	  
    	  for(int i = N; i <= M; i++) sb.append(i);
    	  
    	  System.out.println(countChar(sb.toString(), '0'));
      }
	   
   }
   
   // countChar 
   public static long countChar(String str, char ch) {
       return str.chars()
               .filter(c -> c == ch)
               .count();
   }

   // 주차의 신
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      StringBuilder sb = new StringBuilder();
      int T = Integer.parseInt(br.readLine());
      
      while(T --> 0) {
    	  int n = Integer.parseInt(br.readLine());
    	  
    	  st = new StringTokenizer(br.readLine(), " ");
    	  
    	  int[] arr = new int[n];
    	  
    	  for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
    	  
    	  Arrays.sort(arr);	
    	  
    	  System.out.println((arr[arr.length-1] - arr[0]) * 2);
    	  
      }
   }
   
   // 더하기 
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   
	   System.out.println(A + B);
	   
   }
   
   // 수학은 비대면강의입니다
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   int C = Integer.parseInt(st.nextToken());
	   int D = Integer.parseInt(st.nextToken());
	   int E = Integer.parseInt(st.nextToken());
	   int F = Integer.parseInt(st.nextToken());
	   
	   for(int x = -999; x <= 999; x++) {
		   
		   for(int y = -999; y <= 999; y++) {
			   
			   if((A*x) + (B*y) == C) {
				   
				   if((D*x) + (E*y) == F) {
					   System.out.println(x + " " + y);
					   return;	
					   
				   }
			   }
		   }
	   }
	   
   }
   
   // Divvying Up
   public static void test06() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       
       int sum = 0;
       while(T --> 0) sum += Integer.parseInt(st.nextToken());
       
       if(sum % 3 == 0) System.out.println("yes");
       else  System.out.println("no");
   }
   
   // 백발백준하는 명사수
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       
       int x1 = Integer.parseInt(st.nextToken());
       int y1 = Integer.parseInt(st.nextToken());
       int r1 = Integer.parseInt(st.nextToken());
    		   
       st = new StringTokenizer(br.readLine(), " ");
       
       int x2 = Integer.parseInt(st.nextToken());
       int y2 = Integer.parseInt(st.nextToken());
       int r2 = Integer.parseInt(st.nextToken());
       
       if (1l * (x1 - x2) * (x1 - x2) +1l *(y1 - y2) * (y1 - y2) < 
    		   1l * (r1 + r2) * (r1 + r2)) System.out.println("YES");
       else System.out.println("NO");
   }
   
   // Simple Collatz Sequence 
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   long n = Long.parseLong(br.readLine());
	   int cnt = 0;
	   
	   while(n != 1) {
		   
		   if(n % 2 ==0) n /= 2;
		   else n += 1;
		   cnt++;
		   
	   }
	   
	   System.out.println(cnt);
   }
   
   // Fridge of Your Dreams
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   String binary = br.readLine();
		   
	        int tot = 0;                                         
	        int d = 1;                                          
	 
	        for(int a = binary.length() ; a > 0; a--) {
	 
	            String str = binary.substring(a -1, a);         
	 
	            tot = tot + ( d * Integer.parseInt(str));
	            
	            d = d * 2;
	        }
	 
	        System.out.println(tot);
	   }
       
   }
   
   // Gauß
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int T = Integer.parseInt(br.readLine());
	   int idx = 1;
	   while(T --> 0) {
		   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		   
		   sb.append("Scenario #").append(idx).append(":");
		   long N = Long.parseLong(st.nextToken());
		   long M = Long.parseLong(st.nextToken());
		   
		   long sum = M * (M + 1) / 2;
		   
		   if(N < 0) sum -= Math.abs(N) * (Math.abs(N) + 1) / 2;
		   else sum -= (N-1) * N / 2;
		   
		   sb.append("\n");
		   sb.append(sum);
		   sb.append("\n");
		   sb.append("\n");
		   idx++;
	   }
	   
	   sb.deleteCharAt(sb.length()-1);
	   sb.deleteCharAt(sb.length()-1);
	   System.out.print(sb);
	   
   }
}