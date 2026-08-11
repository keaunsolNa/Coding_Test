import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      int sum = 0;
      
      for(int i = 1; i <= N; i++) {
    	  if(N%i == 0) {
    		  sum += i;
    	  }
      }
      System.out.println(sum*5 - 24);
   }
}
