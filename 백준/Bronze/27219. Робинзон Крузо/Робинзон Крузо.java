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
      StringBuilder sb = new StringBuilder();
      
      int N = Integer.parseInt(br.readLine());
      for(int i = 0; i < N / 5; i++) sb.append("V");
      for(int i = 0; i < N % 5; i++) sb.append("I");
      
      System.out.println(sb);
   }
}
