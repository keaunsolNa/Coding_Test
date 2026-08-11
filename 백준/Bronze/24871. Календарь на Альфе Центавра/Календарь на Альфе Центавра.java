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
		test03();
	}

   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   st = new StringTokenizer(br.readLine());
	   
	   long d = Integer.parseInt(st.nextToken());
	   long m = Integer.parseInt(st.nextToken());
	   long w = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   long i = Integer.parseInt(st.nextToken());
	   long j = Integer.parseInt(st.nextToken());
	   long k = Integer.parseInt(st.nextToken());
	   
	   
	    long year = (j - 1) * d + i - 1;
	    long totalDays = (k - 1) * m * d + year;
	    long result = totalDays % w;
	    System.out.println((char)('a' + result));
   }
}
