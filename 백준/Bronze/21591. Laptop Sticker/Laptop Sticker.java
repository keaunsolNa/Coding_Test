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
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int wc = Integer.parseInt(st.nextToken());
      int hc = Integer.parseInt(st.nextToken());
      int ws = Integer.parseInt(st.nextToken());
      int hs = Integer.parseInt(st.nextToken());
      
      
      if(wc - ws >= 2 && hc - hs >= 2) {
    	  System.out.println(1);
      } else {
    	  System.out.println(0);
      }
      
   }
}
