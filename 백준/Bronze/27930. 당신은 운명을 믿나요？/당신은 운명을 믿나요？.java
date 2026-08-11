import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
        String ans1 = "KOREA";
        String ans2 = "YONSEI";
		int idx1 = 0;
		int idx2 = 0;
		
        for (char ch : input.toCharArray()) {
            if (ch == ans1.charAt(idx1)) ++idx1;
            if (ch == ans2.charAt(idx2)) ++idx2;
           
            if (idx1 == ans1.length()) {
            	
                System.out.print(ans1);
                return;
                
            } else if (idx2 == ans2.length()) {
            	
                System.out.print(ans2);
                return;
                
            }
        }
		
	}
}
