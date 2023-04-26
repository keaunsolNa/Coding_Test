package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BasicMath2Plus50 {

   public static void main(String[] args) throws IOException {
      test10();
   }
	
   // 27960번 - 사격 내기
   public static void test01() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   
	   System.out.println(A^B);
   }
   
   // 23251번 - 스물셋
   public static void test02() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   sb.append(Integer.parseInt(br.readLine()) * 23).append("\n");		   
	   }
	   
	   System.out.println(sb);
   }
   
   // 4471번 - The Navi-Computer is Down! 
   public static void test03() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   while(T --> 0) {
		   
		   String name1 = br.readLine();
		   st = new StringTokenizer(br.readLine());
		   double x1 = Double.parseDouble(st.nextToken());
		   double y1 = Double.parseDouble(st.nextToken());
		   double z1 = Double.parseDouble(st.nextToken());
		   
		   String name2 = br.readLine();
		   st = new StringTokenizer(br.readLine());
		   double x2 = Double.parseDouble(st.nextToken());
		   double y2 = Double.parseDouble(st.nextToken());
		   double z2 = Double.parseDouble(st.nextToken());
		   
		   double d = (x2 - x1) * (x2 - x1);
		   d += (y2 - y1) * (y2 - y1);
		   d += (z2 - z1) * (z2 - z1);
		   
		   String ans = String.format("%.2f", Math.sqrt(d));
		   sb.append(name1 + " to " + name2 +": " + ans +"\n");
	   }
	   
	   System.out.print(sb);
   }
   
   // 1402번 - 아무래도이문제는A번난이도인것같다
   public static void test04() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   StringTokenizer st = new StringTokenizer(br.readLine());
		   
		   long A = Long.parseLong(st.nextToken());
		   long B = Long.parseLong(st.nextToken());
		   
		   System.out.println("yes");
	   }
	   
   }
   
   // 14492번 - 부울행렬의 부울곱
   public static void test05() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int N = Integer.parseInt(br.readLine());
	   boolean[][] arr1 = new boolean[N][N];
	   boolean[][] arr2 = new boolean[N][N];
	   boolean[][] arr3 = new boolean[N][N];
	   
	   for(int i = 0; i < N; i++) {
		   st = new StringTokenizer(br.readLine());
		   for(int j = 0; j < N; j++) arr1[i][j] = Integer.parseInt(st.nextToken()) == 1 ? true : false;
	   }
	   
	   for(int i = 0; i < N; i++) {
		   st = new StringTokenizer(br.readLine());
		   for(int j = 0; j < N; j++) arr2[i][j] = Integer.parseInt(st.nextToken()) == 1 ? true : false;
	   }
	   
	   for(int i = 0; i < N; i++) {
		   
		   for(int j = 0; j < N; j++) {
			   
			   for(int k = 0; k < N; k++) {
				   arr3[i][j] = arr3[i][j] || arr1[i][k] && arr2[k][j];
			   }
		   }
	   }
	   
	   int ans = 0;
	   for (boolean[] bs : arr3) {

		   for (boolean bs2 : bs) {
			   ans += bs2 == true ? 1 : 0;
		   }
	   }
	   
	   System.out.println(ans);
   }
   
   // 9417번 - 최대 GCD
   public static void test06() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   List<Long> list = new ArrayList<>();
		   long maxGCD = 0;
		   
		   while(st.hasMoreTokens()) list.add(Long.parseLong(st.nextToken()));
		   
		   for(int i = 0; i < list.size(); i++) {
			   
			   for(int j = 0; j < list.size(); j++) {
				   
				   if(i == j) continue;
				   maxGCD = Math.max(maxGCD, gcd(list.get(i), list.get(j)));
			   }
		   }
		   
		   System.out.println(maxGCD);
	   }
	   
   }
   
   private static long gcd(long num1, long num2){
       if(num2 == 0) return num1;
       else return gcd(num2, num1 % num2);
   }
   
   // 2407번 - 조합 
   public static void test07() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int n = Integer.parseInt(st.nextToken());
	   int m = Integer.parseInt(st.nextToken());
	   
       BigInteger n1 = BigInteger.ONE;
       BigInteger n2 = BigInteger.ONE;

       for (int i = 0; i < m; i++) {
           n1 = n1.multiply(new BigInteger(String.valueOf(n - i)));
           n2 = n2.multiply(new BigInteger(String.valueOf(i + 1)));
       }
       
	   System.out.println(n1.divide(n2));
   }
   
   // 15965번 - K번째 소수
   public static void test08() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int k = Integer.parseInt(br.readLine());
	   
       int[] arr = new int[10000001]; 
       int n = 10000000;
       
       for(int i = 2; i <= 10000000; i++) arr[i] = i;
       
       for (int i = 2; i <= n; i++) {
           if (arr[i] == 0) continue;
           for (int j = i + i; j <= n; j += i) arr[j] = 0;
       }

       int count = 1;
       for (int i = 2; i <= n; i++) {
           if (arr[i] != 0) {
               if (count == k) {
                   System.out.print(i);
                   break;
               }
               count++;
           }
       }
     
   }
   
   // 17427번 - 약수의 합 2
   public static void test09() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt(br.readLine());
	   long sum = 0;
       for (int k = 1; k <= n; k++) sum += k * (n / k);
       System.out.println(sum);
   }
   
   // 18141번 - Are They All Integers?
   public static void test10() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt(br.readLine());
	   int[] arr = new int[n];
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
	   
	   for(int i = 0; i < n; i++) {
		   
		   for(int j = 0; j < n; j++) {
			   
			   if(i == j) continue;
			   
			   for(int k = 0; k < n; k++) {
				   
				   if(i == k || j == k) continue;
				   
				   int temp = (arr[i] - arr[j]) / arr[k];
				   if(temp != (double)(arr[i] - arr[j]) / arr[k]) {
					   System.out.println("no");
					   System.exit(0);
				   }
			   }
		   }
	   }
	   
	   System.out.println("yes");
   }
   

}