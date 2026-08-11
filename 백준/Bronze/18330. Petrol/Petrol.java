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
      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());
      
      int total1500 = k+60;
      
      if(total1500 - n > 0) {
    	  System.out.println(n*1500);
      } else {
    	  System.out.println((total1500*1500) + ((n-total1500)*3000));
      }
   }
}
