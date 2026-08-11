import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
      int HH = Integer.parseInt(st.nextToken());
      int MM = Integer.parseInt(st.nextToken());
      int time = 0;
      
      if(MM != 0) {
    	  time += MM;
    	  time += (HH-9) * 60;
      } else {
    	  time += (HH - 9) * 60;
      }
      
      System.out.println(time);
   }
}
