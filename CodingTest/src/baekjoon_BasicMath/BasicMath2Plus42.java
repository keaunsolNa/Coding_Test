package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus42 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 27433번 - 팩토리얼 2
   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   long N = Integer.parseInt(br.readLine());
	   
	   System.out.println(factorial(N));
   }
   
   public static long factorial(long n) {
		
	   if(n < 2) return 1;
	   return n * factorial(n - 1);
	
   }
   
   // 9776번 - Max Volume
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   double ans = 0;
	   while(T -- > 0) {
		   st = new StringTokenizer(br.readLine());
		   
		   char V = st.nextToken().charAt(0);
		   
		   double pie = 3.14159;
		   
		   
		   switch(V) {
		   
		   		case 'S' : 
		   			
		   			double r = Double.parseDouble(st.nextToken());
		   			ans = Math.max(ans, (pie * Math.pow(r, 3)) / 3 * 4);
		   			break;
		   			
		   		case 'C' :
		   			
		   			double r2 = Double.parseDouble(st.nextToken());
		   			double h = Double.parseDouble(st.nextToken());
		   			ans = Math.max(ans, (pie * Math.pow(r2, 2) * h) / 3);
		   			break;
		   			
		   		case 'L' : 
		   			
		   			double r3 = Double.parseDouble(st.nextToken());
		   			double h2 = Double.parseDouble(st.nextToken());
		   			ans = Math.max(ans, pie * Math.pow(r3, 2) * h2);
		   }
	   }
	   
	   System.out.printf("%.3f", ans);
   }
   
   // 27389번 - Metronome
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   double N = Double.parseDouble(br.readLine());
	   
	   System.out.printf("%.2f", N/4);
	   
   }
   
   // 13304번 - 방 배정 
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   int N = Integer.parseInt(st.nextToken());
	   int K = Integer.parseInt(st.nextToken());
	   int[] room = new int[] {0, 0, 0, 0, 0};
	   int ans = 0;
	   
	   for(int i = 0; i < N; i++) {
		   st = new StringTokenizer(br.readLine());
		   
		   int S = Integer.parseInt(st.nextToken());
		   int Y = Integer.parseInt(st.nextToken());
		   
		   int idx;
		   if(Y <= 2) idx = 0;
		   else if(Y <= 4 && S == 1) idx = 1;
		   else if(Y <= 4 && S != 1) idx = 2;
		   else if(S == 1) idx = 3;
		   else idx = 4;
		   
		   
		   room[idx]++;
		   
		   if(room[idx] == 1) ans++;
		   
		   if(room[idx] == K) room[idx] = 0;
		   
	   }	
	   
	   
	   System.out.println(ans);
   }
   
   // 9437번 - 사라진 페이지 찾기
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	  
	   while(true) {
		   
		   st = new StringTokenizer(br.readLine());
		   
		   int N = Integer.parseInt(st.nextToken());
		   if(N == 0) break;
		   int P = Integer.parseInt(st.nextToken());
		   
		   int[] arr = new int[3];
		   int one = (P % 2 == 0) ? P - 1 : P + 1;
		   arr[0] = one;
		   arr[1] = (P % 2 == 0) ? N - P + 1 : N - P;
		   arr[2] = (P % 2 == 0) ? N - P + 2 : N - P + 1;
		   
		   Arrays.sort(arr);
		   
		   for (int i : arr) System.out.print(i + " ");
		   System.out.println();
	   }
	   
	   
   }
   
   // 9613번 - GCD 합 
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   int n = Integer.parseInt(st.nextToken());
		   
		   long ans = 0;
		   long[] arr = new long[n];
		   for(int i = 0; i < n; i++) arr[i] = Long.parseLong(st.nextToken());
			   
		   for(int i = 0; i < n; i ++) {
			   
			   for(int j = i + 1; j < n ; j++) {
				   
				   ans += gcd(arr[i], arr[j]);
			   }
		   }
		   
		   System.out.println(ans);
	   }
	   
	   
   }
   
   private static long gcd(long num1, long num2){
       if(num2 == 0) return num1;
       else return gcd(num2, num1 % num2);
   }

   // 1057번 - 토너먼트 
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int N = Integer.parseInt(st.nextToken());
	   int one = Integer.parseInt(st.nextToken());
	   int two = Integer.parseInt(st.nextToken());
	   
	   int round = 0;
	   while(one != two) {
		   
		   one = one - one / 2;
		   two = two - two / 2;
		   round++;
	   }
	   
	   System.out.println(round);
	   
   }
   
   // 1747번 - 소수&팰린드롬
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int N = Integer.parseInt(br.readLine());
	   
	   
	   for(long i = N; ; i++) {
		   if(!isPrime(i)) continue;
		   if(!isPalindrome(i)) continue;
		   
		   
		   System.out.println(i);
		   return;
	   }
   }
   
   private static boolean isPrime(long n) {
		
       if(n == 1 || n == 0) return false;

       for(long i = 2; i <= Math.sqrt(n); i++) if(n % i == 0) return false;

       return true;
       
   }
   
   // 정수 팰린드롬 확인
   public static boolean isPalindrome(long num) {

	   long n = num;
	   long rev = 0;

       while (n > 0) {
    	   
    	   long r = n % 10;
           rev = rev * 10 + r;
           n = n / 10;
           
       }

       return (num == rev);

   }
   
   // 17294번 - 귀여운 수~ε٩(๑> ₃ <)۶з
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   String K = br.readLine();
	   
	   if(Long.parseLong(K) < 10) {
		   System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
		   return;
	   }
	   else {
		   
		   int term = (int)K.charAt(0) - (int)K.charAt(1);
		   for(int i = 1; i < K.length() - 1; i++) {
			   
			   if((int)K.charAt(i) - (int)K.charAt(i + 1) != term) {
				   
				   System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
				   return;
			   }
		   }
	   }
	   
	   System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
   }
   
   // 17293번 - 맥주 99병 
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int N = Integer.parseInt(br.readLine());
	   
	   for(int i = N; i >= 0; i--) {
		   
		   if(i == 0) {
			   
			   if(N == 1) 
				   sb.append("No more bottles of beer on the wall, no more bottles of beer.\n"
                           + "Go to the store and buy some more, " + N + " bottle of beer on the wall.\n");
			   else
				   sb.append("No more bottles of beer on the wall, no more bottles of beer.\n"
                           + "Go to the store and buy some more, " + N + " bottles of beer on the wall.\n");
			   
		   } else if(i == 1) 
			   sb.append("1 bottle of beer on the wall, 1 bottle of beer.\n"
                        + "Take one down and pass it around, no more bottles of beer on the wall.\n");
		   else if(i == 2)
			   sb.append("2 bottles of beer on the wall, 2 bottles of beer.\n"
                       + "Take one down and pass it around, 1 bottle of beer on the wall.\n");
		   else
			   sb.append(i + " bottles of beer on the wall, " + i + " bottles of beer.\n"
                       + "Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.\n");
	   
		   sb.append("\n");
	   }
	   
	   
	   sb.deleteCharAt(sb.length() - 1);
	   sb.deleteCharAt(sb.length() - 1);
	   System.out.print(sb);
	   
   }
   
}