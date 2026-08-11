package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;


public class BasicMath2Plus13 {

   public static void main(String[] args) throws IOException {
      test03();
   }
   
   
   // ЧАСОВНИК
   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int t1 = Integer.parseInt(st.nextToken());
      int m1 = Integer.parseInt(st.nextToken());
      int t2 = Integer.parseInt(st.nextToken());
      int m2 = Integer.parseInt(st.nextToken());
      
      int tMinute = (t1*60) + m1;
      int mMinute = (t2*60) + m2;
      int sMinute = 0;
      
      if(mMinute < tMinute) {
    	  sMinute = ((24*60) - tMinute) + mMinute;
      } else {
    	  sMinute = mMinute - tMinute;
      }
      System.out.println(sMinute + " " + sMinute/30);
      
   }

   
}