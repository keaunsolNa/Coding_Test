import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
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
	   StringTokenizer st;
	   st = new StringTokenizer(br.readLine());
	   
	   double n = Integer.parseInt(st.nextToken());
	   double T = Integer.parseInt(st.nextToken());
	   
	   double m = Integer.parseInt(br.readLine());
	   
	   st = new StringTokenizer(br.readLine());
	   double x = Integer.parseInt(st.nextToken());
	   double y = Integer.parseInt(st.nextToken());
	   
       double a = 1 * m / (x * 60);
       double b = 1 * (n - m) / (y * 60);
       
       if (a + b < T) 
           System.out.println(0);
       else 
           System.out.println((int)(a + b - T + 1));
	   
   }
}
