import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int n = Integer.parseInt(br.readLine());
	   
	   int Q1 = 0;
	   int Q2 = 0;
	   int Q3 = 0;
	   int Q4 = 0;
	   int AXIS = 0;
	   
	   for(int i = 0; i < n; i++) {
		   StringTokenizer st = new StringTokenizer(br.readLine());
		   int x = Integer.parseInt(st.nextToken());
		   int y = Integer.parseInt(st.nextToken());
		   
		   if(x == 0 || y == 0) {
			   AXIS++;
		   } else if(x > 0 && y > 0) {
			   Q1++;
		   } else if(x > 0  && y < 0) {
			   Q4++;
		   } else if(x < 0 && y > 0) {
			   Q2++;
		   } else if(x < 0 && y < 0) {
			   Q3++;
		   }
	   }
	   
	   System.out.println("Q1: " + Q1);
	   System.out.println("Q2: " + Q2);
	   System.out.println("Q3: " + Q3);
	   System.out.println("Q4: " + Q4);
	   System.out.println("AXIS: " + AXIS);
   }
}
