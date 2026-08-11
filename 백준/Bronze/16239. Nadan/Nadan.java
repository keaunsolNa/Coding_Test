import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int K = Integer.parseInt(br.readLine());
	   int N = Integer.parseInt(br.readLine());

	   for(int i = 0; i < N - 1; i++) {
		   sb.append(i + 1 + "\n");
		   K -= (i + 1);
	   }
	   
	   sb.append(K);
	   
	   System.out.print(sb);
   }
}
