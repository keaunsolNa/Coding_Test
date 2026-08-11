import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int A = Integer.parseInt(br.readLine());
      int B = Integer.parseInt(br.readLine());
      
      int answer = A+B;
      if(answer > 12) {
    	  answer %= 12;
    	  if(answer == 0) {
    		  answer = 12;
    	  }
      }
      
      System.out.println(answer);
   }
}
