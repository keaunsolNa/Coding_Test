import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   
	   while(true) {
		   double[] arr = Arrays.stream(br.readLine().split(" ")).map(String::trim).mapToDouble(Double::parseDouble).toArray();
		   
		   if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
		   
		   double W = arr[0] * 16 / Math.sqrt(337);
		   double H = (9 * W) / 16;
		   double DH = arr[1] / W;
		   double DV = arr[2] / H;
		   
		   System.out.print("Horizontal DPI: ");
		   System.out.printf("%.2f", DH);
		   System.out.println();
		   
		   System.out.print("Vertical DPI: ");
		   System.out.printf("%.2f", DV);
		   System.out.println();
		   
	   }
   }
}
