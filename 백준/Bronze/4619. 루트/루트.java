import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       
       int B;
       int N;
       while (true) {
    	   
    	   st = new StringTokenizer(br.readLine());
           B = Integer.parseInt(st.nextToken());
           N = Integer.parseInt(st.nextToken());
           if (B == 0 && N == 0) break;

           int i = 0;
           
           while (Math.pow(i, N) < B) i++;
           
           int i_N = (int) Math.pow(i, N);
           int i_1_N = (int) Math.pow(i - 1, N);
           System.out.println((i_N - B < B - i_1_N) ? i : i - 1);

       }
       
   }
}
