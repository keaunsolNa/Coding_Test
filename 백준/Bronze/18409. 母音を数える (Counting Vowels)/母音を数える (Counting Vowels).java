import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int answer = 0;
		for(int i = 0; i < str.length(); i++) {
			
			switch(str.charAt(i)) {
				case 'a' : answer++; break;
				case 'i' : answer++; break;
				case 'u' : answer++; break;
				case 'e' : answer++; break;
				case 'o' : answer++; break;
			}
		}
		
		System.out.println(answer);
	}
}
