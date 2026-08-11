import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = br.readLine();
		
		if(answer.contains("ss")) {
			System.out.println("hiss");
		} else {
			System.out.println("no hiss");
		}
	}
}
