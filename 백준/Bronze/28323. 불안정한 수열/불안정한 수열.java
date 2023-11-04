import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean prevOddOrEven = Integer.parseInt(st.nextToken()) % 2 == 0 ? true : false;
		int K = 1;
		
		for(int i = 1; i < N; i++) {
    	  
			boolean nowPrevOddOrEven = Integer.parseInt(st.nextToken()) % 2 == 0 ? true : false;
			
			if((prevOddOrEven && !nowPrevOddOrEven) || (!prevOddOrEven && nowPrevOddOrEven)) {
				
				K++;
				prevOddOrEven = nowPrevOddOrEven;
				
			}
		}

		System.out.println(K);
	}
}
