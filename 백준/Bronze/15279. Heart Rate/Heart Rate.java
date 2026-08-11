import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   
	   int N = Integer.parseInt(br.readLine());
	   
	   while(N --> 0) {
		   st = new StringTokenizer(br.readLine());
		   double b = Double.parseDouble(st.nextToken());
		   double p = Double.parseDouble(st.nextToken());
		   
		   double bpm = 60.0 * b / p;
		   double min = bpm * (1 - 1.0 / b) ;
		   double max = bpm * (1 + 1.0 / b) ;
		   
		   System.out.printf("%.4f", min);
		   System.out.print(" ");
		   System.out.printf("%.4f", bpm);
		   System.out.print(" ");
		   System.out.printf("%.4f", max);
		   
		   System.out.println();
	   }
   }
}
