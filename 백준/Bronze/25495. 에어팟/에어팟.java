import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int prev = 0;
        int cnt = 1;
        
        st = new StringTokenizer(br.readLine());
        while (n--> 0) {
        	
            int now = Integer.parseInt(st.nextToken());
            
            if (now != prev) {
                cnt = 1;
                prev = now;
            }
            
            cnt *= 2;
            sum += cnt;
         
            if (sum >= 100) {
                sum = 0;
                cnt = 1;
            }
            
        }
        System.out.println(sum);
			
	}
}
