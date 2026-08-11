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
       int cut = Integer.parseInt(br.readLine());
       
       int piece = 1;
       int a = 1;
       for(int i = 0; i < cut; i++) {
       
    	   if(i%2 != 0) a += 1;
           piece += a;
           
       }
       
       System.out.println(piece);
   }
}
