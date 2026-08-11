import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int[] odd = new int[T];
      int[] even = new int[T];

      for(int i = 0; i < T; i++) {
    	  int number = Integer.parseInt(st.nextToken());
    	  if(number % 2 != 0) odd[i] = number;
    	  else even[i] = number;
      }
      
      int oddCnt = (T / 2) + (T % 2);
      for (int i : odd) if(i != 0) oddCnt--;
      
      int evenCnt = T / 2;
      for (int i : even) if(i != 0) evenCnt--;

      if(oddCnt == 0 && evenCnt == 0) System.out.println(1);
      else System.out.println(0);
   }
}
