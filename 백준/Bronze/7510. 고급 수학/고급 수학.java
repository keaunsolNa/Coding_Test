import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());
       StringTokenizer st;

       for(int i = 0; i < T; i++) {
    	   st = new StringTokenizer(br.readLine(), " ");
    	   int[] triangle = new int[3];
    	   
    	   triangle[0] = Integer.parseInt(st.nextToken());
    	   triangle[1] = Integer.parseInt(st.nextToken());
    	   triangle[2] = Integer.parseInt(st.nextToken());
    	   
    	   Arrays.sort(triangle);
    	   
    	   if((triangle[0] * triangle[0]) + (triangle[1] * triangle[1]) == triangle[2] * triangle[2]) {
    		   System.out.println("Scenario #" + (i+1) + ":");
			   System.out.println("yes");
    	   } else {
    		   System.out.println("Scenario #" + (i+1) + ":");
			   System.out.println("no");
    	   }
    	   
    	   if(i != T - 1) {
    		   System.out.println();
    	   }
       }
   }
}
