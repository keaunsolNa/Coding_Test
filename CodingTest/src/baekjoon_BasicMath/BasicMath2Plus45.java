package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BasicMath2Plus45 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 14710번 - 고장난 시계
   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st  = new StringTokenizer(br.readLine());
	   
	   int H = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   int Z = H % 30;
	   
	   if(Z * 12 == M )  System.out.println("O");
	   else System.out.println("X");
	   
   }
   
   // 19563번 - 개구리 1
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   int c = Integer.parseInt(st.nextToken());
	   
	   int plus = Math.abs(a) + Math.abs(b);
	   
	   if(plus <= c && ((plus % 2 == 0 && c % 2 == 0) || (plus % 2 != 0 && c % 2 != 0))) System.out.println("YES");
	   else System.out.println("NO");
	   
   }
   
   // 15792번 - A/B - 2 
   @SuppressWarnings("deprecation")
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String[] num = br.readLine().split(" ", -1);
	   System.out.println(new BigDecimal(num[0]).divide(new BigDecimal(num[1]), 1000, BigDecimal.ROUND_HALF_UP));
   }
   
   // 17206번 - 준석이의 수학 숙제
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   int T = Integer.parseInt(br.readLine());
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
       int[] answer = new int[80001];
       answer[10] = 25;
       int tmp = 25;
	   
       for (int i = 11; i <= 80000; i++) {
    	   
    	   if (i % 3 == 0 || i % 7 == 0) {
               answer[i] = tmp + i;
               tmp = answer[i];
           }
         
    	   else answer[i] = tmp;

       }
	   
       for (int i = 0; i < T; i++) {
           int n = Integer.parseInt(st.nextToken());
           sb.append(answer[n] + "\n");
       }
       
       System.out.println(sb);	   
   }
   
   // 7789번 - 텔레프라임
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int origin = Integer.parseInt(st.nextToken());
	   int plus = Integer.parseInt(st.nextToken());
	   
	   if(isPrime(origin)) {
		   
		   int newPhone = Integer.parseInt((plus + "" +origin));
		   
		   if(isPrime(newPhone)){
			   System.out.println("Yes");
			   return;
		   }
	   }
	   
	   System.out.println("No");
   }
   
   private static boolean isPrime(long n) {
		
       if(n == 1 || n == 0) return false;

       for(long i = 2; i <= Math.sqrt(n); i++) if(n % i == 0) return false;

       return true;
       
   }
   
   // 5533번 - 유니크 
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   int[][] point = new int[N][3];
	   for(int i = 0; i < N; i++) {
		   
		   st = new StringTokenizer(br.readLine());
		   point[i][0] = Integer.parseInt(st.nextToken());
		   point[i][1] = Integer.parseInt(st.nextToken());
		   point[i][2] = Integer.parseInt(st.nextToken());
		   
	   }

	   for(int idx = 0; idx < 3; idx++) {
		   
		   for(int i = 0; i < N; i++) {
			   
			   int target = point[i][idx];
			   boolean chk = false;
			   for(int j = i + 1; j < N; j++) {
				   
				   if(point[j][idx] == target) {
					   point[j][idx] = 0;
					   chk = true;
				   }
			   }
			   
			   if(chk) point[i][idx] = 0;
		   }
	   }
	   
	   
	   for(int i = 0; i < N; i++) {

		   long sum = 0;
		   for(int j = 0; j < 3; j++) sum += point[i][j];
		   System.out.println(sum);
		   
	   }
	   
   }
   
   // 19945번 - 새로운 언어 CC
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   if(N == 0) System.out.println(1);
	   else if(N < 0) System.out.println(32);
	   else {
		   
		   int ans = 0;
		   while(N > 0){
			   ans++;
			   N /= 2;
		   }
		   
		   System.out.println(ans);
	   }
   }
   
   // 14686번 - Sum Game
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());

	   long[] swifts = new long[N];
	   long[] semaphores = new long[N];
	   
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) swifts[i] = Integer.parseInt(st.nextToken());
	   for(int i = 1; i < N; i++) swifts[i] += swifts[i - 1];
	   
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) semaphores[i] = Integer.parseInt(st.nextToken());
	   for(int i = 1; i < N; i++) semaphores[i] += semaphores[i - 1];
	   
	   int max = 0;
	   for(int i = 0; i < N; i++) if(swifts[i] == semaphores[i]) max = (i + 1);
	   
	   System.out.println(max);
   }
   
   // 16625번 - Das Blinkenlights
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int[] inputs = Arrays.stream(br.readLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
	   
       int p = inputs[0];
       int q = inputs[1];
       int s = inputs[2];

       System.out.println(s >= p * q / gcd(p, q) ? "yes" : "no");
	   
   }
   
   private static int gcd(int first, int second) {
	   int max = Math.max(first, second);
       int min = Math.min(first, second);

       while (min != 0) {
           int res = max % min;
           max = min;
           min = res;
       }

       return max;
   }
   
   // 9070번 - 장보기
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   
		   int N = Integer.parseInt(br.readLine());
		   double max = 0;
		   int ans = 0;
		   for(int i = 0; i < N; i++) {
			   st = new StringTokenizer(br.readLine());
			   
			   double W = Integer.parseInt(st.nextToken());
			   double C = Integer.parseInt(st.nextToken());
			   double WC = W / C;
			   
			   if(max < WC) {
				   max = WC;
				   ans = (int)C;
			   } else if (max == WC) ans = Math.min((int)C, ans);
			   
		   }
		   
		   System.out.println(ans);
	   }
	   
   }
}