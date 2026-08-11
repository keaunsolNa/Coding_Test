import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       long T = Long.parseLong(br.readLine());
       
       if(T % 4 == 0) System.out.println("Even");
       else if(T % 2 == 0) System.out.println("Odd");
       else System.out.println("Either");
    	   
       
   }
}
