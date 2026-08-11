import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   
	   int total = 0;
	   for(int i = 0; i < N; i++) {

		   String temp = br.readLine().replaceAll("0|6|9", "9");
		   int point = (Integer.parseInt(temp) > 100) ? 100 : Integer.parseInt(temp);
		   total += point;
		   
	   }
	   double ave = (double)total / N;
	   System.out.println((int)Math.round(ave));
   }
}
