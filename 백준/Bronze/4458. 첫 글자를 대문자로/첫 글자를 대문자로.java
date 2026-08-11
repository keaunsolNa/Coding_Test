import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			String temp = br.readLine();
			if((int)temp.charAt(0) > 90) {
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < temp.length(); j++) {
					if(j == 0) {
						int a = ((int)temp.charAt(0))-32;
						sb.append((char)a);
					} else {
						sb.append(temp.charAt(j));
					}
				}
				temp = sb.toString();
			}
			System.out.println(temp);
		}
	}
}
