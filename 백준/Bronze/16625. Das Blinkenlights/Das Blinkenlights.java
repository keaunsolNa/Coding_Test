import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int[] inputs = Arrays.stream(br.readLine().split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
	   
       int p = inputs[0];
       int q = inputs[1];
       int s = inputs[2];

       System.out.println(s >= p * q / gcd(p, q) ? "yes" : "no");
	   
   }

   private static int gcd(int first, int second) {
	   int max = Math.max(first, second);
       int min = Math.min(first, second);

       while (min != 0) {
           int res = max % min;
           max = min;
           min = res;
       }

       return max;
   }
}
