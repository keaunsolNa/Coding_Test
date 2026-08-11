import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		for(int i = 0; i < text.length(); i++) {
			if(i != 0 && i%10 == 0) {
				System.out.println();
				System.out.print(text.charAt(i));
			} else {
				System.out.print(text.charAt(i));
			}
		}
	}
}
