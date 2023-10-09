import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String input = br.readLine();
		double total = 0;
		double point = 0;
        for(int i = 0; i < input.length(); i++) {
        	
        	switch (input.charAt(i)) {
        	
				case 'A' : total += 4.0; break;
				case 'B' : total += 3.0; break;
				case 'C' : total += 2.0; break;
				case 'D' : total += 1.0; break;
				case 'F' : total += 0.0; break;
				case '+' : total += 0.5;  point--; break;
					
        	}
        	
        	point++;
        }
        
        System.out.println(total / point);
   }
}