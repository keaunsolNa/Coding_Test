import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int i = 1;
	
	   while(true) {
		
		   StringTokenizer st = new StringTokenizer(br.readLine());
		   double A = Double.parseDouble(st.nextToken());
		   double B = Double.parseDouble(st.nextToken());
		   double C = Double.parseDouble(st.nextToken());

		   if(B == 0) break;

		   C = (C / 60) / 60;
			
		   double distance = ((((A * 3.1415927) * B) / 12) / 5280);
		   double MPH = (distance / C); 
			
		   sb.append("Trip #" + i + ": " + String.format("%.2f", distance) + " " + String.format("%.2f", MPH) + "\n");
		   i++;
		}

	   System.out.println(sb);
   }
}
