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
      int N = Integer.parseInt(br.readLine());
      
      int number = 0;
      while((number = Integer.parseInt(br.readLine())) != 0) {
    	  String answer  = "";
    	  if(number % N ==0) {
    		  answer = " is a multiple of " + N + ".";
    	  } else {
    		  answer = " is NOT a multiple of " + N + ".";
    	  }
    	  
    	  System.out.println(number + answer);
      }
      
   }
}
