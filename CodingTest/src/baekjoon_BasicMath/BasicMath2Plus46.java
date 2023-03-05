package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus46 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 27434번 - 팩토리얼 3
   public static void test01() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   System.out.println(factorial(Integer.parseInt(br.readLine())));
	   
   }
   
   private static BigInteger factorial(int n) {
	   
	    if(n == 0 || n == 1) return BigInteger.ONE;
	    
	    BigInteger result = BigInteger.valueOf(n);
	    for(int i = n; i >= 2; i--)  result = result.multiply(BigInteger.valueOf(i - 1));
	    return result;
	}

   // 24544번 - 카카오뷰 큐레이팅 효용성 분석
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   int[] arr = new int[N];
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

	   long total = 0;
	   long elseTotal = 0;
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) {
		   
		   total += arr[i];
		   elseTotal += (Integer.parseInt(st.nextToken()) == 1) ? 0 : arr[i];
	   }
	   
	   System.out.println(total);
	   System.out.println(elseTotal);
   }
   
   // 13900번 - 순서쌍의 곱의 합
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());
	   st = new StringTokenizer(br.readLine());
	   int[] arr = new int[N];
	   for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
	   
	   long sum = 0;
	   
	   for(int i = 0; i < N; i++) sum += arr[i];

	   long min;
	   long total = 0;
	   for(int i = 0; i < N; i++) {
		   
		   sum -= arr[i];
		   min = sum * arr[i];
		   total += min;
	   }
	   
	   System.out.println(total);
   }
   
   // 15719번 - 중복된 숫자
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());
	   int[] arr = new int[N];
	   
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) {
		   int temp = Integer.parseInt(st.nextToken());
		   
		   arr[temp - 1]++;
		   
		   if(arr[temp - 1] > 1) {
			   System.out.println(temp);
			   return;
		   }
	   }
	   
   }
   
   // 12833번 - XORXORXOR
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());	   
	   
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   int C = Integer.parseInt(st.nextToken());
	   
	   int temp = A^B;
	   C--;
	   while(C --> 0) temp = temp^B;
	   
	   System.out.println(temp);
   }
   
   // 17269번 - 이름궁합 테스트
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;	   
	   
	   st = new StringTokenizer(br.readLine());
	   int N = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   String A = st.nextToken();
	   String B = st.nextToken();
		   
	   int[] arr = new int[N + M];
	   int idx = 0;
	   
	   for(int i = 0; i < Math.min(N, M); i++) {
		   
		   arr[idx] = charToInt(A.charAt(i));
		   arr[idx + 1] = charToInt(B.charAt(i));
		   
		   idx += 2;
	   }
	   
	   if(N != M) {
		   
		   if(N < M) {
			   for(int i = N; i < M; i++) {
				   arr[idx] = charToInt(B.charAt(i));
				   idx++;
			   }
		   }
		   else {
			   for(int i = M; i < N; i++) {
				   arr[idx] = charToInt(A.charAt(i));
				   idx++;
			   }
		   }
	   }
	   
	   
	   while(arr.length != 2) {
		   
		   int[] arrClone = new int[arr.length - 1];
		   for(int i = 0; i < arr.length - 1; i++) {
			   
			   int temp = arr[i] + arr[i + 1];
			   
			   if(temp >= 10) 
				   arrClone[i] = temp % 10;
			   else arrClone[i] = temp;
			   
		   }
		   
		   arr = arrClone;
	   }
	   
	   int percent = Integer.parseInt(arr[0] + "" + arr[1]);
	   
	   System.out.println(percent + "%");
	   
   }
   
   private static int charToInt (char temp) {
	   
	   switch(temp) {
	   
	   		case 'E' : 
	   			
	   			return 4;
	   			
	   		case 'A' :
	   		case 'F' : 
	   		case 'H' :
	   		case 'K' :
	   		case 'M' :
	   			
	   			
	   			return 3;
	   			
	   		case 'B' :
	   		case 'D' :
	   		case 'N' :
	   		case 'P' :
	   		case 'Q' :
	   		case 'R' :
	   		case 'T' :
	   		case 'X' :
	   		case 'Y' :
	   			
	   			return 2;
	   			
	   		case 'C' :
	   		case 'G' :
	   		case 'I' :
	   		case 'J' :
	   		case 'L' :
	   		case 'O' :
	   		case 'S' :
	   		case 'U' :
	   		case 'V' :
	   		case 'W' :
	   		case 'Z' :
	   			
	   			return 1;
	   }
	   
	   return 0;
   }
   
   // 2729번 -이진수 덧셈
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;	   
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   String A = st.nextToken();
		   String B = st.nextToken();
		   
		   BigInteger a = new BigInteger(A, 2);
		   BigInteger b = new BigInteger(B, 2);
		   BigInteger sum = a.add(b);
		   
		   String result = sum.toString(2);
		   System.out.println(result);
	   }
   }
   
   // 17211번 - 좋은 날 싫은 날
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int N = Integer.parseInt(st.nextToken());
	   double temp =  Double.parseDouble(st.nextToken());
	   double[] arr = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
	   temp = (1 - temp) * 1000;
	   
	   for (int i = 0; i < N; i++) temp = temp * arr[0] + (1000 - temp) * arr[2];

       System.out.println(String.format("%.0f", temp));
       System.out.println(String.format("%.0f", 1000 - temp));
   }
   
   // 18512 - 점프 점프
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());	   
	   
	   int X = Integer.parseInt(st.nextToken());
	   int Y = Integer.parseInt(st.nextToken());
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   
	   int cnt = 0;
	   int xp = a;
	   int yp = b;
	   
	   while(cnt < 100) {
		   
		   if(xp == yp) break;
			   
		   if(xp > yp) yp += Y;
		   else xp += X;
		   
		   cnt++;
	   }
	   
	   if(xp == yp) System.out.println(xp);
	   else System.out.println(-1);
   }
   
   // 16495번 - 열 순서
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   String input = br.readLine();
	   long ans = 0;
	   for(int i = 0; i < input.length(); i++) {
		   
		   ans *= 26;
		   ans += input.charAt(i) - 'A' + 1;
	   }
	   
	   System.out.println(ans);
   }
   
	   
}