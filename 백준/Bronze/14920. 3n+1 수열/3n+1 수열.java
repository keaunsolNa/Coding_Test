import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int C = Integer.parseInt(br.readLine());
      int cnt = 1;
      
      while(C != 1) {
    	  
    	  if(C % 2 == 0) {
    		  C /= 2;
    		  cnt++;
    	  } else {
    		  C = 3*C + 1;
    		  cnt++;
    	  }
      }
      
      System.out.println(cnt);
   }
}
