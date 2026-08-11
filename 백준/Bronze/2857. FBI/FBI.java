import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			String str = br.readLine();
			
			if(str.contains("FBI")) {
				System.out.println((i+1));
				cnt++;
			}
		}
		
		if(cnt == 0) {
			System.out.println("HE GOT AWAY!");
		}
	}
}
