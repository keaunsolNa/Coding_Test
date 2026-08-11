package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BasicMath2Plus16 {

   public static void main(String[] args) throws IOException {
      test06();
   }
   
   
   // 쿠폰
   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 0; i < T; i++) {
    	  double pay = Double.parseDouble(br.readLine());
    	  System.out.print("$");
    	  System.out.printf("%.2f", pay/10*8);
    	  System.out.println();
      }
   }
   
   
}