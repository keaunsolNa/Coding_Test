import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int input = 0;
      
      while((input = Integer.parseInt(br.readLine())) != -1) {
    	  sb.append(input).append(" ");
          List<Integer> arr = new ArrayList<>();
          for(int i = 1; i < input; i++) if(input%i == 0) arr.add(i);

          int sum = 0;
          StringBuilder sb2 = new StringBuilder();
          
          for (Integer integer : arr) { 
        	  
        	  sum += integer;
        	  if(sum < input) sb2.append(integer).append(" + ");
        	  else sb2.append(integer);
        	  
          }
          
          
          if(input == sum) {
        	  sb.append("= ");
        	  sb.append(sb2);
          } else {
        	  sb.append("is NOT perfect.");
          }
          
          sb.append("\n");
      }
      
      sb.deleteCharAt(sb.length()-1);
      System.out.print(sb);
   }
}
