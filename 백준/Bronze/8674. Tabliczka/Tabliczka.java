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
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       
       long A  = Long.parseLong(st.nextToken());
       long B  = Long.parseLong(st.nextToken());
       
       if(A%2 == 0 || B%2 == 0) {
    	   System.out.println(0);
       } else {
    	   System.out.println(Math.min(A, B));
       }
   }
}
