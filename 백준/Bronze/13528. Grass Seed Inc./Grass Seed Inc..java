import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   double C = Double.parseDouble(br.readLine());
	   int L = Integer.parseInt(br.readLine());
	   
	   double cost = 0;
	   for(int i = 0; i < L; i++) {
		   st = new StringTokenizer(br.readLine());
		   
		   double w = Double.parseDouble(st.nextToken());
		   double l = Double.parseDouble(st.nextToken());
		   
		   cost += (w * l * C);
	   }
	   
	   System.out.printf("%.7f",cost);
   }
}
