import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   BigInteger A = new BigInteger(st.nextToken());
	   BigInteger B = new BigInteger(st.nextToken());
	   
	   BigInteger C = B.sqrt().subtract(A.sqrt());
	   
	   if(C.compareTo(BigInteger.ZERO) == 0) {
		   System.out.println(0);
		   return;
	   }
	   
	   BigInteger G = gcd(C, B.subtract(A));

	   System.out.println(C.divide(G) + "/" + (B.subtract(A).divide(G)));
       
   }

   private static BigInteger gcd(BigInteger num1, BigInteger num2){
       if(num2.compareTo(new BigInteger("0")) == 0) return num1;
       else return gcd(num2, num1.mod(num2));
   }
}
