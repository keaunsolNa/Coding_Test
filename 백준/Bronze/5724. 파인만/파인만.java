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
       int input = 0;
       
       while((input = Integer.parseInt(br.readLine())) != 0) {
    	   int answer = 0;
    	   for(int i = 1; i <= input; i++) {
    		   answer += i*i;
    	   }
    	   
    	   System.out.println(answer);
       }

   }
}
