import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		int answer = 1;
		for(int i = 0; i < temp.length()/2; i++) {
			if(!(temp.charAt(i) == temp.charAt(temp.length() - (i+1)))) {
				answer = 0;
				break;
			}
		}
		System.out.println(answer);
	}
}
