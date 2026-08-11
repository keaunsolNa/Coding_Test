import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   st = new StringTokenizer(br.readLine());
	   double n = Integer.parseInt(st.nextToken());
	   double k = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   double d = Integer.parseInt(st.nextToken());
	   double s = Integer.parseInt(st.nextToken());
	   
	   double average = (d * n - (k * s)) / (n - k);
	   
	   if(average >= 0 && average <= 100) System.out.printf("%.7f", average);
	   else System.out.println("impossible");
	   
   }
}
