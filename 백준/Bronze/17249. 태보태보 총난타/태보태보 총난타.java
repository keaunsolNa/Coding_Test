import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("0");

        long lhs = input[0].chars().filter(n -> n == '@').count();
        long rhs = input[1].chars().filter(n -> n == '@').count();

        System.out.print(lhs + " " + rhs);
		
	}
}
