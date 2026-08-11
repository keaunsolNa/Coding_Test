import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String line;
       
       while ((line = br.readLine()) != null) {
    	   
           String[] input = line.split(" ");
           BigInteger b = new BigInteger(input[0]);
           if (b.equals(BigInteger.ZERO)) break;
           
           BigInteger p = new BigInteger(input[1], b.intValue());
           BigInteger m = new BigInteger(input[2], b.intValue());
           BigInteger n = p.mod(m);
           StringBuilder resBuilder = new StringBuilder();
           
           while (n.compareTo(b) >= 0) {
        	   
               resBuilder.append(n.mod(b));
               n = n.divide(b);
           }
           
           resBuilder.append(n);
           String res = resBuilder.reverse().toString();
           System.out.println(new BigInteger(res));
       }
       
   }
}
