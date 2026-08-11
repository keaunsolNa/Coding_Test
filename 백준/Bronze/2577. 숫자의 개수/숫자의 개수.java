import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ABC = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine()) + "";
		
		for(int i = 0; i <= 9; i++) {
			int cnt = 0;
			for(int j = 0; j < ABC.length(); j++) {
				
				if(i == Character.getNumericValue(ABC.charAt(j))) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
