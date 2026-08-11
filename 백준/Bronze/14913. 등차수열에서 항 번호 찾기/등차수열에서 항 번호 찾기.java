import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       int a = Integer.parseInt(st.nextToken());
       int d = Integer.parseInt(st.nextToken());
       int k = Integer.parseInt(st.nextToken());
       
       if((k-a)/d >= 0 && (k-a)%d == 0) {
    	   System.out.println((k-a)/d + 1);
       } else {
    	   System.out.println("X");
       }
   }
}
