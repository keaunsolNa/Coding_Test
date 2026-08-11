import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   double A = Integer.parseInt(st.nextToken());
	   double B = Integer.parseInt(st.nextToken());
	   double C = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   
	   double I = Integer.parseInt(st.nextToken());
	   double J = Integer.parseInt(st.nextToken());
	   double K = Integer.parseInt(st.nextToken());
	   
	   double min = Math.min(A / I, Math.min(B / J, C / K));

	   String aA = (int)(A - I * min) == (A - I * min) ? (int)(A - I * min)+"" : String.format("%.7f", (A - I * min));
	   String aB = (int)(B - J * min) == (B - J * min) ? (int)(B - J * min)+"" : String.format("%.7f", (B - J * min));
	   String aC = (int)(C - K * min) == (C - K * min) ? (int)(C - K * min)+"" : String.format("%.7f", (C - K * min));
	   
	   System.out.println(aA + " " + aB + " " + aC);
   }
}
