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
      StringBuilder sb = new StringBuilder();
      StringTokenizer st;
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 0; i < T; i++) {
    	  st = new StringTokenizer(br.readLine(), " ");
    	  int c = Integer.parseInt(st.nextToken());
    	  int v = Integer.parseInt(st.nextToken());
    	  
    	  sb.append("You get ").append(c/v).append(" piece(s) and your dad gets ").append(c%v).append(" piece(s).");
    	  
    	  if(i < T-1) sb.append("\n");
      }
      
      System.out.println(sb);
   }
}
