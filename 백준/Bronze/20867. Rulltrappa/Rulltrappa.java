import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   int M = Integer.parseInt(st.nextToken());
	   int S = Integer.parseInt(st.nextToken());
	   int G = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine(), " ");
	   double A = Double.parseDouble(st.nextToken());
	   double B = Double.parseDouble(st.nextToken());

	   st = new StringTokenizer(br.readLine(), " ");
	   int L = Integer.parseInt(st.nextToken());
	   int R = Integer.parseInt(st.nextToken());
	   
	   double stop = (1 / A) * L + (double)M / (double)G;
	   double move = (1 / B) * R + (double)M / (double)S;
	   
	   if(stop < move) {
		   System.out.println("friskus");
	   } else {
		   System.out.println("latmask");
	   }
	   
   }
}
