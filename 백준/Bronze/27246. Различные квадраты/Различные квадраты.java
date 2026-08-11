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
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   long n = Long.parseLong(br.readLine());

	   long i = 0;
	   long count = 0;
	   long total = 0;
	   
	   while(total < n) {
		   i += 1;
		   total += (i * i);
		   
		   if(total > n) break;
		   count += 1;
	   }
	   
	   System.out.println(count);
	   
   }
}
