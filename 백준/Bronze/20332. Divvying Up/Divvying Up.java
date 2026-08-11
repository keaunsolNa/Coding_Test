import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       
       int sum = 0;
       while(T --> 0) sum += Integer.parseInt(st.nextToken());
       
       if(sum % 3 == 0) System.out.println("yes");
       else  System.out.println("no");
   }
}
