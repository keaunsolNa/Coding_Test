import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
        Scanner scanner = new Scanner(System.in);

        List<Character> list = new ArrayList<>(Arrays.asList('1', '0', '0')); 

        String str = scanner.next(); 

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                Collections.swap(list, 0, 1);
            } else if (str.charAt(i) == 'B') {
                Collections.swap(list, 1, 2);
            } else {
                Collections.swap(list, 0, 2);
            }
        }
        System.out.println(list.indexOf('1') + 1); 
	}
}
