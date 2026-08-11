import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int N = Integer.parseInt(st.nextToken());
      int W = Integer.parseInt(st.nextToken());
      int H = Integer.parseInt(st.nextToken());
      double Z = Math.sqrt((W*W) + (H*H)); 
      
      double box = Math.max(W, Math.max(H, Z));
      for(int i = 0; i < N; i++) {
    	  int length = Integer.parseInt(br.readLine());
    	  if(length > box) {
    		  System.out.println("NE");
    	  } else {
    		  System.out.println("DA");
    	  }
      }
      
   }
}
