import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		input = input.replaceAll("A", "");
		input = input.replaceAll("J", "");
		input = input.replaceAll("V", "");
		
		if(input.length() == 0) {
			System.out.println("nojava");
		} else {
			System.out.println(input);
		}
		
    }
}
