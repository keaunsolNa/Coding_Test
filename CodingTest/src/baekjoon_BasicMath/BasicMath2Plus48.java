package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BasicMath2Plus48 {

   public static void main(String[] args) throws IOException {
      test10();
   }
	
   // 22341번 - 사각형 면적 
   public static void test01() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int N = Integer.parseInt(st.nextToken());
	   int C = Integer.parseInt(st.nextToken());
	   
	   int CY = N;
	   int CX = N;
	   for(int i = 0; i < C; i++) {
		   
		   st = new StringTokenizer(br.readLine());
		   
		   int Y = Integer.parseInt(st.nextToken());
		   int X = Integer.parseInt(st.nextToken());
		   
		   if(Y >= CY || X >= CX || X <= 0 || Y <= 0) continue;
		   
           int ny = Y;
           int nx = CX;
           int w = Y * CX;
           
           if (w < CY * X) {
               ny = CY;
               nx = X;
           }
           CY = ny;
           CX = nx;
		   
	   }
	   
	   System.err.println(CY * CX);
	   
   }
   
   // 2896번 - 무알콜 칵테일
   public static void test02() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   double A = Integer.parseInt(st.nextToken());
	   double B = Integer.parseInt(st.nextToken());
	   double C = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   
	   double I = Integer.parseInt(st.nextToken());
	   double J = Integer.parseInt(st.nextToken());
	   double K = Integer.parseInt(st.nextToken());
	   
	   double min = Math.min(A / I, Math.min(B / J, C / K));

	   String aA = (int)(A - I * min) == (A - I * min) ? (int)(A - I * min)+"" : String.format("%.7f", (A - I * min));
	   String aB = (int)(B - J * min) == (B - J * min) ? (int)(B - J * min)+"" : String.format("%.7f", (B - J * min));
	   String aC = (int)(C - K * min) == (C - K * min) ? (int)(C - K * min)+"" : String.format("%.7f", (C - K * min));
	   
	   System.out.println(aA + " " + aB + " " + aC);
   }
   
   // 4328번 - 기초 나머지 계산
   public static void test03() throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String line;
       
       while ((line = br.readLine()) != null) {
    	   
           String[] input = line.split(" ");
           BigInteger b = new BigInteger(input[0]);
           if (b.equals(BigInteger.ZERO)) break;
           
           BigInteger p = new BigInteger(input[1], b.intValue());
           BigInteger m = new BigInteger(input[2], b.intValue());
           BigInteger n = p.mod(m);
           StringBuilder resBuilder = new StringBuilder();
           
           while (n.compareTo(b) >= 0) {
        	   
               resBuilder.append(n.mod(b));
               n = n.divide(b);
           }
           
           resBuilder.append(n);
           String res = resBuilder.reverse().toString();
           System.out.println(new BigInteger(res));
       }
       
   }
   
   // 14561번 - 회문
   public static void test04() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine());
		   
		   long n = Long.parseLong(st.nextToken());
		   int b = Integer.parseInt(st.nextToken());
		   
		   List<Character> list = new ArrayList<>();
		   
		   while (n > 0) {
			   
			   if (n % b < 10) list.add((char) (n % b + '0'));
			   else list.add((char) (n % b - 10 + 'A'));
			   n /= b;
			   
		   }
		   
		   StringBuilder sb = new StringBuilder();
		   for (int i = list.size() - 1; i >= 0; i--) sb.append(list.get(i));
		   
		   System.out.println(isPalindrome(sb.toString()) ? "1" : "0");
	   }
 
   }
   
   private static boolean isPalindrome(String word) {
       for (int i = 0; i < (word.length() / 2); i++) {
           if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
               return false;
           }
       }
       return true;
   }
   
   // 24389번 - 2의 보수
   public static void test05() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   StringBuilder binary = new StringBuilder(Integer.toBinaryString(N));
	   
	   while(binary.length() != 32) binary.insert(0, "0");
	   
	   StringBuilder complement = new StringBuilder();
	   
	   for(int i = 0; i < binary.length(); i++) 
		   complement.append(binary.charAt(i) == '0' ? '1' : '0');
	   
	   complement = addBinaryPlus(complement.toString(), "1");
	   
	   int ans = 0;
	   for(int i = 0; i < 32; i++) {
		   
		   ans += binary.charAt(i) == complement.charAt(i) ? 0 : 1; 
	   }
	   
	   System.out.println(ans);
   }
   
   private static StringBuilder addBinaryPlus(String a, String b) {

	   BigInteger aInt = new BigInteger(a, 2);
       BigInteger bInt = new BigInteger(b, 2);
       BigInteger sum = aInt.add(bInt);

       return new StringBuilder(sum.toString(2));
       
   }
   
   // 25166번 - 배고픈 아리의 샌드위치 구매하기
   public static void test06() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int S = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   
		if(S < 1024) System.out.println("No thanks");

		else {
			
			int nm = S - 1023;
			if((nm & M) == nm) System.out.println("Thanks");
			else System.out.println("Impossible");
		
		}
   }
   
   // 17103번 - 골드바흐 파티션
   public static void test07() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int T = Integer.parseInt(br.readLine());
	   
       boolean[] num = new boolean[1000001];
       num[0] = num[1] = true;
       
       for (int i = 2; i * i <= 1000000; i++) 
           if (!num[i]) 
               for (int j = i + i; j <= 1000000; j += i) 
                   num[j] = true;

       while (T --> 0) {
    	   
           int temp = Integer.parseInt(br.readLine());
           int ans = 0;
           for (int j = 2; j <= temp / 2; j++) 
               if (!num[j] && !num[temp - j]) ans++;
           
           System.out.println(ans);
       }
   }

   // 10158번 - 개미
   public static void test08() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;

	   st = new StringTokenizer(br.readLine());
	   int W = Integer.parseInt(st.nextToken());
	   int H = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   int P = Integer.parseInt(st.nextToken());
	   int Q = Integer.parseInt(st.nextToken());
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   P += T % (W * 2);
	   Q += T % (H * 2);
	   if(P > W) P = Math.abs(W * 2 - P);
	   if(Q > H) Q = Math.abs(H * 2 - Q);
	   
	   System.out.println(P + " " + Q);
   }

   // 5344번 - GCD
   public static void test09() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine());
		   
		   long num1 = Long.parseLong(st.nextToken());
		   long num2 = Long.parseLong(st.nextToken());
		   
		   System.out.println(gcd(num1, num2));
	   }
	   
	   
   }
   
   private static long gcd(long num1, long num2){
       if(num2 == 0) return num1;
       else return gcd(num2, num1 % num2);
   }

   // 24039번 - 2021은 무엇이 특별할까?
   public static void test10() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   boolean[] prime = new boolean[1000001];

	   if(N <= 3) {
		   System.out.println(6);
		   System.exit(0);
	   }
	   
	   for(int i = 2; i < prime.length; i++) {
		   if(isPrime(i)) prime[i] = true;
	   }
	   
	   for(int i = 2; i < N; i++) {
		   
		   if(!prime[i]) continue;
		   for(int j = i + 1; j < N; j++) {
			   
			   if(!prime[j]) continue;
			   
			   if(i * j <= N) break;
			   
			   System.out.println(i * j);
			   return;
		   }
	   }
   }
   
   private static boolean isPrime(long n) {
		
       if(n == 1 || n == 0) return false;

       for(long i = 2; i <= Math.sqrt(n); i++) if(n % i == 0) return false;

       return true;
       
   }

}