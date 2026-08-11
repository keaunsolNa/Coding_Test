package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BasicMath2Plus21 {

   public static void main(String[] args) throws IOException {
      test02();
   }
   
   
   // A+B
   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   BigInteger A = new BigInteger(br.readLine());
	   BigInteger B = new BigInteger(br.readLine());
	   System.out.println(A.add(B));
   }


}