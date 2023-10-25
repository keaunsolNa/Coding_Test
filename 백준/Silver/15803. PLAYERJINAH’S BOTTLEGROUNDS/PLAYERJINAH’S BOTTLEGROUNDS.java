import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		double x1 = Integer.parseInt(st.nextToken());
		double y1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		double x2 = Integer.parseInt(st.nextToken());
		double y2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		double x3 = Integer.parseInt(st.nextToken());
		double y3 = Integer.parseInt(st.nextToken());
		
	    double ret = x1 * y2 + x2 * y3 + x3 * y1;
	    ret -= (y1 * x2 + y2 * x3 + y3 * x1);
	    
	    System.out.println(ret == 0 ? "WHERE IS MY CHICKEN?" : "WINNER WINNER CHICKEN DINNER!");
   }
}