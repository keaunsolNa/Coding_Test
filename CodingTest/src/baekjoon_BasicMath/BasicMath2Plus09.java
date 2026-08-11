package baekjoon_BasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BasicMath2Plus09 {

   public static void main(String[] args) throws IOException {
      test07();
   }
   
   
   // РАВЕНСТВО
   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   BigInteger A = new BigInteger(br.readLine());
	   BigInteger B = new BigInteger(br.readLine());
	   BigInteger C = new BigInteger(br.readLine());
	   
	   BigInteger answer = (B.subtract(C)).divide(A);
	   System.out.println(answer);
   }
   
   
}