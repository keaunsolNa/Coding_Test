import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());

    	long n = Long.parseLong(st.nextToken());
    	long b = Long.parseLong(st.nextToken());
    	
    	long sum = 1;
    	for (int i = 1; i <= b; i++) {
    		
    		sum += (1L << i);
    	}
    	
    	System.out.println(sum >= n ? "yes" : "no");
    	
    }
}
