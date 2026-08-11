import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String AB = br.readLine();
		
		if(AB.length() == 2) {
			System.out.println(Integer.parseInt(AB.charAt(0)+"") + Integer.parseInt(AB.charAt(1)+""));
		} else if(AB.length() == 4){
			System.out.println(20);
		} else {
			if(AB.charAt(1) == '0') {
				System.out.println(Integer.parseInt(AB.charAt(0)+"0") + Integer.parseInt(AB.charAt(2)+""));
			} else if(AB.charAt(2) == '0') {
				System.out.println(Integer.parseInt(AB.charAt(0)+"") + Integer.parseInt(AB.charAt(1)+"0"));
			}
		}
	}
}
