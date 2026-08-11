import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = br.readLine().toUpperCase();
		
		if(answer.contains("D2")) {
			System.out.println("D2");
		} else {
			System.out.println("unrated");
		}
	}
}
