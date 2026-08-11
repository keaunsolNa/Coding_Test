import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char before = ' ';
        char after = ' ';
        after = str.charAt(str.length() - 1);

        for (int i = N - 1; i >= 0; i--) {
            before = str.charAt(i);
            after = decode(before, after);
        }
        
        System.out.print(after);
	}

    private static char decode(char A, char B) {
    	char result = ' ';
        
    	if (A == 'A') {
    		
            if (B == 'A')  result = 'A';
            else if (B == 'G') result = 'C';
            else if (B == 'C') result = 'A';
            else if (B == 'T') result = 'G';
            
        } else if (A == 'G') {
        	
            if (B == 'A') result = 'C';
            else if (B == 'G')  result = 'G';
            else if (B == 'C') result = 'T';
            else if (B == 'T') result = 'A';
            
        } else if (A == 'C') {
        	
            if (B == 'A') result = 'A';
            else if (B == 'G') result = 'T';
            else if (B == 'C') result = 'C';
            else if (B == 'T') result = 'G';
            
        } else if (A == 'T') {
        	
            if (B == 'A') result = 'G';
            else if (B == 'G') result = 'A';
            else if (B == 'C') result = 'G';
            else if (B == 'T') result = 'T';
            
        }
    	
        return result;
    }
}
