import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    private static String S;
    private static String T;
    private static int legnth;

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		S = br.readLine();
		T = br.readLine();
		legnth = S.length();

		System.out.println(solve(T) ? 1 : 0);
	}

    private static boolean solve(String str) {
    	
    	if(str.length() == legnth) {
            if(str.equals(S)) return true;
            return false;
        }

        if(str.charAt(str.length() -1) == 'A') 
            if(solve(str.substring(0, str.length() -1))) return true;

        if(str.charAt(0) == 'B') {        
        	
            StringBuilder reverse = new StringBuilder();
            reverse.append(str.substring(1, str.length()));
            if(solve(reverse.reverse().toString())) return true;
            
        }
        
        return false;
    }
}
