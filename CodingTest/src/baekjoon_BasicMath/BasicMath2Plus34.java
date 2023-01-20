package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BasicMath2Plus34 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 좋은 암호
   public static void test01() throws IOException {
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
   
   // Scavenger Hunt
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int P = Integer.parseInt(st.nextToken());
	   int Q = Integer.parseInt(st.nextToken());
	   
	   List<Integer> PList = new ArrayList<>();
	   List<Integer> QList = new ArrayList<>();
	   
	   for(int i = 1; i <= P; i++) 
		   if(P % i == 0) PList.add(i);
	   
	   for(int i = 1; i <= Q; i++)
		   if(Q % i == 0) QList.add(i);
	   
	   for(int p = 0; p < PList.size(); p++) {
		   
		   for(int q = 0; q < QList.size(); q++) {
			   
			   sb.append(PList.get(p) + " " + QList.get(q) + "\n");
		   }
	   }
	   
	   System.out.println(sb);
   }
   
   // Square 
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   int N = Integer.parseInt(br.readLine());
		   
           int ans = 0;
           for (int i = 1; i <= N; i++) ans += i * i;
           
           sb.append(ans + "\n");
	   }
	   
	   System.out.println(sb);
   }
   
   // Perfect Cube
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 1; i <= T; i++) {
		   st = new StringTokenizer(br.readLine());
		   
		   int A = Integer.parseInt(st.nextToken());
		   int B = Integer.parseInt(st.nextToken());
		   
		   int cnt = 0;
           for (int n = (int)Math.cbrt(A); n <= (int)Math.cbrt(B); n++) 
               if (A <= n * n * n && n * n * n <= B) cnt++;
           
           sb.append("Case #" + i + ": " + cnt + "\n");
	   }
	   
	   System.out.println(sb);
   }
   
   // Double Password
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String A = br.readLine();
	   String B = br.readLine();
	   
	   int cnt = 0;
	   for(int i = 0; i < 4; i++) 
		   if(A.charAt(i) != B.charAt(i)) cnt++;
		   
	   if(cnt == 0) System.out.println(1);
	   else System.out.println((int)Math.pow(2, cnt));
	   
   }
   
   // Сравнение комнат
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   double A = Double.parseDouble(st.nextToken());
	   double B = Double.parseDouble(st.nextToken());
	   double C = Double.parseDouble(st.nextToken());
	   double D = Double.parseDouble(st.nextToken());
	   
	   if(A * B < C * D) System.out.println("P");
	   else if(A * B > C * D) System.out.println("M");
	   else System.out.println("E");
   }
   
   // Big Money 
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = "";
	   BigDecimal sum = new BigDecimal("0.0");
	   while((input = br.readLine()) != null) {
		   sum = sum.add(new BigDecimal(input));
	   }
	   System.out.printf("%.2f", sum);
   }
   
   // 컵라면 측정하기
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   int K = Integer.parseInt(br.readLine());
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   double D1 = Integer.parseInt(st.nextToken());
	   double D2 = Integer.parseInt(st.nextToken());
	   
	   double x = K * K - ((D2 - D1) / 2) * ((D2 - D1) / 2);
	   
	   System.out.println(x);
   }
   
   // POT
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   long sum = 0;
	   for(int i = 0; i < N; i++) {
		   
		   int temp = Integer.parseInt(br.readLine());
		   
		   sum += Math.pow(temp / 10, temp % 10);
	   }
	   
	   System.out.println(sum);
   }
   
   // Scale 
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   String input = "";
	   
	   while((input = br.readLine()) != null) {	
		   
		   // 문자열 int 배열로
		   int[] arr = Arrays.stream(input.split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
		   
		   for(int i = 0; i < arr.length; i++) {
			   
			   if(i == 0) sb.append((arr[0]) * (arr[1]));
			   else if(i == arr.length - 1) sb.append(arr[arr.length - 1] * arr[arr.length - 2]);
			   else sb.append(arr[i - 1] * arr[i] * arr[i + 1]);
			   sb.append(" ");
			   
		   }
		   
		   sb.append("\n");
	   }
	   
	   System.out.println(sb);
   }
   
	   
   
}