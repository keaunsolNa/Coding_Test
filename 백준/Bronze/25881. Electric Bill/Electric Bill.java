import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 0; i < T; i++) {
    	  int total = Integer.parseInt(br.readLine());
    	  
    	  StringBuilder sb = new StringBuilder();
    	  int pay = 0;
    	  if(total <= 1000) {
    		  pay = total*A;
    	  } else {
    		  pay = ((total-1000)*B) + (1000*A);
    	  }
    	  
    	  sb.append(total + " " + pay + "\n");
    	  System.out.print(sb);
      }
   }
}
