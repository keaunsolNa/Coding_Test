import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            char[] N = st.nextToken().toCharArray();

            int o = findMaxDigit(N) < '8' ? Integer.parseInt(String.valueOf(N), 8) : 0;

            System.out.println(K + " " + o + " " + Integer.parseInt(String.valueOf(N)) + " " + Integer.parseInt(String.valueOf(N), 16));
      
		}
	}

	private static char findMaxDigit(char[] arr) {
        char max = '0';
        
        for (char c : arr)
            if (c > max) max = c;
        
        return max;
    }
}
