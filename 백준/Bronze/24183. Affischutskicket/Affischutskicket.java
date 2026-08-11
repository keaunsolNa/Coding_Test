import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
	   double A = Integer.parseInt(st.nextToken());
	   double B = Integer.parseInt(st.nextToken());
	   double C = Integer.parseInt(st.nextToken());
	   
	   double C4 = 229 * 324 * A * 2;
	   double A3 = 297 * 420 * B * 2;
	   double A4 = 210 * 297 * C;
	   
	   System.out.printf("%.6f", (C4 + A3 + A4) * 0.000001);
   }
}
