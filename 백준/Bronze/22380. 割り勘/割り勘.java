import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      String input = "";
      
      while(!(input = br.readLine()).equals("0 0")) {
    	  st = new StringTokenizer(input);
    	  int N = Integer.parseInt(st.nextToken());
    	  int M = Integer.parseInt(st.nextToken());
    	  
    	  st = new StringTokenizer(br.readLine());
    	  int tax = M/N;
    	  int totalMoney = 0;
    	  for(int i = 0; i < N; i++) {
    		  
    		  int money = Integer.parseInt(st.nextToken());
    		  
    		  if(money > tax) totalMoney += tax;
    		  else totalMoney += money;
    			  
    	  }
    	  
    	  System.out.println(totalMoney);
      }
      
   }
}
