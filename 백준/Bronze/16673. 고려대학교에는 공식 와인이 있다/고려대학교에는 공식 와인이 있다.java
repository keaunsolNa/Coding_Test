import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   int C = Integer.parseInt(st.nextToken());
	   int K = Integer.parseInt(st.nextToken());
	   int P = Integer.parseInt(st.nextToken());
	   
	   int sum = 0;
	   for(int i = 1; i <= C; i++) sum += (K*i) + (P*i*i);
	   
	   System.out.println(sum); 
   }
}
