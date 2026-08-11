import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		String[] strArr = new String[3];
		List<String> list = new ArrayList<>();
		for(int i = 1; i < input.length(); i++) {
			
			for(int j = i + 1; j < input.length(); j++) {
				
				strArr[0] = input.substring(0, i);
				strArr[1] = input.substring(i, j);
				strArr[2] = input.substring(j, input.length());
				
				StringBuilder sb = new StringBuilder();
				
				for(int k = 0; k < 3; k++) {
					for(int q = strArr[k].length() - 1; q >= 0; q--) {
						sb.append(Character.toString(strArr[k].charAt(q)));
					}
				}
				
				list.add(sb.toString());
				
				sb.setLength(0);
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0));
	}
}
