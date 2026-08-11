import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int i = 0; i < T; i++) {
		   st = new StringTokenizer(br.readLine(), " ");
		   int V = Integer.parseInt(st.nextToken());
		   int E = Integer.parseInt(st.nextToken());
		   System.out.println(Math.abs(V - E - 2));
	   }
   }
}
