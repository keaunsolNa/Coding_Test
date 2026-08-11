import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 1; i <= T; i++) {
		   st = new StringTokenizer(br.readLine(), " ");
		   
		   double N = Double.parseDouble(st.nextToken());
		   double D = Double.parseDouble(st.nextToken());
		   double A = Double.parseDouble(st.nextToken());
		   double B = Double.parseDouble(st.nextToken());
		   double F = Double.parseDouble(st.nextToken());
		   
		   double time = D / (A + B);
		   
		   System.out.print(i + " ");
		   System.out.printf("%.6f", time * F);
		   System.out.println();
	   }
   }
}
