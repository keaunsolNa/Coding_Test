import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       StringTokenizer st = new StringTokenizer(br.readLine());
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       
       while(N --> 0) {
    	   int temp = Integer.parseInt(st.nextToken());
    	   
    	   if(temp > max) max = temp;
    	   if(temp < min) min = temp;
       }
       
       System.out.println(max - min);

   }
}
