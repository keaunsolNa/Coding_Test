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
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 0; i < T; i++) {
    	  int car = Integer.parseInt(br.readLine());
    	  int option = Integer.parseInt(br.readLine());
    	  
    	  for(int j = 0; j < option; j++) {
    		  String[] temp = br.readLine().split(" ");
    		  car += Integer.parseInt(temp[0]) * Integer.parseInt(temp[1]);
    	  }
    	  
    	  System.out.println(car);
      }
   }
}
