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
       int T = Integer.parseInt(br.readLine());
       
       while(T --> 0) {
    	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	   
    	   int a = Integer.parseInt(st.nextToken());
    	   int b = Integer.parseInt(st.nextToken());
    	   
    	   if(a + b != 1) {
    		   System.out.println(1);
    	   } else {
    		   System.out.println(2);
    	   }
       }
   }
}
