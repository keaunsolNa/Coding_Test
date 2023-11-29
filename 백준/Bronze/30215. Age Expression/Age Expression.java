import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int O = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        for(int a = 1; a < 150; a++) {
        	
        	for(int k = 1; k < 150; k++) {
        		
        		if((a * A) + (k * K) == O) {
        			System.out.println(1);
        			return;
        		}
        	}
        }
        
        System.out.println(0);
   }
}