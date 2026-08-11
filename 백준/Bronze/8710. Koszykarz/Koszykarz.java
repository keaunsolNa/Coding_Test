import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      long k = Long.parseLong(st.nextToken());
      long w = Long.parseLong(st.nextToken());
      long m = Long.parseLong(st.nextToken());

      long need = w - k;
      int answer = 0;
      for(long i = m; i < need; i+=m) {
    	  answer++;
      }
      
      System.out.println(answer+1);
   }
}
