import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		int sumLeft = 0;
		for(int i = 0; i < N.length()/2; i++) {
			sumLeft += Integer.parseInt(N.charAt(i)+"");
		}
		
		int sumRight = 0;
		for(int i = N.length()/2; i < N.length(); i++) {
			sumRight += Integer.parseInt(N.charAt(i)+"");
		}

		if(sumLeft == sumRight) {
			System.out.println("LUCKY");
		} else {
			System.out.println("READY");
		}
	}
}
