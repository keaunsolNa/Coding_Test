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
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   while(N --> 0) {
		   st = new StringTokenizer(br.readLine());
		   
		   double P = Double.parseDouble(st.nextToken());
		   double C = Double.parseDouble(st.nextToken());
		   
		   System.out.printf("%.9f", P / (C + 100) * 100);
		   System.out.println();
	   }

   }
}
