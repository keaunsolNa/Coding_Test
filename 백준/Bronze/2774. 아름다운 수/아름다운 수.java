import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			Set<Character> set = new HashSet<>();
			String num = br.readLine();
			
			for(int i = 0; i < num.length(); i++) {
				set.add(num.charAt(i));
			}
			
			System.out.println(set.size());
		}
	}
}
