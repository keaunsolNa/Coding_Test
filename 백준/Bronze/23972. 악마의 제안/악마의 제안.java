import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");

       long K = Long.parseLong(st.nextToken());
       long N = Long.parseLong(st.nextToken());
       
       long result = -1L;
       
       if(N != 1L) {
    	   result = (K * N) / (N - 1L);
    	   
    	   if((K * N) % (N - 1L) != 0L) result += 1L;
       }
       
       System.out.println(result);
   }
}
