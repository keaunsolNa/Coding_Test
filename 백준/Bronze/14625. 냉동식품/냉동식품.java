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
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken())*100 + Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken())*100 + Integer.parseInt(st.nextToken());
        
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        
        while (s <= e) {
            if (chk1(s, n)) cnt++;
            s = chk2(s);
        }
        
        System.out.println(cnt);
	}

    private static boolean chk1(int a, int n) {

    	if (a < 1000 && n == 0) return true;
        
    	while (a!= 0) {
    		
            if (a % 10 == n) return true;
            a/=10;
            
        }
    	
        return false;
    }

    private static int chk2(int a) {

    	if (a % 100 == 59)
            return (a / 100 + 1) * 100;
    	
        return ++a;
    }
}
