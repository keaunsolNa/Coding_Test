import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   while(true) {
		   int N = Integer.parseInt(br.readLine());
		   
		   if(N == 0) break;
		   
		   int res = N * N - (N - 1);
		   
		   System.out.println(N + " => " + res);
	   }
   }
}
