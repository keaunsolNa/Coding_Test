package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath2Plus29 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 問題 １
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      
      int N = Integer.parseInt(br.readLine());
      
      int AP = 0;
      int BP = 0;
      while(N --> 0) {
    	  st = new StringTokenizer(br.readLine());
    	  int A = Integer.parseInt(st.nextToken());
    	  int B = Integer.parseInt(st.nextToken());
    	  
    	  if(A > B) AP += A + B;
    	  else if(A < B) BP += A + B;
    	  else {
    		  AP += A;
    		  BP += B;
    	  }
      }
      
      System.out.println(AP + " " + BP);
   }
   
   // 割り勘
   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      String input = "";
      
      while(!(input = br.readLine()).equals("0 0")) {
    	  st = new StringTokenizer(input);
    	  int N = Integer.parseInt(st.nextToken());
    	  int M = Integer.parseInt(st.nextToken());
    	  
    	  st = new StringTokenizer(br.readLine());
    	  int tax = M/N;
    	  int totalMoney = 0;
    	  for(int i = 0; i < N; i++) {
    		  
    		  int money = Integer.parseInt(st.nextToken());
    		  
    		  if(money > tax) totalMoney += tax;
    		  else totalMoney += money;
    			  
    	  }
    	  
    	  System.out.println(totalMoney);
      }
      
   }
   
   // Liczba
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      
      int min = 0;
      for(int i = 2; i < N - 1; i++) {
    	  if(N % i != 0) {
    		  min = i;
    		  break;
    	  }
      }
      
      int max = 0;
      for(int i = N - 1; i >= 2; i--) {
    	  if(N % i != 0) {
    		  max = i;
    		  break;
    	  }
      }
      
      System.out.println(min + " " + max);
   }
   
   // Quality-Adjusted Life-Year 
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   double ans = 0;
	   while(T --> 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   double A = Double.parseDouble(st.nextToken());
		   double B = Double.parseDouble(st.nextToken());
		   
		   ans += A * B;
		   
	   }
	   
	   System.out.printf("%.3f", ans);
   }
   
   // Zbiór
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int N = Integer.parseInt(br.readLine());
	   StringTokenizer st;
	   
	   while(N --> 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   int A = Integer.parseInt(st.nextToken());
		   int B = Integer.parseInt(st.nextToken());
		   
		   boolean chk = true;
		   for(int i = 1; i <= A; i++) {
			   if(A % i == 0 && B % i != 0) {
				   sb.append("NIE" + "\n");
				   chk = false;
				   break;
			   }
		   }
		   
		   if(chk) sb.append("TAK" + "\n");
		   sb.append("\n");
	   }
	   sb.deleteCharAt(sb.length() - 1);
	   System.out.print(sb);
   }
   
   // Stopki
   public static void test06() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int x = Integer.parseInt(st.nextToken());
       int k = Integer.parseInt(st.nextToken());
       int a = Integer.parseInt(st.nextToken());
       
       int ans = -1;
       while(x >= 0) {
    	   
    	   x -= k;
    	   if(x < 0) {
    		   ans = 1; 
    		   break;
    	   }
    	   x -= a;
    	   if(x < 0) {
    		   ans = 0; 
    		   break;
    	   }
       }
       
       System.out.println(ans);
   }
   
   // Academic Distance 
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       int N = Integer.parseInt(br.readLine());
       
       int[][] arr = new int[N][2];
       
       for(int i = 0; i < N; i++) {
    	   st = new StringTokenizer(br.readLine());
    	   
    	   arr[i][0] = Integer.parseInt(st.nextToken());
    	   arr[i][1] = Integer.parseInt(st.nextToken());
    	   
       }
       
       int dis = 0;
       
       for(int i = 0; i < N - 1; i++) 
    	   dis += Math.abs(arr[i + 1][0] - arr[i][0]) + Math.abs(arr[i + 1][1] - arr[i][1]);
   
       System.out.println(dis);
   }
   
   // 이진수 변환
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println(Long.toBinaryString(Long.parseLong(br.readLine())));
   }
   
   // 팩토리얼
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < T; i++) {
		   int N = Integer.parseInt(br.readLine());
		   int ans = 1;

		   for (int j = 1; j <= N; j++) {
			
			   ans *= j;
				
			   ans %= 100000;
				
			   while (ans % 10 == 0) ans /= 10;
			   
		   }
		   
		   System.out.println(ans % 10);
	   }
   }
   
   // 마지막 팩토리얼 수
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	   int N = Integer.parseInt(br.readLine());
	   
	   int[] dp = new int[20001];
	   dp[0] = 1;
	   dp[1] = 1;
	   dp[2] = 2;
	   dp[3] = 6;
	   dp[4] = 4;
	   
	    
	   for (int i = 5; i <= N; i++) {

		   if (i % 5 == 0) {

			   int q = i / 5;
			   dp[i] = ((int) Math.pow(2, q % 4) * dp[q]) % 10; 

		   } else {

			   int before = (i / 5) * 5; 
			   int total = 1;

			   for (int j = i; j > before; j--) total *= (j % 10);
			   

			   total *= dp[before];
	          
			   dp[i] = total % 10;

		   }

	   }
	   
	   System.out.println(dp[N]);
	   
   }
}