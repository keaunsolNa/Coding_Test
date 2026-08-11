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
      int T = Integer.parseInt(br.readLine());

      for(int i = 0; i < T; i++) {
    	  StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	  
    	  int A = Integer.parseInt(st.nextToken());
    	  int B = Integer.parseInt(st.nextToken());
    	  int totalPrice = 0;

    	  if(A == 0) {
    		  totalPrice += 0;
    	  } else if(A == 1) {
    		  totalPrice += 5000000;
    	  } else if(A <= 3) {
    		  totalPrice += 3000000;
    	  } else if(A <= 6) {
    		  totalPrice += 2000000;
    	  } else if(A <= 10) {
    		  totalPrice += 500000;
    	  } else if(A <= 15) {
    		  totalPrice += 300000;
    	  } else if(A <= 21) {
    		  totalPrice += 100000;
    	  }
    	  
    	  if(B == 0) {
    		  totalPrice += 0;
    	  } else if(B == 1) {
    		  totalPrice += 5120000;
    	  } else if(B <= 3) {
    		  totalPrice += 2560000;
    	  } else if(B <= 7) {
    		  totalPrice += 1280000;
    	  } else if(B <= 15) {
    		  totalPrice += 640000;
    	  } else if(B <= 31) {
    		  totalPrice += 320000;
    	  }
    	  
    	  System.out.println(totalPrice);
      }
   }
}
