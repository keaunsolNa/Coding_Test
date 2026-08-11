import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		String input = br.readLine();
		
		System.out.println(binary(input));
	}

	public static String binary(String input) {
        int binary = 10;
        
        if (input.startsWith("0x")) {
            input = input.substring(2);
            binary = 16;
            
        } else if (input.startsWith("0")) {
        	
            input = input.substring(1);
            binary = 8;
            
        }
        return new BigInteger(input, binary).toString();
	}
}
