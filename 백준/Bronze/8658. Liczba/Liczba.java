import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      
      int min = 0;
      for(int i = 2; i < N - 1; i++) {
    	  if(N % i != 0) {
    		  min = i;
    		  break;
    	  }
      }
      
      int max = 0;
      for(int i = N - 1; i >= 2; i--) {
    	  if(N % i != 0) {
    		  max = i;
    		  break;
    	  }
      }
      
      System.out.println(min + " " + max);
   }
}
