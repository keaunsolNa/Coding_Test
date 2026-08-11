import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder NBinary = new StringBuilder(Integer.toBinaryString(Integer.parseInt(br.readLine())));
		NBinary.reverse();
		System.out.println(Integer.parseInt(NBinary.toString(), 2));
	}
}
