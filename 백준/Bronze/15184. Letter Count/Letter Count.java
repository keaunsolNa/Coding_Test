import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine().toUpperCase();
        
        for(int i = 65; i <= 90; i++) {
        	sb.append((char)i).append(" | ");
        	
        	long len = countChar(input, (char)i);
        	
        	for(int j = 0; j < len; j++) sb.append("*");
        	
        	sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}

	public static long countChar(String str, char ch) {
		return str.chars()
				  .filter(c -> c == ch)
				  .count();
	}
}
