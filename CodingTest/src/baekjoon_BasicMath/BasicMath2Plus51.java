package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus51 {

   public static void main(String[] args) throws IOException {
      test10();
   }
	
   // 18795번 - 이동하기 3
   public static void test01() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int N = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   
	   long sum = 0;
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) sum += Integer.parseInt(st.nextToken());
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < M; i++) sum += Integer.parseInt(st.nextToken());
	   
	   System.out.println(sum);
   }
   
   // 22950번 - 이진수 나눗셈
   public static void test02() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   String M = br.readLine();
	   M = M.replaceFirst("^0+(?!$)", "");	   
	   int K = Integer.parseInt(br.readLine());
	   
	   if(!M.contains("1")) {
		   System.out.println("YES");
		   System.exit(0);
	   }
	   
	   if(K == 0) {
		   System.out.println("YES");
		   System.exit(0);
	   }
	   
	   int count = 0;
	   for(int i = M.length() - 1; i >= 0; i--) {
		   
		   if(M.charAt(i) == '1') break;
		   if(M.charAt(i) == '0') count++;
	   }
	   
	   if(count >= K) System.out.println("YES");
	   else System.out.println("NO");
	   
   }
   
   // 11068번 - 회문인 수
   public static void test03() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0){
		   
		   int target = Integer.parseInt(br.readLine());
		   boolean chk = false;
		   
		   for(int r = 2; r <= 64 && !chk; r++) 
			   chk = isPalindrom(target, r);
		   
		   System.out.println(chk ? 1 : 0);
	   }
   }
   
   private static boolean isPalindrom(int n, int radix) {
	   ArrayList<Integer> convert = new ArrayList<>();
	   
	   while(n != 0) {
		   convert.add(n % radix);
		   n /= radix;
	   }
	   
	   for(int i = 0; i < convert.size()/2; i++) 
		   if(convert.get(i) != convert.get(convert.size() - 1 - i)) return false;
	   return true;
	   
   }
   
   // 1735번 - 분수 합
   public static void test04() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   int c = Integer.parseInt(st.nextToken());
	   int d = Integer.parseInt(st.nextToken());
	   
	   int A = (a * d) + (c * b);
	   int B = b * d;
	   
	   int C = GCD(A, B);
	   
	   System.out.print(A/C);
	   System.out.println(" " + B/C);
   }

   private static int GCD(int a, int b){ 
   
	   if (a%b == 0) return b;
	   return GCD(b, a % b);
   
   }
   
   // 4134번 - 다음 소수
   public static void test05() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int T = Integer.parseInt(br.readLine());
	   long max = 4000000007L;
	   
	   while(T --> 0) {

		   long test = Long.parseLong(br.readLine());
		   for(long i = test; i <= max; i++) {
			   
			   if(isPrime(i)) {
				   System.out.println(i);
				   break;
			   }
		   }
	   }
   }
   
   public static boolean isPrime(long n) {
		
	   if(n == 1 || n == 0) return false;

	   for(long i = 2; i <= Math.sqrt(n); i++) 
		   if(n%i == 0) return false;

	   return true;
        
   }
	
   // 2485번 - 가로수
   public static void test06() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   int[] tree = new int[T];
	   int[] gaps = new int[T - 1];
	   for(int i = 0; i < T; i++) {
		   
		   tree[i] = Integer.parseInt(br.readLine());
		   if(i > 0) gaps[i - 1] = tree[i] - tree[i - 1];
		   
	   }
	   
       for (int i = 0; i <= gaps.length - 2; i++) 
    	   gaps[i + 1] = GCD(gaps[i], gaps[i + 1]);

       int gap = gaps[gaps.length - 1];

       System.out.println((tree[T - 1] - tree[0]) / gap - (T - 1));	   
   }
   
   // 13909번 - 창문 닫기
   public static void test07() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   System.out.println((int)Math.floor(Math.sqrt(N)));
   }
   
   // 24313번 - 알고리즘 수업 - 점근적 표기 1
   public static void test08() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int a1 = Integer.parseInt(st.nextToken());
	   int a0 = Integer.parseInt(st.nextToken());
	   
	   int c = Integer.parseInt(br.readLine());
	   int n0 = Integer.parseInt(br.readLine());
	   
       int result = (a1 * n0 + a0 <= c * n0) && (c >= a1)?1:0;
       System.out.println(result);
   }
   
   // 28113번 - 정보섬의 대중교통
   public static void test09() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int N = Integer.parseInt(st.nextToken());
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   
	   if(A > B) System.out.println("Subway");
	   else if(A < B) System.out.println("Bus");
	   else System.out.println("Anything");
   }
   
   // 28097번 - 모범생 포닉스
   public static void test10() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   int time = 0;
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) {
		   
		   time += Integer.parseInt(st.nextToken());
		   if(i < N - 1) time += 8;
	   }
	   
	   System.out.println(time / 24 + " " + time % 24);
   }
   
   

}