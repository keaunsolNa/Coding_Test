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
		int testCase = Integer.parseInt(br.readLine());

		List<Character> alpList = new ArrayList<>();
		for(int i = 65; i <= 90; i++) {
			alpList.add((char)i);
		}

		for(int i = 0; i < testCase; i++) {
			String S = br.readLine();
			List<Character> alpList2 = new ArrayList<>();
			
			for(int j = 0; j < S.length(); j++) {
				alpList2.add(S.charAt(j));
			}

			int sum = 0;
			for(int k = 0; k < alpList.size(); k++) {
				if(!alpList2.contains(alpList.get(k))) {
					sum += alpList.get(k);
				}
			}
			System.out.println(sum);
		}
	}
}
