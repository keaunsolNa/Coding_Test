import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 0; i < T; i++) {
    	  int sum = 0;
    	  int N = Integer.parseInt(br.readLine());
    	  for(int j = 1; j <= N; j++) {
    		  if(j%2 != 0) {
    			  sum+= j;
    		  }
    	  }
    	  System.out.println(sum);
      }
      
   }
}
