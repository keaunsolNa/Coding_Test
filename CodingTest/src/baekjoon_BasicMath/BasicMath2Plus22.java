package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus22 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // Terms of Office
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int A = Integer.parseInt(br.readLine());
      int B = Integer.parseInt(br.readLine());
      
      for(int i = A; i <= B; i += 60) System.out.println("All positions change in year " + i);
   }
   
   // Shipping 
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   int x = Integer.parseInt(br.readLine());
		   
		   Double sum = 0.0;
		   while(x --> 0) {
			   String[] input = br.readLine().split(" ");
			   
			   Double amount = Double.parseDouble(input[1]);
			   Double price = Double.parseDouble(input[2]);
			   
			   sum += amount * price;
		   }
		   
    	  System.out.print("$");
    	  System.out.printf("%.2f", sum);
    	  System.out.println();
	   }
   }

   // Pizza 
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      
      int T = Integer.parseInt(br.readLine());
      
      while(T --> 0) {
    	  st = new StringTokenizer(br.readLine(), " ");
    	  double A1 = Double.parseDouble(st.nextToken());
    	  double P1 = Double.parseDouble(st.nextToken());

    	  st = new StringTokenizer(br.readLine(), " ");
    	  double R1 = Double.parseDouble(st.nextToken());
    	  double P2 = Double.parseDouble(st.nextToken());
    	  
    	  double A2 = Math.PI * R1 * R1;
    	  double PA = A1 / P1;
    	  double RA = A2 / P2;
    	  
    	  if(PA > RA) System.out.println("Slice of pizza");
    	  else System.out.println("Whole pizza");
      }
   }

   // Skarpetki 
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = br.readLine();
	   
	   int sum = 0;
	   
	   sum += countChar(input, 'C')/2;
	   sum += countChar(input, 'B')/2;
	   
	   System.out.println(sum);
   }
   
   public static long countChar(String str, char ch) {
       return str.chars()
               .filter(c -> c == ch)
               .count();
   }
   
   // Acres 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   
	   double yard = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
	   
	   double acre = yard / 4840.0;
	   
	   if(acre% 5 == 0) System.out.println((int)acre/5);
	   else System.out.println((int)acre/5 + 1);
   }
   
   // 거북이 
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int[] arr = new int[4];
      
      for(int i = 0; i < 4; i++) arr[i] = Integer.parseInt(st.nextToken());
      
      Arrays.sort(arr);
      
      System.out.println(arr[0] * arr[2]);
      
   }
   
   // 팩토리얼 진법
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String input = "";
       
       while(!(input = br.readLine()).equals("0")) {
    	   int sum = 0;
    	   for(int i = 0; i < input.length(); i++)  sum += Character.getNumericValue(input.charAt(i)) * factorial(input.length() - i);
    	   System.out.println(sum);
       }
       
       
   }
   
   public static int factorial(int n) {
		
	   if(n < 2) return 1;
	   return n*factorial(n-1);
   }
   
   // 체스판 조각 
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int cut = Integer.parseInt(br.readLine());
       
       int piece = 1;
       int a = 1;
       for(int i = 0; i < cut; i++) {
       
    	   if(i%2 != 0) a += 1;
           piece += a;
           
       }
       
       System.out.println(piece);
   }
   
   // 고려대학교에는 공식 와인이 있다
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   int C = Integer.parseInt(st.nextToken());
	   int K = Integer.parseInt(st.nextToken());
	   int P = Integer.parseInt(st.nextToken());
	   
	   int sum = 0;
	   for(int i = 1; i <= C; i++) sum += (K*i) + (P*i*i);
	   
	   System.out.println(sum); 
   }
   
   // 사탕 선생 고창영
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   br.readLine();
		   int N = Integer.parseInt(br.readLine());
		   BigInteger sum = new BigInteger("0");
		   BigInteger zero = new BigInteger("0");
		   BigInteger BN = new BigInteger(N+"");
		   for(int i = 0; i < N; i++) sum = sum.add(new BigInteger(br.readLine()));
		   BigInteger compare = sum.remainder(BN);
		   if(compare.compareTo(zero) == 0) System.out.println("YES");
		   else System.out.println("NO");
	   }
   }
}