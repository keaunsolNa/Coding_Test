import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       
       int x1 = Integer.parseInt(st.nextToken());
       int y1 = Integer.parseInt(st.nextToken());
       int r1 = Integer.parseInt(st.nextToken());
    		   
       st = new StringTokenizer(br.readLine(), " ");
       
       int x2 = Integer.parseInt(st.nextToken());
       int y2 = Integer.parseInt(st.nextToken());
       int r2 = Integer.parseInt(st.nextToken());
       
       if (1l * (x1 - x2) * (x1 - x2) +1l *(y1 - y2) * (y1 - y2) < 
    		   1l * (r1 + r2) * (r1 + r2)) System.out.println("YES");
       else System.out.println("NO");
   }
}
