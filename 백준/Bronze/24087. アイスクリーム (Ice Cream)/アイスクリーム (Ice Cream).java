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
      int S = Integer.parseInt(br.readLine());
      int A = Integer.parseInt(br.readLine());
      int B = Integer.parseInt(br.readLine());
      
      if(S-A <= 0) {
    	  System.out.println(250);
      } else {
    	  if((S-A)%B == 0) {
    		  System.out.println(250 + (((S-A)/B)*100));
    	  } else {
    		  System.out.println(350 + (((S-A)/B)*100));
    	  }
      }
	   
   }
}
