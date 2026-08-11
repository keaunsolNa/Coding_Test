import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		String binary = new StringBuilder(Integer.toBinaryString(N)).reverse().toString();

		for(int i = 0; i < binary.length(); i++) {
			
			if(binary.charAt(i) == '1') sb.append(i + " ");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
	}
}
