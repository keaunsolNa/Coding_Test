import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   StringTokenizer st = new StringTokenizer(br.readLine());
		   
		   long A = Long.parseLong(st.nextToken());
		   long B = Long.parseLong(st.nextToken());
		   
		   System.out.println("yes");
	   }
	   
   }
}
