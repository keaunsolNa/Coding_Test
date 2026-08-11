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
      
      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      
      long tmp = (s + 1) * s / 2;
      tmp %= 14579;
      long answer = tmp;
      
      for (int i = s + 1; i <= e; i++){
    	  
          answer *= (tmp += i);
          answer %= 14579;
      }
      
      System.out.println(answer);
      
   }
}
