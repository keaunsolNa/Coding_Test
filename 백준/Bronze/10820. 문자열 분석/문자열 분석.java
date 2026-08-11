import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
		while((input = br.readLine()) != null) {
			StringBuilder sb = new StringBuilder();
			char[] tempChar = input.toCharArray();
			int space = 0;
			int upperCase = 0;
			int lowerCase = 0;
			int number = 0;
			
			for(int i = 0; i < tempChar.length; i++) {
				char temp = tempChar[i];
				if(temp >= '0' && temp <= '9') {
					number++;
				} else if(temp == 32) {
					space++;
				} else if(temp >= 97 && temp <= 122 ) {
					lowerCase++;
				} else if(temp >= 65 && temp <= 90) {
					upperCase++;
				}
			}
			sb.append(lowerCase + " " + upperCase + " " + number + " " + space);
			System.out.println(sb);
		}
	}
}
