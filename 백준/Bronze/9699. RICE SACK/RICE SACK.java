import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for(int i = 0; i < T; i++) {
        	st = new StringTokenizer(br.readLine(), " ");
        	int max = 0;
        	for(int j = 0; j < 5; j++) {
        		int temp = Integer.parseInt(st.nextToken());
        		if(temp > max) max = temp;
        	}
        	
        	System.out.println("Case #" + (i+1) + ": " + max);
        }
        
	}
}
