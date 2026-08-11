import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();

	   int idx = 1;
	   while(true) {
		   
		   int L = Integer.parseInt(br.readLine().replaceAll(" ", ""));
		   if(L == 0) break;
		   
		   int N = Integer.parseInt(br.readLine());
		   sb.append("User " + idx).append("\n");
		   
		   for(int i = 0; i < N; i++) {
			   int walk = Integer.parseInt(br.readLine());
			   
			   double cm = walk * L ;
			   String km = String.format("%.5f", cm / 100000);
			   sb.append(km + "\n");
		   }
		
		   idx++;
	   }
	   
	   System.out.println(sb);
   }
}
