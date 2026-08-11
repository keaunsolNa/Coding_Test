import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
        Pattern pattern = Pattern.compile("What");
        
        String[] questions = pattern.split(input);
        
        for (String question : questions) {
        	
            if (question.contains("?")) {
            	
                int endIndex = question.indexOf("?");
                String questionText = question.substring(0, endIndex);
                System.out.println("Forty-two" + questionText + ".");
                
            }
        }
	}
}
