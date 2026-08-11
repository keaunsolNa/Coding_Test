import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine(), " ");
		   int p = Integer.parseInt(st.nextToken());
		   int t = Integer.parseInt(st.nextToken());
		   
		   p -= t/7;
		   p += t/4;
		   
		   System.out.println(p);
	   }
   }
}
