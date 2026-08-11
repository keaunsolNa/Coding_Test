import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		Map<Character, Integer> map = new HashMap<>();
		
		while(!(input = br.readLine()).equals("#")) {
			input = input.toLowerCase();
			
			for(int i = 97; i < 123; i++) {
				map.put((char)i, 0);
			}
			
			for(int i = 0; i < input.length(); i++) {
				if(map.containsKey(input.charAt(i))) {
					map.put(input.charAt(i), 1);
				}
			}

			int cnt = 0;
			for(int i = 97; i < 123; i++) {
				
				if(map.get((char)i) == 1) {
					cnt++;
				}
			}
			map.clear();
			
			System.out.println(cnt);
		}
		
	}
}
