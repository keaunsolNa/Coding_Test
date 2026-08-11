import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       
       int A = Integer.parseInt(st.nextToken());
       int B = Integer.parseInt(st.nextToken());
       int cnt = 0;
       while(true) {
    	   A = A-2;
    	   B--;
    	   if(A < 0 || B < 0) {
    		   break;
    	   }
    	   cnt++;
       }
       
       System.out.println(cnt);
   }
}
