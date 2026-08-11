import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int k = Integer.parseInt(br.readLine());
	   
       for (int i = 0; i < k; i++) sb.append(1);
       for (int i = 1; i < k; i++) sb.append(0);
	
       System.out.println(sb);

   }
}
