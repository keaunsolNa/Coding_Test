import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   double x = Integer.parseInt(st.nextToken());
	   double rest = 100 - x;
	   double y = Integer.parseInt(st.nextToken());
	   
	   double ans = x / (rest * y / (100.0 - y));
	   System.out.println(ans);
   }
}
