import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int A = Integer.parseInt(br.readLine());
       int B = Integer.parseInt(br.readLine());
       int C = Integer.parseInt(br.readLine());
       int D = Integer.parseInt(br.readLine());
       int P = Integer.parseInt(br.readLine());

       int PA = P*A;
       int PB = 0;
       if(P < C) {
    	   PB = B;
       } else {
    	   PB = ((P-C)*D) + B;
       }
       System.out.println(Math.min(PA, PB));
   }
}
