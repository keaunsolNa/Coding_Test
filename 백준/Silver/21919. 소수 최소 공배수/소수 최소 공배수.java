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
		test05();
	}

   public static void test05() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   List<Integer> prime = new ArrayList<>();
	   
	   while(st.hasMoreTokens()) {
		   int temp = Integer.parseInt(st.nextToken());
		   if(isPrime(temp)) prime.add(temp);
	   }
	   
	   Collections.sort(prime);
	   if(prime.isEmpty()) System.out.println(-1);
	   
	   else {
		   
		   BigInteger gcd = new BigInteger(prime.get(1) +"").multiply(new BigInteger(prime.get(0) +"")).divide(gcd(new BigInteger(prime.get(0) +""), new BigInteger(prime.get(1) +"")));
		   
		   for(int i = 2; i < prime.size(); i++) 
			   gcd = gcd.multiply(new BigInteger(prime.get(i) +"")).divide(gcd(gcd, new BigInteger(prime.get(i) +"")));
		   
		   System.out.println(gcd);
	   }
   }

   private static boolean isPrime(long n) {
		
       if(n == 1 || n == 0) return false;

       for(long i = 2; i <= Math.sqrt(n); i++) if(n % i == 0) return false;

       return true;
       
   }

   private static BigInteger gcd(BigInteger num1, BigInteger num2){
       if(num2.compareTo(new BigInteger("0")) == 0) return num1;
       else return gcd(num2, num1.mod(num2));
   }
}
