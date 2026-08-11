import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        char prev = ' ';
        for(int i = 0; i < input.length(); i++) {
        	
        	if(input.charAt(i) != prev) {
        		sb.append(input.charAt(i));
        		prev = input.charAt(i);
        	}
        }
        
        System.out.println(sb);
        
	}
}
