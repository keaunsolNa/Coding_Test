package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BasicMath2Plus11 {

   public static void main(String[] args) throws IOException {
      test10();
   }
   
   
   // Petrol
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());
      
      int total1500 = k+60;
      
      if(total1500 - n > 0) {
    	  System.out.println(n*1500);
      } else {
    	  System.out.println((total1500*1500) + ((n-total1500)*3000));
      }
   }

   
   // アイスクリーム (Ice Cream) 
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int S = Integer.parseInt(br.readLine());
      int A = Integer.parseInt(br.readLine());
      int B = Integer.parseInt(br.readLine());
      
      if(S-A <= 0) {
    	  System.out.println(250);
      } else {
    	  if((S-A)%B == 0) {
    		  System.out.println(250 + (((S-A)/B)*100));
    	  } else {
    		  System.out.println(350 + (((S-A)/B)*100));
    	  }
      }
	   
   }
   
   
   // Triathlon
   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   int max = 0;
	   for(int i = 0; i < T; i++) {
		   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		   
		   int a = Integer.parseInt(st.nextToken());
		   int d = Integer.parseInt(st.nextToken());
		   int g = Integer.parseInt(st.nextToken());
		   
		   int count = a * (d+g);
		   if(a == (d+g)) {
			   count *= 2;
		   }
		   
		   if(max < count) {
			   max = count;
		   }
		   
	   }
	   
	   System.out.println(max);
   }


}