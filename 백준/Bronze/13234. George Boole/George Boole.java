import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		String[] input = br.readLine().split(" ");
		
		boolean answer = true;
		switch(input[1]) {
		
			case "AND" :  answer = input[0].equals("true") ? input[2].equals("true") ? true : false : false; break;
			case "OR" :  answer = input[0].equals("true") ? true : input[2].equals("true") ? true : false; break;
		}
		
		System.out.println(answer);
	}
}
