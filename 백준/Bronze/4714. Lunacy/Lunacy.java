import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	     
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   double weight = 0;
	   
	   while((weight = Double.parseDouble(br.readLine())) > 0) {
		   StringBuilder sb = new StringBuilder();
		   String moonWeight = String.format("%.2f", weight*0.167);
		   String earthWeight = String.format("%.2f", weight);
		   sb.append("Objects weighing ").append(earthWeight).append(" on Earth will weigh ").append(moonWeight).append(" on the moon.");
		   System.out.println(sb);
	   }

   }
}
