import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   int sum = 0;
	   for(int i = 0; i <= N; i++) {
		   sum += (3 * i + N) * (N - i + 1) /2;
	   }
	   System.out.println(sum);
   }
}
