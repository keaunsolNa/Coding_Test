import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		while((input = br.readLine()) != null) {
			int N = Integer.parseInt(input.split(" ")[0]);
			int M = Integer.parseInt(input.split(" ")[1]);
			
			int possible = 0;
			for(int i = N; i <= M; i++) {
				if(dupCheck(i+"")) {
					possible++;
				}
				
			}
			
			System.out.println(possible);
		}
		
	}

	static boolean dupCheck(String word) {
		Set<Character> set = new HashSet<>();
		
		for(int i = 0; i < word.length(); i++) set.add(word.charAt(i));
		
		if(word.length() != set.size()) {
			return false;
		} else {
			return true;
		}
	}
}
