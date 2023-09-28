import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
		
       int A = Integer.parseInt(st.nextToken());
       int B = Integer.parseInt(st.nextToken());
       
       while (A >= 2) {
           if (B >= A - 1) {
               System.out.println(2 * A - 1);
               break;
           } else {
               A -= 1;
           }
       }


    }

}
