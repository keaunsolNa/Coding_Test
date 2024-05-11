import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder out = new StringBuilder();
    	StringTokenizer st;

    	int n = Integer.parseInt(br.readLine());
    	StringBuilder sb1 = new StringBuilder();
    	StringBuilder sb2 = new StringBuilder();
    	
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) sb1.append(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) sb2.append(st.nextToken());
		
		long a = Long.parseLong(sb1.toString());
		long b = Long.parseLong(sb2.toString());

		System.out.println(Math.min(a, b));

    }
}
