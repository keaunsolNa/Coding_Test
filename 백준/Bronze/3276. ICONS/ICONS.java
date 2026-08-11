import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int minSum = Integer.MAX_VALUE;
		int minRow = Integer.MAX_VALUE;
		int minCol = Integer.MAX_VALUE;
		
	    for(int i = 1; i <= N; i++) {
	    	
	        int j = N % i == 0 ? N / i : N / i + 1;
	        
	        if(i + j < minSum) {
	        	
	            minSum = i + j;
	            minRow = i;
	            minCol = j;
	            
	        }
	    }
	    
	    System.out.println(minRow + " " + minCol);
	}
}
