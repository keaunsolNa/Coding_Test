import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      
      int T = Integer.parseInt(br.readLine());
      
      while(T --> 0) {
    	  StringBuilder sb = new StringBuilder();
    	  st = new StringTokenizer(br.readLine()," ");
    	  int N = Integer.parseInt(st.nextToken());
    	  int M = Integer.parseInt(st.nextToken());
    	  
    	  for(int i = N; i <= M; i++) sb.append(i);
    	  
    	  System.out.println(countChar(sb.toString(), '0'));
      }
	   
   }

   public static long countChar(String str, char ch) {
       return str.chars()
               .filter(c -> c == ch)
               .count();
   }
}
