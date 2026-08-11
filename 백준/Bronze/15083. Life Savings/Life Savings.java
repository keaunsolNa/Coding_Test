import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st; 
	   
	   st = new StringTokenizer(br.readLine());
	   
	   double[] p = new double[3];
	   
	   p[0] = Double.parseDouble(st.nextToken());
	   p[1] = Double.parseDouble(st.nextToken());
	   p[2] = Double.parseDouble(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   
	   double c1 = Double.parseDouble(st.nextToken());
	   double c2 = Double.parseDouble(st.nextToken());
	   double c3 = Double.parseDouble(st.nextToken());
	   
	   Arrays.sort(p);
	   
	   double one = (p[0] + p[1] + p[2]) * (c1 / 100);
	   double two = ((p[2] * (Math.max(c2, c3) / 100)) + (p[1] * (Math.min(c2, c3) / 100)));
	   
	   if(one > two) System.out.printf("one " + "%.2f",one);
	   else System.out.printf("two " + "%.2f", two);
   }
}
