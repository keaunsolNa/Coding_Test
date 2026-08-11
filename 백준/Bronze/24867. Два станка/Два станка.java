import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   
	   long k = Long.parseLong(br.readLine());
	   st = new StringTokenizer(br.readLine());
	   long a = Long.parseLong(st.nextToken());
	   long x = Long.parseLong(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   long b = Long.parseLong(st.nextToken());
	   long y = Long.parseLong(st.nextToken());
	   
	   long A = (Math.max(0, (k - a) * x)) + Math.max(0, ((k - a - b) * y)); 
	   long B = (Math.max(0, (k - b) * y) + Math.max(0, ((k - a - b) * x)));
	   
	   System.out.println(Math.max(B, A));
	   
   }
}
