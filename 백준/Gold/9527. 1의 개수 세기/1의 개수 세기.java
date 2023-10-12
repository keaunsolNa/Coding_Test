import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        System.out.println(solove(B) - solove(A - 1));
   }
    
    public static long solove(long number) {
            
    	if (number == 0 || number == 1) return number;
        
        int digitC = 0;
        long p2 = 1;
        
        while (p2 * 2 <= number) {
        	
        	p2 *= 2;
        	digitC++;
        	
        }
        
        return digitC * p2 / 2 + (number - p2 + 1) + solove(number - p2);
        
    }
}