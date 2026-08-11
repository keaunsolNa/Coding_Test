import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        int c = 0;
        
        for (int i = 0; i < input.length(); i++) {
            while (Character.isUpperCase(input.charAt(i)) && (i + c) % 4 != 0) {
                c++;
            }
        }
        
        System.out.println(c);
	}
}
