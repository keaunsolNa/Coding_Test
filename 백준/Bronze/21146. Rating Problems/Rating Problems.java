import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   int n = Integer.parseInt(st.nextToken());
	   int k = Integer.parseInt(st.nextToken());
	   
	   double rest = n - k;
	   double totalP = 0;
	   while(k --> 0) totalP += Integer.parseInt(br.readLine());
	   
	   double min = ((rest * -3) + totalP) / n;
	   double max = ((rest * 3) + totalP) / n;

	   System.out.println(min + " " + max);
	   
   }
}
