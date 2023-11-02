import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());

		double tr = 180.0 * (f / (double)r);
		double rr = tr % 360.0;
		
		if(rr < 90.0 || rr > 270.0) System.out.println("up");
		else System.out.println("down");
		
   }
}