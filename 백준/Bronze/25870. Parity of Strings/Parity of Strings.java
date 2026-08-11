import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < input.length(); i++) set.add(input.charAt(i));
		
		Set<Integer> evenOrOdd = new HashSet<>();
		for (Character character : set) {
		
			long sum = countChar(input, character);
			
			if(sum % 2 != 0) {
				evenOrOdd.add(1);
			} else if(sum % 2 == 0) {
				evenOrOdd.add(0);
			}
		}
		
		if(evenOrOdd.size() > 1) System.out.println("2");
		else System.out.println(evenOrOdd.toArray()[0]);
	}

	public static long countChar(String str, char ch) {
    
		return str.chars()
				.filter(c -> c == ch)
				.count();
	}
}
