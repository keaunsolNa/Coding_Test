import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int x = Integer.parseInt(st.nextToken());
       int k = Integer.parseInt(st.nextToken());
       int a = Integer.parseInt(st.nextToken());
       
       int ans = -1;
       while(x >= 0) {
    	   
    	   x -= k;
    	   if(x < 0) {
    		   ans = 1; 
    		   break;
    	   }
    	   x -= a;
    	   if(x < 0) {
    		   ans = 0; 
    		   break;
    	   }
       }
       
       System.out.println(ans);
   }
}
