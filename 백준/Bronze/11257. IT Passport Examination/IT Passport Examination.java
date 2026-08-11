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
      int testCase = Integer.parseInt(br.readLine());
      
      for(int i = 0; i < testCase; i++) {
    	  StringTokenizer st = new StringTokenizer(br.readLine());
    	  int people = Integer.parseInt(st.nextToken());
    	  int T1 = Integer.parseInt(st.nextToken());
    	  int T2 = Integer.parseInt(st.nextToken());
    	  int T3 = Integer.parseInt(st.nextToken());
    	  int total = T1+T2+T3;
    	  
    	  String SF = "FAIL";
    	  if(total >= 55) {
    		  
    		  if(T1 >= 11 && T2 >= 8 && T3 >=12) {
    			  SF = "PASS";
    		  }
    	  }
    	  
    	  
    	  System.out.println(people + " " + (T1+T2+T3) + " " + SF);
      }
      
   }
}
