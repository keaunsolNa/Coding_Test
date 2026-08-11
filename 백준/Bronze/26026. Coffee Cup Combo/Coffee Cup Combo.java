import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String input = br.readLine();
		int total = 0;
		int have = 0;
		for(int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) == '1') {
				total++;
				have = 2;
			} else {
				if(have > 0) {
					total++;
					have--;
				}
			}
			
		}
		
		System.out.println(total);
	}
}
