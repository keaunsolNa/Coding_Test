import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());
       
       if(T % 2 == 1) System.out.println("0");
       else if((1 + T) % 2 == 1 && T/2 % 2 == 1) System.out.println("1");
       else System.out.println("2");
   }
}
