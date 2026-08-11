import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int n = Integer.parseInt(st.nextToken());
	   int m = Integer.parseInt(st.nextToken());
	   
	   if(n - 7 > 0) System.out.println(n - 7);
	   else {
		   int last = m + 14 - n;
		   
		   if(m + 7 <= last) System.out.println(m + 7);
		   else System.out.println(m + 7 - last);
	   }
   }
}
