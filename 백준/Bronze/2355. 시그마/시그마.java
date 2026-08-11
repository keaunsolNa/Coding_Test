import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   long stat = Long.parseLong(st.nextToken());
	   long end = Long.parseLong(st.nextToken());
	   
	   if(end > stat) {
		   long temp = end;
		   end = stat;
		   stat = temp;
	   }
	   
	   System.out.println((stat + end) * (stat - end + 1) / 2);
   }
}
