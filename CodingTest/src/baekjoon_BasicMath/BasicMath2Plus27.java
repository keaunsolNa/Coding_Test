package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BasicMath2Plus27 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 작도하자! - ②
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      double c = Double.parseDouble(st.nextToken());
      double b = Double.parseDouble(st.nextToken());
      
      if(c%b == 0) System.out.println((int)c/b);
      else System.out.printf("%.10f", c/b);
      
   }
   
   // ZOAC 4
   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      double H = Double.parseDouble(st.nextToken());
      double W = Double.parseDouble(st.nextToken());
      double N = Double.parseDouble(st.nextToken());
      double M = Double.parseDouble(st.nextToken());
      double col = Math.ceil(H / (N + 1));
      double row = Math.ceil(W / (M + 1));
      System.out.println((int) (col * row));
   }

   // Mini Fantasy War
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      int T = Integer.parseInt(br.readLine());
      
      while(T --> 0) {
    	  st = new StringTokenizer(br.readLine());
    	  
    	  int baseHP = Integer.parseInt(st.nextToken());
    	  int baseMP = Integer.parseInt(st.nextToken());
    	  int baseAT = Integer.parseInt(st.nextToken());
    	  int baseBT = Integer.parseInt(st.nextToken());
    	  int plusHP = Integer.parseInt(st.nextToken());
    	  int plusMP = Integer.parseInt(st.nextToken());
    	  int plusAT = Integer.parseInt(st.nextToken());
    	  int plusBT = Integer.parseInt(st.nextToken());
    	  
    	  baseHP = (baseHP + plusHP < 1) ? 1 : baseHP + plusHP;
    	  baseMP = (baseMP + plusMP < 1) ? 1 : baseMP + plusMP;
    	  baseAT = (baseAT + plusAT < 0) ? 0 : baseAT + plusAT;
    	  baseBT = baseBT + plusBT;
    	  long attack = 1 * baseHP + 5 * baseMP + 2 * baseAT + 2 * baseBT;
    	  
    	  System.out.println(attack);
      }
   }
   
   // 암호제작
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   boolean[] prime = new boolean[1000001];
	   
	   String PQ = st.nextToken();
	   int K = Integer.parseInt(st.nextToken());
	   int r = Integer.MAX_VALUE;
	   
	   for(int i = 2; i <= 1000000; i++) {
		   
		   if(prime[i]) continue;
		   for(int j = i + i; j <= 1000000; j += i) prime[j] = true;
		   
	   }
	   
       for (int i = 2; i <= K; i++) {
    	   
           if (prime[i]) continue;
           int m = 0;
           
           for (int j = 0; j < PQ.length(); j++) m = (m * 10 + PQ.charAt(j) - '0') % i;
           
           if (m == 0) {
               r = i;
               break;
           }
       }
       
       if (r < K) System.out.println("BAD " + r);
       else System.out.println("GOOD");
	   
   
   }
   
   // 방 배정
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   Map<Integer, Integer> maleMap = new HashMap<>();
	   Map<Integer, Integer> femaleMap = new HashMap<>();
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   int N = Integer.parseInt(st.nextToken());
	   int K = Integer.parseInt(st.nextToken());
	   
	   for(int i = 1; i <= 6; i++) {
		   maleMap.put(i, 0);
		   femaleMap.put(i, 0);
	   }
	   
	   for(int i = 0; i < N; i++) {
		   st = new StringTokenizer(br.readLine());
		   
		   int gender = Integer.parseInt(st.nextToken());
		   int grade = Integer.parseInt(st.nextToken());
		   
		   if(gender == 0) femaleMap.put(grade, femaleMap.getOrDefault(grade, 0) + 1);
		   else maleMap.put(grade, maleMap.getOrDefault(grade, 0) + 1);
	   }
	   
	   int sum = 0;
	  
	   for(int i = 1; i <= 6; i++) {
		   
		   if(maleMap.get(i) % K == 0) sum += maleMap.get(i) / K;
		   else sum += maleMap.get(i) / K + 1;
		   
		   if(femaleMap.get(i) % K == 0) sum += femaleMap.get(i) / K;
		   else sum += femaleMap.get(i) / K + 1;
	   } 
	   
	   System.out.println(sum);
	   
   }
   
   // 행복
   public static void test06() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       StringTokenizer st = new StringTokenizer(br.readLine());
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       
       while(N --> 0) {
    	   int temp = Integer.parseInt(st.nextToken());
    	   
    	   if(temp > max) max = temp;
    	   if(temp < min) min = temp;
       }
       
       System.out.println(max - min);

   }
   
   // 거꾸로 구구단
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       int N = Integer.parseInt(st.nextToken());
       int K = Integer.parseInt(st.nextToken());
       int max = Integer.MIN_VALUE;
       
       for(int i = 1; i <= K; i++) {
    	   int base = N * i;
    	   int reverse = Integer.parseInt(new StringBuilder(String.valueOf(base)).reverse().toString());
    	   
    	   max = Math.max(max, reverse);
       }
       
       System.out.println(max);
   }
   
   // 폭죽쇼
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int N = Integer.parseInt(st.nextToken());
	   int C = Integer.parseInt(st.nextToken());
	   
	   boolean[] check = new boolean[C];
	   
	   while(N --> 0) {
		   
		   int term = Integer.parseInt(br.readLine());
		   int idx = 1;
		   while(term*idx <= C) {
			   check[term*idx - 1] = true;
			   idx++;
		   }
	   }
	   
	   int sum = 0;
	   for (boolean b : check) if(b) sum++;
	   
	   System.out.println(sum);
   }
   
   // 진법 변환 2
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
       int n = Integer.parseInt(st.nextToken());
       int b = Integer.parseInt(st.nextToken());

       List<Character> list = new ArrayList<>();
       
       while (n > 0) {
    	   
           if (n % b < 10) list.add((char) (n % b + '0'));
           else list.add((char) (n % b - 10 + 'A'));
           n /= b;
           
       }

       for (int i = list.size() - 1; i >= 0; i--) System.out.print(list.get(i));
   }
   
   // 반올림
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   int target = 10;
	   
	   while(T > target) {

		   int mod = T % target;
		   if (mod * 10 / target >= 5) T += target;
		   T -= mod;
		   target *= 10;
		   
	   }
	
	   System.out.println(T);
   }
}