import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int length = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		long J = countChar(input, 'J');
		long O = countChar(input, 'O');
		long I = countChar(input, 'I');
		
		for(int i = 0; i < J; i++) sb.append("J");
		for(int i = 0; i < O; i++) sb.append("O");
		for(int i = 0; i < I; i++) sb.append("I");
		
		System.out.println(sb);
	}

	public static long countChar(String str, char ch) {
    
		return str.chars()
				  .filter(c -> c == ch)
				  .count();
	}
}
