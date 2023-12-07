import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {

			int N = Integer.parseInt(br.readLine());
			int count = 0;
			
	    	while(N >= 5) {
	    		
	    		count += N / 5;
	    		N /= 5;
	    	}
	    	
	    	System.out.println(count);
	    	
		}
	}
}
