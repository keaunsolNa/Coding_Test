import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
	    int n = Integer.parseInt(st.nextToken());
	    int r = Integer.parseInt(st.nextToken());
	    int s = Integer.parseInt(st.nextToken());
	    
	    for (int i = 0; i < n; i++) {
	      
	    	char[][] matrix = new char[r][s];

	    	for (int j = 0; j < r; j++) matrix[j] = br.readLine().toCharArray();

	    	int min = Integer.MAX_VALUE;
	    	int max = Integer.MIN_VALUE;
	   
	    	for (int j = 0; j < s; j++) {
	        
	    		for (int k = 0; k < r; k++) {
	          
	    			if (matrix[k][j] == '#') {

	    				min = Math.min(min, k);
	    				max = Math.max(max, k);
	    				break;

	    			}

	    		}

	    	}
	      
	    	System.out.println(max - min);

	    }

	}
}
