import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 1; i <= T; i++) {
		   
		   if(i % 7 == 0 && i % 11 == 0) sb.append("Wiwat!").append("\n");
		   else if(i % 7 == 0) sb.append("Hurra!").append("\n");
		   else if(i % 11 == 0)  sb.append("Super!").append("\n");
		   else sb.append(i).append("\n");
	   }
	   
	   sb.deleteCharAt(sb.length()-1);
	   
	   System.out.print(sb);
   }
}
