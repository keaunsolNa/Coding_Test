import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int H = Integer.parseInt(br.readLine());
	   int M = Integer.parseInt(br.readLine());
	   
	   int t;
	   boolean falling = true;
	   for(t = 1; t <= M; t++) {
		   
		   double A = ((-6 * (Math.pow(t, 4))) + (H * (Math.pow(t, 3))) + (2 * (Math.pow(t, 2))) + t);
		   
		   if(A <= 0) break;
		   if(t == M) {
			   falling = false;
			   break;
		   }
	   }
	   
	   if(falling) System.out.println("The balloon first touches ground at hour: " + t);
	   else System.out.println("The balloon does not touch ground in the given time.");
	   
   }
}
