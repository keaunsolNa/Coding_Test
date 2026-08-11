import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		input = input.replaceAll("C", "");
		input = input.replaceAll("A", "");
		input = input.replaceAll("M", "");
		input = input.replaceAll("B", "");
		input = input.replaceAll("R", "");
		input = input.replaceAll("I", "");
		input = input.replaceAll("D", "");
		input = input.replaceAll("G", "");
		input = input.replaceAll("E", "");
		
		System.out.println(input);
	}
}
