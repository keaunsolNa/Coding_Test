import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			String[] input = br.readLine().split(" ");
			
			long money = 0;
			for(int i = 0; i < input.length; i++) {
				money += (input[i].equals("Franklin") ? 100 : input[i].equals("Grant") ? 50 : input[i].equals("Jackson") ? 20 : input[i].equals("Hamilton") ? 10 : input[i].equals("Lincoln") ? 5 : 1);
			}
			
			System.out.println("$" + money);
		}
	}
}
