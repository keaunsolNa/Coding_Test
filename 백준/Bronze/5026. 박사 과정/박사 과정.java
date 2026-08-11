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
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			String str = br.readLine();
			
			if(str.equals("P=NP")) {
				System.out.println("skipped");
			} else {
				String[] temp = str.split("[+]");
				System.out.println(Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]));
			}
		}
	}
}
