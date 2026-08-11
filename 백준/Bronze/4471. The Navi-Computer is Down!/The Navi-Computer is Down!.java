import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   while(T --> 0) {
		   
		   String name1 = br.readLine();
		   st = new StringTokenizer(br.readLine());
		   double x1 = Double.parseDouble(st.nextToken());
		   double y1 = Double.parseDouble(st.nextToken());
		   double z1 = Double.parseDouble(st.nextToken());
		   
		   String name2 = br.readLine();
		   st = new StringTokenizer(br.readLine());
		   double x2 = Double.parseDouble(st.nextToken());
		   double y2 = Double.parseDouble(st.nextToken());
		   double z2 = Double.parseDouble(st.nextToken());
		   
		   double d = (x2 - x1) * (x2 - x1);
		   d += (y2 - y1) * (y2 - y1);
		   d += (z2 - z1) * (z2 - z1);
		   
		   String ans = String.format("%.2f", Math.sqrt(d));
		   sb.append(name1 + " to " + name2 +": " + ans +"\n");
	   }
	   
	   System.out.print(sb);
   }
}
