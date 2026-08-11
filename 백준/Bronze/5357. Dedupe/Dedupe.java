import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			String input = br.readLine();
			StringBuilder sb = new StringBuilder();
			List<Character> list = new ArrayList<>();
			list.add(input.charAt(0));
			for(int i = 1; i < input.length(); i++) {
				if(input.charAt(i) != list.get(list.size()-1)) {
					list.add(input.charAt(i));
				}
			}
			
			for (Character character : list) System.out.print(character);
			
			System.out.println();
		}
	}
}
