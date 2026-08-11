import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input = br.readLine();
		List<Character> list = new ArrayList<>();
		
		for(int i = 0; i < input.length(); i++) {
			list.add(input.charAt(i));
		}
		
		int T = Integer.parseInt(br.readLine());

		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			char AC = list.get(A);
			char BC = list.get(B);
			list.set(A, BC);
			list.set(B, AC);
			
		}
		
		for (Character character : list) {
			System.out.print(character);
		}
	}
}
