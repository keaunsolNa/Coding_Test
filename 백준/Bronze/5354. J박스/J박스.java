import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			
            for (int j = 0; j < n; j++) {
            	
                for (int k = 0; k < n; k++) {
                	
                    if (j == 0 || j == n - 1 || k == 0 || k == n - 1) {
                        System.out.print("#");
                    } else {
                        System.out.print("J");
                    }
                }
                System.out.println();
            }
            System.out.println();
		}
		
	}
}
