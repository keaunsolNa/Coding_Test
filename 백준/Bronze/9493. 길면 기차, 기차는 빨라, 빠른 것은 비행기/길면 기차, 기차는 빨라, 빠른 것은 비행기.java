import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = "";
	   
	   while(!(input = br.readLine()).equals("0 0 0")) {
		   double M = Integer.parseInt(input.split(" ")[0]);
		   double A = Integer.parseInt(input.split(" ")[1]);
		   double B = Integer.parseInt(input.split(" ")[2]);
		   
			double result = Double.parseDouble(String.format("%.0f", (((M / A) - (M / B)) * 3600)));
			
			int h = (int) (result / 3600);
			int m = (int) ((result / 60) % 60);
			int s = (int) (result % 60);
			
			System.out.format("%d:%02d:%02d\n", h, m, s);
	   }
	   
   }
}
