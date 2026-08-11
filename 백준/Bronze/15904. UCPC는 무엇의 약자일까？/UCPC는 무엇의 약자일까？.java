import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
        char[] ucpc = {'U', 'C', 'P', 'C'};
        int index = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ucpc[index]) {
                index++;
            }

            if(index == 4) {
            	break;
            }
        }
        
        if(index == 4) {
        	System.out.println("I love UCPC"); 
        } else {
        	System.out.println("I hate UCPC");
        }
		
	}
}
