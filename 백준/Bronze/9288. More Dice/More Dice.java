import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= T; i++) {
        	
            int cur = Integer.parseInt(br.readLine());
            sb.append(String.format("Case %d:\n", i));
            
            for (int a = 1; a <= 6; a++) {
            	
                for (int b = a; b <= 6; b++) {
                	
                    if (a+b == cur) {
                        sb.append(String.format("(%d,%d)\n", a, b));
                    }
                }
            }
        }
        System.out.println(sb);
        
	}
}
