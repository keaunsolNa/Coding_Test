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
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		if(input.contains("A")) {
			input = input.replaceAll("[BCDF]", "A");
		} else if(input.contains("B")) {
			input = input.replaceAll("[CDF]", "B");
		} else if(input.contains("C")) {
			input = input.replaceAll("[DF]", "C");
		} else {
			input = input.replaceAll("[A-Z]", "A");
		}
		
		System.out.println(input);
	}
}
