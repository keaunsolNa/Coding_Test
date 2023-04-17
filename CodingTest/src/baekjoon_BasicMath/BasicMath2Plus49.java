package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class BasicMath2Plus49 {

   public static void main(String[] args) throws IOException {
      test10();
   }
	
   // 27959번 - 초코바
   public static void test01() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int N = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   
	   int tm = 100 * N;
	   
	   if(tm >= M) System.out.println("Yes");
	   else System.out.println("No");
	   
   }
   
   // 24314번 - 알고리즘 수업 - 점근적 표기 2
   public static void test02() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());

	   int a1 = Integer.parseInt(st.nextToken());
	   int a0 = Integer.parseInt(st.nextToken());
	   
	   int c = Integer.parseInt(br.readLine());
	   int n0 = Integer.parseInt(br.readLine());
	   
	   boolean flag = true;
	   for(int i = n0; i < 1000; i++) {
		   
		   if(c * i > a1 * i + a0) flag = false;
	   }
	   
	   System.out.println(flag ? 1 : 0);
   }
   
   // 24315번 - 알고리즘 수업 - 점근적 표기 3
   public static void test03() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   st = new StringTokenizer(br.readLine());

	   int a1 = Integer.parseInt(st.nextToken());
	   int a0 = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   int c1 = Integer.parseInt(st.nextToken());
	   int c2 = Integer.parseInt(st.nextToken());
	   
	   int n0 = Integer.parseInt(br.readLine());
	   
	   boolean flag = true;
	   for(int i = n0; i < 1000; i++) {
		   
		   if(c1 * i > a1 * i + a0 || a1 * i + a0 > c2 * i) flag = false;
	   }
	   
	   System.out.println(flag ? 1 : 0);
	   
   }
   
   // 6219번 - 소수의 자격
   public static void test04() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   String D = st.nextToken();
	   
	   int cnt = 0;
	   for(int i = A; i <= B; i++) {
		   
		   if(isPrime(i) && (i+"").contains(D)) cnt++;
			   
	   }
	   
	   System.out.println(cnt);
	   
   }
   
   private static boolean isPrime(long n) {
		
       if(n == 1 || n == 0) return false;

       for(long i = 2; i <= Math.sqrt(n); i++) if(n % i == 0) return false;

       return true;
       
   }
   
   // 21919번 - 소수 최소 공배수
   public static void test05() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   List<Integer> prime = new ArrayList<>();
	   
	   while(st.hasMoreTokens()) {
		   int temp = Integer.parseInt(st.nextToken());
		   if(isPrime(temp)) prime.add(temp);
	   }
	   
	   Collections.sort(prime);
	   if(prime.isEmpty()) System.out.println(-1);
	   
	   else {
		   
		   BigInteger gcd = new BigInteger(prime.get(1) +"").multiply(new BigInteger(prime.get(0) +"")).divide(gcd(new BigInteger(prime.get(0) +""), new BigInteger(prime.get(1) +"")));
		   
		   for(int i = 2; i < prime.size(); i++) 
			   gcd = gcd.multiply(new BigInteger(prime.get(i) +"")).divide(gcd(gcd, new BigInteger(prime.get(i) +"")));
		   
		   System.out.println(gcd);
	   }
   }
   
   private static BigInteger gcd(BigInteger num1, BigInteger num2){
       if(num2.compareTo(new BigInteger("0")) == 0) return num1;
       else return gcd(num2, num1.mod(num2));
   }
   
   // 2312번 - 수 복원하기
   public static void test06() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   int N = Integer.parseInt(br.readLine());
		   
		   Map<Integer, Integer> map = new TreeMap<>();
		   
		   for(int i = 2; i <= N;) {
			
			   if(N % i == 0) {
				   map.put(i, map.getOrDefault(i, 0) + 1);
				   N /= i;
				   continue;
			   }
			   
			   else i++;
		   }
		   
		   for (Integer key : map.keySet()) 
			   System.out.println(key + " " + map.get(key));
	   }
	   
   }
   
   // 2986번 - 파스칼
   public static void test07() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       int count = 1;
       
       for(int i = 2; i * i <= n; i ++) { 

    	   if(n % i == 0) {
    		   count = n/i; 
    		   break;
    	   }

       }
       
       System.out.println(n-count);
   }
   
   // 12779번 - 상품 is 뭔들
   public static void test08() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   BigInteger A = new BigInteger(st.nextToken());
	   BigInteger B = new BigInteger(st.nextToken());
	   
	   BigInteger C = B.sqrt().subtract(A.sqrt());
	   
	   if(C.compareTo(BigInteger.ZERO) == 0) {
		   System.out.println(0);
		   return;
	   }
	   
	   BigInteger G = gcd(C, B.subtract(A));

	   System.out.println(C.divide(G) + "/" + (B.subtract(A).divide(G)));
       
   }
   
   // 12437번 - 새로운 달력 (Small)
   public static void test09() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       StringBuilder sb = new StringBuilder();
       int t = Integer.parseInt(st.nextToken());
       
       for (int k = 1; k <= t; k++) {
    	   
           st = new StringTokenizer(br.readLine());
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());
           int c = Integer.parseInt(st.nextToken());

           int res = 0;
           int tmp = 0;
           
           for (int i = 0; i < a; i++) {
        	   
               res += (b + tmp) / c;
               if ((b + tmp) % c != 0) {
            	   
                   res++;
                   tmp = (b + tmp) % c;
                   
               } else tmp = 0;
           }
           
           sb.append("Case #" + k + ": " + res).append("\n");
       }

       System.out.println(sb);
   }
   
   // 27890번 - 특별한 작은 분수
   public static void test10() throws IOException {
	   
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int x0 = Integer.parseInt(st.nextToken());
       int N = Integer.parseInt(st.nextToken());
       
       int time = 0;
       while(time != N) {
    	   
    	   x0 = x0 % 2 == 0 ? x0 / 2 ^ 6 : x0 * 2 ^ 6;
    	   time++;
       }

       System.out.println(x0);
	   
   }

}