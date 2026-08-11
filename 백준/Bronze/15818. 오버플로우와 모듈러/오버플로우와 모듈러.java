import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   int N = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   String[] temp = br.readLine().split(" ");
	   
	   long sum = 1;
	   for(int i = 0; i < N; i++) {
		   int A = Integer.parseInt(temp[i]);
		   
		   sum *= A % M;
		   sum %= M;
	   }
	   
	   System.out.println(sum);
	   
   }
}
