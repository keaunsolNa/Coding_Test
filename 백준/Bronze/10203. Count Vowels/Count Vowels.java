import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        while(T --> 0) {

        	String text = br.readLine();
        	sb.append("The number of vowels in " + text + " is ");
        	long count = 0;
        	count += countChar(text, 'a');
        	count += countChar(text, 'e');
        	count += countChar(text, 'i');
        	count += countChar(text, 'o');
        	count += countChar(text, 'u');
        	
        	sb.append(count + "." + "\n");
        	
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
