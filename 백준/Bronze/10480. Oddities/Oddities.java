import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        while(N --> 0) {
        	int X = Integer.parseInt(br.readLine());
        	
        	if(X % 2 == 0) sb.append(X + " is even" + "\n");
        	else sb.append(X + " is odd" + "\n");
        }
        
        sb.deleteCharAt(sb.length() -1);
        System.out.print(sb);
        
	}
}
