import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   Scanner sc = new Scanner(System.in);
	   
	   while(sc.hasNext()) {
		   int n = sc.nextInt();
		   int s = sc.nextInt();
		   System.out.println(s/(n+1));
	   }
   }
}
