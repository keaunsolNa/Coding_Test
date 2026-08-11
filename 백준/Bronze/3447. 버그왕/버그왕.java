import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        
        while((input = br.readLine()) != null) {
        	while(input.contains("BUG")) {
        		input = input.replaceAll("BUG", "");
        	}
        	
        	sb.append(input).append("\n");
        }
        
        sb.deleteCharAt(sb.length()-1);
        System.out.print(sb);
	}
}
