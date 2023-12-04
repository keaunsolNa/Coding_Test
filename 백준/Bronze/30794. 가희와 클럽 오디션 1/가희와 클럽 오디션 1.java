import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int lw = Integer.parseInt(st.nextToken());
		String input = st.nextToken();
		
		switch(input) {
		
			case "miss" : System.out.println(0); break;
			case "bad"	: System.out.println(200 * lw); break;
			case "cool" : System.out.println(400 * lw); break;
			case "great" : System.out.println(600 * lw); break;
			case "perfect" : System.out.println(1000 * lw); break;
		}
   }
}