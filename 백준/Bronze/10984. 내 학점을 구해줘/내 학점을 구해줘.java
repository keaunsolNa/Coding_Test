import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());
       
       for(int i = 0; i < T; i++) {
    	   int N = Integer.parseInt(br.readLine());
    	   int totalC = 0;
    	   double totalG = 0;
    	   for(int j = 0; j < N; j++) {
    		   String[] temp = br.readLine().split(" ");
    		   
    		   totalC += Integer.parseInt(temp[0]);
    		   totalG += Integer.parseInt(temp[0])*Double.parseDouble(temp[1]);
    		   
    	   }
    	   
    	   System.out.println(totalC + " " + (double)Math.round(totalG/totalC*10)/10);
       }
   }
}
