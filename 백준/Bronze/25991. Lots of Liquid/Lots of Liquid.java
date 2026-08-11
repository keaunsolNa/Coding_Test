import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   
	   double sum = 0;
	   
	   for(int i = 0; i < N; i++) {
		   double c = Double.parseDouble(st.nextToken());
		   sum += Math.pow(c, 3);
	   }
	   
	   System.out.println(Math.cbrt(sum));
	   
   }
}
