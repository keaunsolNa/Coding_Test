import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      
      int T = Integer.parseInt(br.readLine());
      
      while(T --> 0) {
    	  String[] input = br.readLine().split(" ");
    	  
    	  double number = Double.parseDouble(input[0]);
    	  
    	  for(int i = 1; i < input.length; i++) {
    		  
    		  switch(input[i]) {
    		  	case "@" : number *= 3; break;
    		  	case "%" : number += 5; break;
    		  	case "#" : number -= 7; break;
    		  }
    	  }
    	  
    	  System.out.printf("%.2f", number);
    	  System.out.println();
      }
	   
   }
}
