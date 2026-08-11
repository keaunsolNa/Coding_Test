import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		int answer = 0;
		for(int i = 0; i < testCase; i++) {
			String str = br.readLine();
			
			if(str.equals("anj")) {
				answer = 1;
				break;
			}
		}

		if(answer == 0) {
			System.out.println("뭐야?");
		} else {
			System.out.println("뭐야;");
		}
	}
}
