import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      int N = Integer.parseInt(st.nextToken());
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());
      int D = Integer.parseInt(st.nextToken());
      
      int money1 = 0;
      if(N%A == 0) {
    	  money1 = N/A*B;
      } else {
    	  money1 = ((N/A)+1)*B;
      }
      
      int money2 = 0;
      if(N%C == 0) {
    	  money2 = N/C*D;
      } else {
    	  money2 = ((N/C)+1)*D;
      }
      
      System.out.println(Math.min(money1, money2));
   }
}
