package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BasicMath2Plus39 {

   public static void main(String[] args) throws IOException {
      test01();
   }
   
   // 27323번 - 長方形 (Rectangle)
   public static void test01() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int A = Integer.parseInt(br.readLine());
	   int B = Integer.parseInt(br.readLine());
	   
	   System.out.println(A * B);
   }
   
   
}