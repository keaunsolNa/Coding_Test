import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   
	   String str = "";
	   while((str = br.readLine()) != null) {
		   
		   long[] input = Arrays.stream(str.split(" ")).map(String::trim).mapToLong(Long::parseLong).toArray();
		   
		   int N = (int)input[0];
		   int w = (int)input[1];
		   int d = (int)input[2];
		   long sum = input[3];
		   	
		   long fullWeight = N * (N - 1) / 2 * w;
		   
		   long ans = Math.abs(sum - fullWeight) / d;
		   
		   if(ans == 0) System.out.print(N + "\n");
		   else System.out.print(ans + "\n");
			   
	   }
   }
}
