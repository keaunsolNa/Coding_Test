import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      StringTokenizer st;
      
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 1; i <= T; i++) {
    	  st = new StringTokenizer(br.readLine(), " ");
    	  int A = Integer.parseInt(st.nextToken());
    	  int B = Integer.parseInt(st.nextToken());
    	  int C = Integer.parseInt(st.nextToken());
    	  int[] temp = new int[3];
    	  temp[0] = A;
    	  temp[1] = B;
    	  temp[2] = C;
    	  
    	  Arrays.sort(temp);
    	  
    	  sb.append("Case #").append(i).append(": ");
    	  if(temp[2] >= temp[0] + temp[1]) sb.append("invalid!");
    	  else if(A == B && A == C) sb.append("equilateral");
    	  else if (A == B || A == C || B == C) sb.append("isosceles");
    	  else sb.append("scalene");
    		  
    	  sb.append("\n");
      }
      
      sb.deleteCharAt(sb.length()-1);
      System.out.print(sb);
   }
}
