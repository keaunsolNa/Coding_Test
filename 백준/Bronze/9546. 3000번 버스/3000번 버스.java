import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T -- > 0) {
		   int k = Integer.parseInt(br.readLine());
		   double p = 0;
		   
		   for(int i = 0; i < k; i++) {
			   p += 0.5;
			   p *= 2;
		   }
		   
		   System.out.println((int)p);
		   
	   }
	   
   }
}
