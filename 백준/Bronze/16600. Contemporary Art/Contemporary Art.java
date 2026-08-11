import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	     
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   double S = Double.parseDouble(br.readLine());
	   
	   System.out.println(Math.sqrt(S)*4);
   }
}
