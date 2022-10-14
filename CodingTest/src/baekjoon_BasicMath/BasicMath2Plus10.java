package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BasicMath2Plus10 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // Zadanie próbne 2
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      System.out.println((N+1)*2);
      System.out.println((N+1)*3);
      
   }
   
   // Арифметическая магия 
   public static void test02() throws IOException {
      
      System.out.println(1);
   }

   // 鉛筆 (Pencils) 
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      int N = Integer.parseInt(st.nextToken());
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());
      int D = Integer.parseInt(st.nextToken());
      
      int money1 = 0;
      if(N%A == 0) {
    	  money1 = N/A*B;
      } else {
    	  money1 = ((N/A)+1)*B;
      }
      
      int money2 = 0;
      if(N%C == 0) {
    	  money2 = N/C*D;
      } else {
    	  money2 = ((N/C)+1)*D;
      }
      
      System.out.println(Math.min(money1, money2));
   }

   // Contemporary Art
   public static void test04() throws IOException {
	     
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   double S = Double.parseDouble(br.readLine());
	   
	   System.out.println(Math.sqrt(S)*4);
   }
   
   // Piece of Cake! 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");

	   int N = Integer.parseInt(st.nextToken());
	   int H = Integer.parseInt(st.nextToken());
	   int V = Integer.parseInt(st.nextToken());
	   
	   H = Math.max(H, N-H);
	   V = Math.max(V, N-V);
	   System.out.println(H*V*4);
	   
   }
   
   // Atrium
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      double S = Double.parseDouble(br.readLine());
      
      System.out.println(Math.sqrt(S)*4);
	   
   }
   
   // Counting Antibodies
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       long vk = Long.parseLong(st.nextToken());
       long jk = Long.parseLong(st.nextToken());
       st = new StringTokenizer(br.readLine());
       long vl = Long.parseLong(st.nextToken());
       long jl = Long.parseLong(st.nextToken());
       st = new StringTokenizer(br.readLine());
       long vh = Long.parseLong(st.nextToken());
       long dh = Long.parseLong(st.nextToken());
       long jh = Long.parseLong(st.nextToken());

       long heavyChain = vh * dh * jh;
       long lightChainK = vk * jk;
       long lightChainL = vl * jl;
       long totalVariant = heavyChain * (lightChainK + lightChainL);

       System.out.print(totalVariant);
   }
   
   // 햄버거 만들기
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       
       int A = Integer.parseInt(st.nextToken());
       int B = Integer.parseInt(st.nextToken());
       int cnt = 0;
       while(true) {
    	   A = A-2;
    	   B--;
    	   if(A < 0 || B < 0) {
    		   break;
    	   }
    	   cnt++;
       }
       
       System.out.println(cnt);
   }
   
   // Another Eruption
   public static void test09() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      double S = Double.parseDouble(br.readLine());
      double perimeter = (double) Math.round(Math.sqrt(S * Math.PI) * 2 * 1000000000) / 1000000000;
      System.out.println(perimeter);
   }
   
   // Bicycle
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int A = Integer.parseInt(br.readLine());
	   int B = Integer.parseInt(br.readLine());
	   int C = Integer.parseInt(br.readLine());
	   int D = Integer.parseInt(br.readLine());
	   int T = Integer.parseInt(br.readLine());
	   
	   
	   int AM = A + ((T>30 ? T : 30)  - 30) * B * 21;
	   int CM = C + ((T>45 ? T : 45) - 45) * D * 21;
			   
	   System.out.println(AM + " " + CM);
   }



}