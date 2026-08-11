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
      int P = Integer.parseInt(st.nextToken());
      
      st = new StringTokenizer(br.readLine(), " ");
      int hole = 0;
      for(int i = 0; i < P; i++) {
    	  int cap = Integer.parseInt(st.nextToken());
    	  switch(cap) {
    	  	case 3 : hole += 2; break;
    	  	case 4 : hole += 2; break;
    	  	case 5 : hole += 3; break;
    	  	case 6 : hole += 3; break;
    	  	case 7 : hole += 4; break;
    	  	case 8 : hole += 4; break;
    	  }
      }
      
      if(hole >= N) {
    	  System.out.println("YES");
      } else {
    	  System.out.println("NO");
      }
      
   }
}
