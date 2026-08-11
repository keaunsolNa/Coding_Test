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
      int q = Integer.parseInt(br.readLine());
     
      while (q --> 0) {
    	  
    	  int a = Integer.parseInt(br.readLine());
    	  if ((a & -a) == a) sb.append(1 + "\n");
          else sb.append(0 + "\n");
    	  
      }
      
      sb.deleteCharAt(sb.length() - 1);
      System.out.print(sb);
   }
}
