import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      
      int N = Integer.parseInt(br.readLine());
      
      int AP = 0;
      int BP = 0;
      while(N --> 0) {
    	  st = new StringTokenizer(br.readLine());
    	  int A = Integer.parseInt(st.nextToken());
    	  int B = Integer.parseInt(st.nextToken());
    	  
    	  if(A > B) AP += A + B;
    	  else if(A < B) BP += A + B;
    	  else {
    		  AP += A;
    		  BP += B;
    	  }
      }
      
      System.out.println(AP + " " + BP);
   }
}
