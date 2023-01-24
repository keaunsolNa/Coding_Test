package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus36 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // 4655번 - Hangover
   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   
	   while(true) {
		   
		   double c = Double.parseDouble(br.readLine());
		   
		   int cnt = 1;
		   double length = 0;
		   
		   if(c == 0.00) break;
		   
	        for(int i = 1; ; i++) {
	        	
	            length += 1.0 / (i + 1);
	            if(length >= c) {
	            	cnt = i; 
	            	break;
            	}
	        }
	        
	        sb.append(cnt + " card(s)" + "\n");
	   }
	   
	   System.out.print(sb);
   }
   
   // 4623번 - Copier Reduction
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   
	   while(true) {
		   
		   int[] arr = Arrays.stream(br.readLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
		   
		   if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0 && arr[3] == 0) break;
		   
		   int A;
		   int B;
		   int C;
		   int D;
		   
		   if(arr[0] < arr[1]) {
			   A = arr[1];
			   B = arr[0];
		   } else {
			   A = arr[0];
			   B = arr[1];
		   }
		   
		   if(arr[2] < arr[3]) {
			   C = arr[3];
			   D = arr[2];
		   } else {
			   C = arr[2];
			   D = arr[3];
		   }
		   
		   int start = 1;
		   int end = 100;
		   int result = 0;
		   
		   while(start <= end) {
			   
				int mid = (start + end) / 2;

				if (A * mid <= C * 100 && B * mid <= D * 100) {
					
					start = mid + 1;
					result = mid;
					
				} else end = mid - 1;
		   }
		   
		   
		   sb.append(result + "%" +"\n");
		   
	   }
	   
	   System.out.println(sb);
	   
   }
   
   // 9298번 - Ant Entrapment
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 1; i <= T; i++) {
		   
           int N = Integer.parseInt(br.readLine());
           Double[][] ants = new Double[N][2];
           
           for (int j = 0; j < N; j++) {
        	   
               String[] input = br.readLine().split(" ");
               ants[j][0] = Double.parseDouble(input[0]);
               ants[j][1] = Double.parseDouble(input[1]);
               
           }
           
           Arrays.sort(ants, (o1, o2) -> (int)(o2[0] - o1[0]));
           double x = Double.parseDouble(String.format("%.9f", ants[0][0] - ants[N - 1][0]));
           
           Arrays.sort(ants, (o1, o2) -> (int)(o2[1] - o1[1]));
           double y = Double.parseDouble(String.format("%.9f", ants[0][1] - ants[N - 1][1]));
           
           sb.append("Case " + (i + 1) + ": Area " + x * y + ", Perimeter " + (x * 2 + y * 2) + "\n");
           
	   }
	   
	   System.out.print(sb);
	   
   }
   
   // 24408번 - Mult!
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int N = Integer.parseInt(br.readLine());
	   
	   int target = Integer.parseInt(br.readLine());
	   for(int i = 1; i < N; i++) {
		   
		   int number = Integer.parseInt(br.readLine());
		   
		   if(number % target == 0) {
			   sb.append(number + "\n");
			   target = Integer.parseInt(br.readLine());
			   i++;
		   }
		   
	   }
	   
	   System.out.println(sb);
   }
   
   // 15001번 - Frog Leaps
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   int N = Integer.parseInt(br.readLine());
	   
	   long start = Integer.parseInt(br.readLine());
	   N--;
	   
	   long totalD = 0;
	   while(N -- > 0) {
		   
		   long x = Integer.parseInt(br.readLine());
		   
		   totalD += ((x - start) * (x - start));
		   
		   start = x;
	   }
	   
	   System.out.println(totalD);
   }
   
   // 24805번 - Climbing Worm
   public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       
		
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long H = Integer.parseInt(st.nextToken());
		int cnt = 0;
		int cur = 0;

		while (true) {
			
			cur += A; 
			cnt++;
			
			if (cur >= H) break;
			cur -= B;
		}
		
		System.out.print(cnt);
   }
   
   // 15858번 - Simple Arithmetic
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	
	   BigDecimal A = new BigDecimal(st.nextToken());
	   BigDecimal B = new BigDecimal(st.nextToken());
	   BigDecimal C = new BigDecimal(st.nextToken());
	   
	   System.out.print(A.multiply(B).divide(C, MathContext.DECIMAL128));
   }
   
   // 11759번 - Bottled-Up Feelings
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int s = Integer.parseInt(st.nextToken());
	   int v1 = Integer.parseInt(st.nextToken());
	   int v2 = Integer.parseInt(st.nextToken());
	
	   for(int i = s / v1; i >= 0; i--) {
		   
		   if((s - (v1 * i)) % v2 == 0) {
			   System.out.println(i + " " + ((s - (v1 * i)) / v2));
			   return;
		   }
	   }
	   
	   System.out.println("Impossible");
   }
   
   // 4850번 - Baskets of Gold Coins 
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   String str = "";
	   while((str = br.readLine()) != null) {
		   
		   long[] input = Arrays.stream(str.split(" ")).map(String::trim).mapToLong(Long::parseLong).toArray();
		   
		   int N = (int)input[0];
		   int w = (int)input[1];
		   int d = (int)input[2];
		   long sum = input[3];
		   	
		   long fullWeight = N * (N - 1) / 2 * w;
		   
		   long ans = Math.abs(sum - fullWeight) / d;
		   
		   if(ans == 0) System.out.print(N + "\n");
		   else System.out.print(ans + "\n");
			   
	   }
   }
   
   // 5101번 - Sequences 
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   while(true) {
		   st = new StringTokenizer(br.readLine());
		   
		   double a = Double.parseDouble(st.nextToken());
		   double b = Double.parseDouble(st.nextToken());
		   double c = Double.parseDouble(st.nextToken());
		   
		   if(a == 0 && b == 0 && c == 0) break;
			
		   if((c - a) % b == 0 && (c - a) / b >= 0) {
			   System.out.println((int)(Math.abs((c - a) / b) + 1)); 
			   continue;
		   }

		   else System.out.println("X");
	   }
   }
   
}