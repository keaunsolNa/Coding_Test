import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      int T = Integer.parseInt(br.readLine());
      
      while(T --> 0) {
    	  st = new StringTokenizer(br.readLine(), " ");
    	  double a = Double.parseDouble(st.nextToken());
    	  double b = Double.parseDouble(st.nextToken());
    	   
    	  double h = 2*a/b;
    	  
    	  System.out.print("The height of the triangle is ");
    	  System.out.printf("%.2f", h);
    	  System.out.println(" units");
      }
   }
}
