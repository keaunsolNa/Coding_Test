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
      StringBuilder sb = new StringBuilder();
      StringTokenizer st;
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 0; i < T; i++) {
    	  st = new StringTokenizer(br.readLine(), " ");
    	  long A = Integer.parseInt(st.nextToken());
    	  long B = Integer.parseInt(st.nextToken());
    	  long C = Integer.parseInt(st.nextToken());
    	  long D = Integer.parseInt(st.nextToken());
    	  
    	  if(B*C > B*D + A) {
    		  sb.append("parallelize");
    	  } else if(B*C < B*D + A) {
    		  sb.append("do not parallelize");
    	  } else {
    		  sb.append("does not matter");
    	  }
    	  
    	  if(i < T-1) sb.append("\n");
      }
      
      System.out.print(sb);
      
   }
}
