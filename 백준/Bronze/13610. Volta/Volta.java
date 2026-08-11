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
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int X = Integer.parseInt(st.nextToken());
	   int Y = Integer.parseInt(st.nextToken());

	   int ans = 0;
	   for(; (Y - X) * ans < Y; ans++);
	   
	   System.out.println(ans);
   }
}
