import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	int n = Integer.parseInt(br.readLine());
        	int total = 0;
        	
            for (int j = 1; j <= n; j++) {
                total += j * (j + 1) * (j + 2) / 2;
            }
            
            System.out.println(total);
        }
	}
}
