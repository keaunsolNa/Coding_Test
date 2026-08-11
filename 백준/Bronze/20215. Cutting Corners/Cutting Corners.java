import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	     
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   double w = Integer.parseInt(st.nextToken());
	   double h = Integer.parseInt(st.nextToken());
	   
	   double rc = w + h;
	   double dc = Math.sqrt((w*w) + (h*h));

	   System.out.println(rc - dc);
   }
}
