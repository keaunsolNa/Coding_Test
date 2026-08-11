import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      long N = Long.parseLong(br.readLine());
      
      long sum = (N - 1) * (N + 1 + (N + 1) * (N - 1)) / 2;
      
      System.out.println(sum);
   }
}
