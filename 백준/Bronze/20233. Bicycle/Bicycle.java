import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int A = Integer.parseInt(br.readLine());
	   int B = Integer.parseInt(br.readLine());
	   int C = Integer.parseInt(br.readLine());
	   int D = Integer.parseInt(br.readLine());
	   int T = Integer.parseInt(br.readLine());
	   
	   
	   int AM = A + ((T>30 ? T : 30)  - 30) * B * 21;
	   int CM = C + ((T>45 ? T : 45) - 45) * D * 21;
			   
	   System.out.println(AM + " " + CM);
   }
}
