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
	   int T = Integer.parseInt(br.readLine());
	   StringTokenizer st;;
	   
	   for(int i = 0; i < T; i++) {
		   st = new StringTokenizer(br.readLine(), " ");
		   
		   int foot = Integer.parseInt(st.nextToken());
		   int chicken = Integer.parseInt(st.nextToken());
		   System.out.println((chicken * 2 - foot) + " " + (chicken - (chicken * 2 - foot)));
	   }

   }
}
