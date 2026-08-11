package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BasicMath2Plus22 {

   public static void main(String[] args) throws IOException {
      test03();
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

   
   // 거북이 
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int[] arr = new int[4];
      
      for(int i = 0; i < 4; i++) arr[i] = Integer.parseInt(st.nextToken());
      
      Arrays.sort(arr);
      
      System.out.println(arr[0] * arr[2]);
      
   }
   
   
}