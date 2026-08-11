import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int day = Integer.parseInt(br.readLine());
	   int night = Integer.parseInt(br.readLine());
	   int weekend = Integer.parseInt(br.readLine());
	   
	   double planA = day > 100 ? day - 100 : 0;
	   planA *= 25;
	   planA += night * 15;
	   planA += weekend * 20;
	   
	   double planB = day > 250 ? day - 250 : 0;
	   planB *= 45;
	   planB += night * 35;
	   planB += weekend * 25;

	   System.out.println("Plan A costs " + planA / 100);
	   System.out.println("Plan B costs " + planB / 100);
	   System.out.println(planB > planA ? "Plan A is cheapest." : planA > planB ? "Plan B is cheapest." : "Plan A and B are the same price.");
	   
   }
}
