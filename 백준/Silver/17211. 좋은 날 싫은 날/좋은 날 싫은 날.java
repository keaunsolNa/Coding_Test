import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int N = Integer.parseInt(st.nextToken());
	   double temp =  Double.parseDouble(st.nextToken());
	   double[] arr = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
	   temp = (1 - temp) * 1000;
	   
	   for (int i = 0; i < N; i++) temp = temp * arr[0] + (1000 - temp) * arr[2];

       System.out.println(String.format("%.0f", temp));
       System.out.println(String.format("%.0f", 1000 - temp));
   }
}
