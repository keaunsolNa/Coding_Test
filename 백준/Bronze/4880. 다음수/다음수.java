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
      StringBuilder sb = new StringBuilder();
      StringTokenizer st;
      String input = "";
      
      while(!(input = br.readLine()).equals("0 0 0")) {
    	  st = new StringTokenizer(input, " ");
    	  int a1 = Integer.parseInt(st.nextToken());
    	  int a2 = Integer.parseInt(st.nextToken());
    	  int a3 = Integer.parseInt(st.nextToken());
    	  
    	  if(a2 - a1 == a3 - a2) {
    		  sb.append("AP ").append(a3 + (a2 - a1)).append("\n");
    	  } else {
    		  sb.append("GP ").append(a3 * (a2 / a1)).append("\n");
    	  }
      }
      
      sb.deleteCharAt(sb.length() - 1);
      System.out.println(sb);
      
   }
}
