import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = 0;
		int L = 0;
		for(int i = 0; i < 9; i++) {
			String temp = br.readLine();
			if(temp.equals("Tiger")) {
				T++;
			} else {
				L++;
			}
		}
		
		if(T > L && T >= 5) {
			System.out.println("Tiger");
		} else if(L > T && L >= 5) {
			System.out.println("Lion");
		}
	}
}
