import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   StringBuilder sb = new StringBuilder();
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   int[] one = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		   Arrays.sort(one);
		   
		   st = new StringTokenizer(br.readLine());
		   int[] two = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		   Arrays.sort(two);
		   
		   String ans = "NO";
		   if((one[0] * one[0]) + (one[1] * one[1]) == one[2] * one[2]) {
			   if((two[0] * two[0]) + (two[1] * two[1]) == two[2] * two[2]) {
				   if(one[0] == two[0] && one[1] == two[1] && one[2] == two[2]) ans = "YES";
			   }
		   }
		   
		   sb.append(ans + "\n");
	   }
	   
	   System.out.print(sb);
   }
}
