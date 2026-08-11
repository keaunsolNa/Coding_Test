import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = "";
	   
	   while(!(input = br.readLine()).equals("0 0 0 0 0 0")) {
		   
		   double[] arr = Arrays.stream(input.split(" ")).map(String::trim).mapToDouble(Double::parseDouble).toArray();
		   Arrays.sort(arr);
		   
		   double sum = 0;
		   for(int i = 1; i < arr.length - 1; i++) sum += arr[i];
		   String av = sum / 4 + "";
		   
		   for(int i = av.length() - 1; i >= 0; i--) {
			   
			   if(av.charAt(i) == '0' || av.charAt(i) == '.') {
				   av = av.substring(0, i);
			   } else break;
		   }
		   
		   System.out.println(av);
	   }
   }
}
