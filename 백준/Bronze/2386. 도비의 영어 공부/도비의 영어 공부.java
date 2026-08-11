import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while(!(input = br.readLine()).equals("#")) {
			String[] temp = input.split(" ");
			Character target = temp[0].charAt(0);
			String str = "";
			for(int i = 1; i < temp.length; i++) {
				str += temp[i].toLowerCase();
			}
			int cnt = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == target) {
					cnt++;
				}
			}
			
			System.out.println(target + " " + cnt);
		}
	
	}
}
