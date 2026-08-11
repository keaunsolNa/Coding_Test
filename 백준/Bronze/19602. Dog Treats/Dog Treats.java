import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int S = Integer.parseInt(br.readLine());
	   int M = Integer.parseInt(br.readLine());
	   int L = Integer.parseInt(br.readLine());
	   
	   int happy = S + (2*M) + (3*L);
	   
	   if(happy >= 10) {
		   System.out.println("happy");
	   } else {
		   System.out.println("sad");
	   }
   }
}
