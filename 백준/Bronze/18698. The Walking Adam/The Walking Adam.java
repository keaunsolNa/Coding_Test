import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		int result = 0;

		for (int i = 0; i < testCase; i++){
            String t = br.readLine();
            for (int j = 0; j < t.length(); j++){
                if (t.charAt(j) == 'U'){
                    result++;}
                else
                    break;
            }
            System.out.println(result);
            result = 0;
        }
	}
}
