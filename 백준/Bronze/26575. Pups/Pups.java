import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      int N = Integer.parseInt(br.readLine());
      
      while(N --> 0) {
    	  st = new StringTokenizer(br.readLine(), " ");
    	  
    	  double d = Double.parseDouble(st.nextToken());
    	  double f = Double.parseDouble(st.nextToken());
    	  double p = Double.parseDouble(st.nextToken());
    	
    	  double ans = (d*f*p);
    	  System.out.print("$");
    	  System.out.printf("%.2f", ans);
    	  System.out.println();
      }
      
   }
}
