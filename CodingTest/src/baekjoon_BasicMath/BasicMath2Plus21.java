package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BasicMath2Plus21 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   // Correct
   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
      int HH = Integer.parseInt(st.nextToken());
      int MM = Integer.parseInt(st.nextToken());
      int time = 0;
      
      if(MM != 0) {
    	  time += MM;
    	  time += (HH-9) * 60;
      } else {
    	  time += (HH - 9) * 60;
      }
      
      System.out.println(time);
   }
   
   // A+B
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   BigInteger A = new BigInteger(br.readLine());
	   BigInteger B = new BigInteger(br.readLine());
	   System.out.println(A.add(B));
   }

   // Pups 
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      int N = Integer.parseInt(br.readLine());
      
      while(N --> 0) {
    	  st = new StringTokenizer(br.readLine(), " ");
    	  
    	  double d = Double.parseDouble(st.nextToken());
    	  double f = Double.parseDouble(st.nextToken());
    	  double p = Double.parseDouble(st.nextToken());
    	
    	  double ans = (d*f*p);
    	  System.out.print("$");
    	  System.out.printf("%.2f", ans);
    	  System.out.println();
      }
      
   }

   // Population 
   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine(), " ");
		   int p = Integer.parseInt(st.nextToken());
		   int t = Integer.parseInt(st.nextToken());
		   
		   p -= t/7;
		   p += t/4;
		   
		   System.out.println(p);
	   }
   }
   
   // Body Mass Index 
   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   double w = Double.parseDouble(br.readLine());
	   double h = Double.parseDouble(br.readLine());
	   
	   double bmi = w/(h*h);
	   
	   if(bmi > 25) {
		   System.out.println("Overweight");
	   } else if(bmi > 18.5) {
		   System.out.println("Normal weight");
	   } else {
		   System.out.println("Underweight");
	   }
	   	
   }
   
   // Triangle Height
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      int T = Integer.parseInt(br.readLine());
      
      while(T --> 0) {
    	  st = new StringTokenizer(br.readLine(), " ");
    	  double a = Double.parseDouble(st.nextToken());
    	  double b = Double.parseDouble(st.nextToken());
    	   
    	  double h = 2*a/b;
    	  
    	  System.out.print("The height of the triangle is ");
    	  System.out.printf("%.2f", h);
    	  System.out.println(" units");
      }
   }
   
   // Absolutely 
   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       int T = Integer.parseInt(br.readLine());
       
       while(T --> 0) {
     	  st = new StringTokenizer(br.readLine(), " ");
    	  double a = Double.parseDouble(st.nextToken());
    	  double b = Double.parseDouble(st.nextToken()); 
    	  
    	  double ans = Math.abs(a-b);
    	  
    	  System.out.printf("%.1f", ans);
    	  System.out.println();
       }
   }
   
   // Buying in Bulk 
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
       StringTokenizer st;
       int T = Integer.parseInt(br.readLine());
	   
       while(T --> 0) {
      	  st = new StringTokenizer(br.readLine(), " ");
      	  int a = Integer.parseInt(st.nextToken());
      	  int b = Integer.parseInt(st.nextToken());
      	  
      	  sb.append(a + " " +b).append("\n");
      	  int price = 0;
      	  if(a > 1) {
      		  price += (a-1)*(b-2);
      		  price += b;
      	  } else {
      		  price += b;
      	  }
      	  
      	  sb.append(price).append("\n");
       }
       
       sb.deleteCharAt(sb.length()-1);
       System.out.print(sb);
   }
   
   // Squares 
   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   int N = Integer.parseInt(br.readLine());
	   sb.append("The largest square has side length ");
	   int target = (int)Math.sqrt(N);
	   sb.append(target).append(".");
	   
	   System.out.println(sb);
   }
   
   // Hurra!
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 1; i <= T; i++) {
		   
		   if(i % 7 == 0 && i % 11 == 0) sb.append("Wiwat!").append("\n");
		   else if(i % 7 == 0) sb.append("Hurra!").append("\n");
		   else if(i % 11 == 0)  sb.append("Super!").append("\n");
		   else sb.append(i).append("\n");
	   }
	   
	   sb.deleteCharAt(sb.length()-1);
	   
	   System.out.print(sb);
   }
}