import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
	
		if(n >= 0 && n <= 10) System.out.println(1);
	    
		else {

			int k = 2;
	        
			for(int i = 11; ; i = i * 10 + 1) {
	        
				if(n >= i && n <= i * 10) {
					System.out.println(k);
					break;
				}
				
				k++;
	            
			}
		}
	
	}
}
