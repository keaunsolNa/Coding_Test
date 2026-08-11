import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	
	   int Z = Integer.parseInt(br.readLine());
	   while(Z -- > 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   double[] adam = new double[3];
		   adam[0] = Double.parseDouble(st.nextToken());
		   adam[1] = Double.parseDouble(st.nextToken());
		   adam[2] = Double.parseDouble(st.nextToken());
		   
		   st = new StringTokenizer(br.readLine());
		   double[] gosia = new double[3];
		   gosia[0] = Double.parseDouble(st.nextToken());
		   gosia[1] = Double.parseDouble(st.nextToken());
		   gosia[2] = Double.parseDouble(st.nextToken());
		   
		   double p = 0;

		   for (int j = 0; j < 3; j++) 
			   p += adam[j] *  gosia[(j + 1) % 3] - adam[j] * gosia[(j + 2) % 3];
	        
	        if(p > 0) System.out.println("ADAM");
	        else if (p < 0) System.out.println("GOSIA");
	        else System.out.println("=");
		   
	   }
   }
}
