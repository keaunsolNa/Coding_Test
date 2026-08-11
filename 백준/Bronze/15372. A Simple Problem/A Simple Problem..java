import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine());
      for(int i = 0; i < T; i++) {
    	  int N = Integer.parseInt(br.readLine());
    	  
    	  long answer = (long)Math.pow(N, 2);
    	  
    	  System.out.println(answer);
      }
   }
}
