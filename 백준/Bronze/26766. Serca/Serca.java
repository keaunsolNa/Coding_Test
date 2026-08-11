import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) sb.append(
			  " @@@   @@@  \n"
			+ "@   @ @   @ \n"
			+ "@    @    @ \n"
			+ "@         @ \n"
			+ " @       @  \n"
			+ "  @     @   \n"
			+ "   @   @    \n"
			+ "    @ @     \n"
			+ "     @      \n");
		
		System.out.println(sb);
	}
}
