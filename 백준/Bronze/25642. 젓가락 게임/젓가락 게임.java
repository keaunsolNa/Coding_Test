import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
      int yt = Integer.parseInt(st.nextToken());
      int yj = Integer.parseInt(st.nextToken());
      
      while(true) {
    	  yj += yt;
    	  if(yj >= 5) {
    		  System.out.println("yt");
    		  break;
    	  }
    	  yt += yj;
    	  if(yt >= 5) {
    		  System.out.println("yj");
    		  break;
    	  }
      }
   }
}
