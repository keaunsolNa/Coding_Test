import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine(), " ");
		   
		   int N = Integer.parseInt(st.nextToken());
		   int C = Integer.parseInt(st.nextToken());
		   
		   if(N%C == 0) System.out.println(N/C);
		   else System.out.println(N/C + 1);
		   
	   }
   }
}
