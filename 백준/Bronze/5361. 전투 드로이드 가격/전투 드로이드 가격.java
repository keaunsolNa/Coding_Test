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
    	   double answer = 0;
    	   StringTokenizer st = new StringTokenizer(br.readLine());
    	   answer += (double)350.34 * Integer.parseInt(st.nextToken());
    	   answer += (double)230.90 * Integer.parseInt(st.nextToken());
    	   answer += (double)190.55 * Integer.parseInt(st.nextToken());
    	   answer += (double)125.30 * Integer.parseInt(st.nextToken());
    	   answer += (double)180.90 * Integer.parseInt(st.nextToken());
    	   System.out.print("$");
    	   System.out.printf("%.2f", answer);
    	   System.out.println();
       }
       
   }
}
