import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      
      double percent = 0;
      StringTokenizer st = new StringTokenizer(br.readLine());
      StringBuilder sb = new StringBuilder();
      
      while (N --> 0) {
          int cur = Integer.parseInt(st.nextToken());
          percent = cur + percent - percent*cur/100;
          sb.append(percent).append('\n');
      }
      System.out.print(sb);
      
      
   }
}
