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
		test04();
	}

   public static void test04() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int A = Integer.parseInt(st.nextToken());
	   int B = Integer.parseInt(st.nextToken());
	   String D = st.nextToken();
	   
	   int cnt = 0;
	   for(int i = A; i <= B; i++) {
		   
		   if(isPrime(i) && (i+"").contains(D)) cnt++;
			   
	   }
	   
	   System.out.println(cnt);
	   
   }

   private static boolean isPrime(long n) {
		
       if(n == 1 || n == 0) return false;

       for(long i = 2; i <= Math.sqrt(n); i++) if(n % i == 0) return false;

       return true;
       
   }
}
