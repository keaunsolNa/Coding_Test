import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   String input = "";
	   StringBuilder sb = new StringBuilder();
	   while(!(input = br.readLine()).equals("0 0")) {
		   int A = Integer.parseInt(input.split(" ")[0]);
		   int B = Integer.parseInt(input.split(" ")[1]);
		   
		   sb.append(A/B).append(" ").append(A%B).append(" / ").append(B).append("\n");
	   }
	   
	   sb.deleteCharAt(sb.length() - 1);
	   System.out.print(sb);
   }
}
