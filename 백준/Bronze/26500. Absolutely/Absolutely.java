import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       int T = Integer.parseInt(br.readLine());
       
       while(T --> 0) {
     	  st = new StringTokenizer(br.readLine(), " ");
    	  double a = Double.parseDouble(st.nextToken());
    	  double b = Double.parseDouble(st.nextToken()); 
    	  
    	  double ans = Math.abs(a-b);
    	  
    	  System.out.printf("%.1f", ans);
    	  System.out.println();
       }
   }
}
