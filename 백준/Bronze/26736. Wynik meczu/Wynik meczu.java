import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int A = 0;
		int B = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'A') A++;
			else B++;
		}
		
		System.out.println(A + " : " + B);
	}
}
