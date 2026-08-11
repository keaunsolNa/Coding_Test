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
       String[] button = br.readLine().split(" ");
       
       int ans = 5000;
       for(int i = 0; i < button.length; i++) {
    	   
    	   switch(button[i]) {
    	   
    	   		case "1" : ans -= 500; break;
    	   		case "2" : ans -= 800; break;
    	   		case "3" : ans -= 1000; break;
    	   	
    	   }
       }
       System.out.println(ans);
   }
}
