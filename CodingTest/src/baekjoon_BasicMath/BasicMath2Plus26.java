package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus26 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 보물
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      
      int[] A = new int[N];
      int[] B = new int[N];
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
      
      st = new StringTokenizer(br.readLine());
      for(int i = 0; i < N; i++) B[i] = Integer.parseInt(st.nextToken());
      
      Arrays.sort(A);
      Arrays.sort(B);
      
      int sum = 0;
      for(int i = 0; i < N; i++) sum += A[i] * B[N - i - 1];
      
      
      System.out.println(sum);
      
   }
   
   // 추론
   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      long[] arr = new long[N];
      
      for(int i = 0; i < N; i++) arr[i] = Long.parseLong(br.readLine());
      
      if(arr[2] - arr[1] == arr[1] - arr[0]) System.out.println(arr[N-1] + (arr[1] - arr[0]));
      else System.out.println(arr[N-1] * (arr[1]/arr[0]));
   }

   // 나머지와 몫이 같은 수
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      long N = Long.parseLong(br.readLine());
      
      long sum = (N - 1) * (N + 1 + (N + 1) * (N - 1)) / 2;
      
      System.out.println(sum);
   }
   
   // 문어 숫자 
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = "";
	   while(!(input = br.readLine()).equals("#")) {
		   
		   String binaryNumber = "";
		   for(int i = 0; i < input.length(); i++) {
			   
			   switch(input.charAt(i)) {
		   		case '-' : binaryNumber += '0'; break;
		   		case '\\' : binaryNumber += '1'; break;
		   		case '(' : binaryNumber += '2'; break;
		   		case '@' : binaryNumber += '3'; break;
		   		case '?' : binaryNumber += '4'; break;
		   		case '>' : binaryNumber += '5'; break;
		   		case '&' : binaryNumber += '6'; break;
		   		case '%' : binaryNumber += '7'; break;
		   		case '/' : binaryNumber += "9"; break;
			   }
		   }
		
		   long answer = 0;
		   for(int i = 0; i < binaryNumber.length(); i++) {
			   
			   if(binaryNumber.charAt(i) != '9') 
				   answer += Character.getNumericValue(binaryNumber.charAt(i)) * (Math.pow(8, binaryNumber.length() - i - 1));
			   else  answer -= Math.pow(8, binaryNumber.length() - i - 1);
		   }
		   
		   System.out.println(answer);
	   }
   }
   
   // 수빈이와 수열
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   int[] arr = new int[N];
	   int[] answer = new int[N];
	   
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
	   
	   int sum = 0;
	   for(int i = 0; i < N; i++) {
		   answer[i] = arr[i] * (i+1) - sum;
		   sum += answer[i];
	   }
	   
	   for (int i : answer) System.out.print(i + " ");
   }
   
   // 악마의 제안
   public static void test06() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");

       long K = Long.parseLong(st.nextToken());
       long N = Long.parseLong(st.nextToken());
       
       long result = -1L;
       
       if(N != 1L) {
    	   result = (K * N) / (N - 1L);
    	   
    	   if((K * N) % (N - 1L) != 0L) result += 1L;
       }
       
       System.out.println(result);
   }
   
   // 다각형의 대각선
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       
       System.out.println((N * (N - 3) * (N - 2) * (N - 1)) / 24);
       
   }
   
   // 시그마
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   long stat = Long.parseLong(st.nextToken());
	   long end = Long.parseLong(st.nextToken());
	   
	   if(end > stat) {
		   long temp = end;
		   end = stat;
		   stat = temp;
	   }
	   
	   System.out.println((stat + end) * (stat - end + 1) / 2);
   }
   
   // 일우는 야바위꾼
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int N = Integer.parseInt(st.nextToken());
	   int X = Integer.parseInt(st.nextToken());
	   int K = Integer.parseInt(st.nextToken());
	   
	   while(K --> 0) {
		   st = new StringTokenizer(br.readLine());
		   
		   int b1 = Integer.parseInt(st.nextToken());
		   int b2 = Integer.parseInt(st.nextToken());
		   
		   if(X == b1) X = b2;
		   else if(X == b2) X = b1;
	   }
       
	   System.out.println(X);
   }
   
   // 삼각 무늬 - 1
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine());
		   
		   int A = Integer.parseInt(st.nextToken());
		   int B = Integer.parseInt(st.nextToken());
		   
		   if(A % B == 0) System.out.println((A / B) * (A / B));
			else System.out.println(((A / B) + 1) * ((A / B) + 1));
	   }
	   
   }
}