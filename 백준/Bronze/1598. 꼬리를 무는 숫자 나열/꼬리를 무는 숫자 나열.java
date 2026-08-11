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
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   
       int x1 = (a - 1) / 4 + 1;
       int x2 = (b - 1) / 4 + 1;
       int y1 = (a - 1) % 4;
       int y2 = (b - 1) % 4;	   
       
       System.out.println(Math.abs(x2 - x1) + Math.abs(y2 - y1));
   }
}
