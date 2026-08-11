import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      double A = Double.parseDouble(st.nextToken());
      double B = Double.parseDouble(st.nextToken());
      
      double answer = 1 / (1 + Math.pow(10, (B - A) / 400.0));
      
      System.out.println(answer);
   }
}
