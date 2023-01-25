package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus37 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 18964번 - Questionnaire
   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();

	   int N = Integer.parseInt(br.readLine());
	   int[] arr = new int[N];
	   
	   st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++)arr[i] = Integer.parseInt(st.nextToken());
	   
	   for(int m = 1; ; m++) {
		   
		   for(int k = 0; k < m; k++) {
			   int cnt = 0;
			   
			   for(int i = 0; i < N; i++) {
				   
				   if(arr[i] % m == k) cnt++;
			   }
			   
			   if(cnt >= N / 2) {
				   System.out.println(m + " " + k);
				   return;
			   }
		   }
	   }
   }
   
   // 10185번 - Focus 
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine());
		   double p = Integer.parseInt(st.nextToken());
		   double q = Integer.parseInt(st.nextToken());
		   
		   double c = 1 / (1.0 / p + 1.0 / q);
		   
		   System.out.print("f = ");
		   System.out.printf("%.1f", c);
		   System.out.println();
	   }
   }
   
   // 25985번 - Fastestest Function
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   double x = Integer.parseInt(st.nextToken());
	   double rest = 100 - x;
	   double y = Integer.parseInt(st.nextToken());
	   
	   double ans = x / (rest * y / (100.0 - y));
	   System.out.println(ans);
   }
   
   // 4909번 - Judging Olympia
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = "";
	   
	   while(!(input = br.readLine()).equals("0 0 0 0 0 0")) {
		   
		   double[] arr = Arrays.stream(input.split(" ")).map(String::trim).mapToDouble(Double::parseDouble).toArray();
		   Arrays.sort(arr);
		   
		   double sum = 0;
		   for(int i = 1; i < arr.length - 1; i++) sum += arr[i];
		   String av = sum / 4 + "";
		   
		   for(int i = av.length() - 1; i >= 0; i--) {
			   
			   if(av.charAt(i) == '0' || av.charAt(i) == '.') {
				   av = av.substring(0, i);
			   } else break;
		   }
		   
		   System.out.println(av);
	   }
   }
   
   // 4922번 - Walk Like an Egyptian
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   while(true) {
		   int N = Integer.parseInt(br.readLine());
		   
		   if(N == 0) break;
		   
		   int res = N * N - (N - 1);
		   
		   System.out.println(N + " => " + res);
	   }
   }
   
   // 1964번 - 오각형, 오각형, 오각형…
   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   long[] dp = new long[N + 1];
	   
	   dp[0] = 5;
	   dp[1] = 12;
	   dp[2] = 22;
	   dp[3] = 35;
	   
	   int idx = 0;
	   for(int i = 1; i < N; i++) {
		   dp[i] = dp[i - 1] + 7 + idx;
		   idx += 3;
	   }
	   
	   System.out.println(dp[N - 1] % 45678);
   }
   
   // 26741번 - Farma 
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int X = Integer.parseInt(st.nextToken());
	   int Y = Integer.parseInt(st.nextToken());
	   
	   for(int i = 0; i <= X; i++) {
		   
		   int j = X - i;
		   if((i * 2) + (j * 4) == Y) {
			   System.out.println(i + " " + j);
			   return;
		   }
	   }
   }
   
   // 11295번 - Exercising
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();

	   int idx = 1;
	   while(true) {
		   
		   int L = Integer.parseInt(br.readLine().replaceAll(" ", ""));
		   if(L == 0) break;
		   
		   int N = Integer.parseInt(br.readLine());
		   sb.append("User " + idx).append("\n");
		   
		   for(int i = 0; i < N; i++) {
			   int walk = Integer.parseInt(br.readLine());
			   
			   double cm = walk * L ;
			   String km = String.format("%.5f", cm / 100000);
			   sb.append(km + "\n");
		   }
		
		   idx++;
	   }
	   
	   System.out.println(sb);
   }
   
   // 21339번 - Contest Struggles
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   double n = Integer.parseInt(st.nextToken());
	   double k = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   double d = Integer.parseInt(st.nextToken());
	   double s = Integer.parseInt(st.nextToken());
	   
	   double average = (d * n - (k * s)) / (n - k);
	   
	   if(average >= 0 && average <= 100) System.out.printf("%.7f", average);
	   else System.out.println("impossible");
	   
   }
   
   // 9317번 - Monitor DPI
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   
	   while(true) {
		   double[] arr = Arrays.stream(br.readLine().split(" ")).map(String::trim).mapToDouble(Double::parseDouble).toArray();
		   
		   if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
		   
		   double W = arr[0] * 16 / Math.sqrt(337);
		   double H = (9 * W) / 16;
		   double DH = arr[1] / W;
		   double DV = arr[2] / H;
		   
		   System.out.print("Horizontal DPI: ");
		   System.out.printf("%.2f", DH);
		   System.out.println();
		   
		   System.out.print("Vertical DPI: ");
		   System.out.printf("%.2f", DV);
		   System.out.println();
		   
	   }
   }
   
   
}