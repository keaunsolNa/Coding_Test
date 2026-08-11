import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int N = Integer.parseInt(br.readLine());
	   
	   int out = 1;
	   int time = 0;
       while (N > 0) {
           if(N < out) out = 1;
           N -= out;
           time++;
           out++;
       }
	   
	   System.out.println(time);
   }
}
