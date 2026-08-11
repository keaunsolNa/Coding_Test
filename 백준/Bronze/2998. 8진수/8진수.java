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

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		while(input.length()%3 != 0) {
			input = "0" + input;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < input.length(); i+=3) {
			String text = input.substring(i, i+3);
			switch(text) {
				case "000" : sb.append("0"); break;
				case "001" : sb.append("1"); break;
				case "010" : sb.append("2"); break;
				case "011" : sb.append("3"); break;
				case "100" : sb.append("4"); break;
				case "101" : sb.append("5"); break;
				case "110" : sb.append("6"); break;
				case "111" : sb.append("7"); break;
			}
		}
		
		System.out.println(sb);
		
    }
}
