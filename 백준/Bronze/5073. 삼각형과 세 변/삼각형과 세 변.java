import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      String input = "";
      
      while(!(input = br.readLine()).equals("0 0 0")) {
    	  st = new StringTokenizer(input, " ");
    	  int[] dgree = new int[3];
    	  
    	  dgree[0] = Integer.parseInt(st.nextToken());
    	  dgree[1] = Integer.parseInt(st.nextToken());
    	  dgree[2] = Integer.parseInt(st.nextToken());
    	  
    	  Arrays.sort(dgree);
    	  
    	  if(dgree[2] >= dgree[0] + dgree[1]) {
    		  System.out.println("Invalid");
    	  } else if(dgree[0] == dgree[1] && dgree[0] == dgree[2]) {
    		  System.out.println("Equilateral");
    	  } else if(dgree[0] != dgree[1] && dgree[0] != dgree[2] && dgree[1] != dgree[2]) {
    		  System.out.println("Scalene");
    	  } else {
    		  System.out.println("Isosceles");
    	  }
    	  
      }
   }
}
