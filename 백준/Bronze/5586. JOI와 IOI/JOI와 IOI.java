import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        int cnt1 = 0;
        int cnt2 = 0;
        
        for(int i = 0; i < input.length() - 2; i++) {
            switch(input.charAt(i)) {
                case 'J':
                if(input.charAt(i + 1) == 'O' && input.charAt(i + 2) == 'I') {
                    cnt1++;
                    break;
                }
                case 'I':
                    if(input.charAt(i + 1) == 'O' && input.charAt(i + 2) == 'I') {
                        cnt2++;
                    }            
            }
        }
        
        System.out.println(cnt1);
        System.out.println(cnt2);
	}
}
