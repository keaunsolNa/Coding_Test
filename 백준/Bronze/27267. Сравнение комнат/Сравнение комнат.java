import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   double A = Double.parseDouble(st.nextToken());
	   double B = Double.parseDouble(st.nextToken());
	   double C = Double.parseDouble(st.nextToken());
	   double D = Double.parseDouble(st.nextToken());
	   
	   if(A * B < C * D) System.out.println("P");
	   else if(A * B > C * D) System.out.println("M");
	   else System.out.println("E");
   }
}
