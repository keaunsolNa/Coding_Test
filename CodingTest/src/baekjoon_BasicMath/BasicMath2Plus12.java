package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class BasicMath2Plus12 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // Koszykarz
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      long k = Long.parseLong(st.nextToken());
      long w = Long.parseLong(st.nextToken());
      long m = Long.parseLong(st.nextToken());

      long need = w - k;
      int answer = 0;
      for(long i = m; i < need; i+=m) {
    	  answer++;
      }
      
      System.out.println(answer+1);
   }
   
   // Patyki
   public static void test02() throws IOException {
      
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   int[] arr = new int[3];
	   for(int i = 0; i < 3; i++) {
		   arr[i] = Integer.parseInt(st.nextToken());
	   }
	   
	   Arrays.sort(arr);
	   
	   if(arr[0] == arr[1] && arr[0] == arr[2]) {
		   System.out.println(2);
	   } else if ((arr[0] * arr[0]) + (arr[1] * arr[1]) == arr[2] * arr[2]) {
		   System.out.println(1);
	   } else {
		   System.out.println(0);
	   }
	   
   }

   // Gorivo
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      double mile = Double.parseDouble(br.readLine());
      
      double A = 100.00 / ((1.609344 / 3.785411784) * mile);

      System.out.println(A);
   }

   // Cutting Corners
   public static void test04() throws IOException {
	     
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   double w = Integer.parseInt(st.nextToken());
	   double h = Integer.parseInt(st.nextToken());
	   
	   double rc = w + h;
	   double dc = Math.sqrt((w*w) + (h*h));

	   System.out.println(rc - dc);
   }
   
   // Affischutskicket 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
	   double A = Integer.parseInt(st.nextToken());
	   double B = Integer.parseInt(st.nextToken());
	   double C = Integer.parseInt(st.nextToken());
	   
	   double C4 = 229 * 324 * A * 2;
	   double A3 = 297 * 420 * B * 2;
	   double A4 = 210 * 297 * C;
	   
	   System.out.printf("%.6f", (C4 + A3 + A4) * 0.000001);
   }
   
   // Изгороди 
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      double A = Integer.parseInt(br.readLine());
      
      double D1 = (180 - A) / 2;
      double D2 = A / 2;
      System.out.println(Math.round(D1 + D2));
   }
   
   // St. Ives
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       double input = -0;
       
       while((input = Double.parseDouble(br.readLine())) != 0) {
    	   System.out.printf("%.2f%n", Math.pow(input, 4) + Math.pow(input, 3) + Math.pow(input, 2) + input + 1);
       }
       
   }
   
   // Schronisko
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < T; i++) {
		   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		   int W = Integer.parseInt(st.nextToken());
		   int K = Integer.parseInt(st.nextToken());
		   int space = W*K/2;
		   
		   System.out.println(space);
	   }
       
       
   }
   
   // ПЧЕЛИЧКАТА МАЯ
   public static void test09() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());
      
      System.out.println((B-A) + (C-B));
      
   }
   
   // ГРАДИНА
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int w1 = Integer.parseInt(br.readLine());
	   int h1 = Integer.parseInt(br.readLine());
	   int w2 = Integer.parseInt(br.readLine());
	   int h2 = Integer.parseInt(br.readLine());
	   
	   int w = Math.max(w1, w2)*2;
	   int h = (h1+h2)*2;
	   System.out.println(4+w+h);
	   
   }



}