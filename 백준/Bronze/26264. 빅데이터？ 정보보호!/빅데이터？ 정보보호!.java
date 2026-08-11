import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		input = input.replaceAll("bigdata", "A");
		input = input.replaceAll("security", "B");
		
		int big = 0;
		int sec = 0;
		for(int i = 0; i < N; i++) {
			if(input.charAt(i) == 'A') {
				big++;
			} else {
				sec++;
			}
		}
		
		if(big > sec) {
			System.out.println("bigdata?");
		} else if(big < sec) {
			System.out.println("security!");
		} else {
			System.out.println("bigdata? security!");
		}
	}
}
