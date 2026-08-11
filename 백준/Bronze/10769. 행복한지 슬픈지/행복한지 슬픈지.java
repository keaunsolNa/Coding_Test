import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] happy = input.split(":-\\)");
		String[] unHappy = input.split(":-\\(");
		
		if(happy.length == 1 && unHappy.length == 1) {
			System.out.println("none");
		} else if(happy.length > unHappy.length) {
			System.out.println("happy");
		} else if(happy.length < unHappy.length) {
			System.out.println("sad");
		} else if(happy.length == unHappy.length) {
			System.out.println("unsure");
		}
		
	}
}
