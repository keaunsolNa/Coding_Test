import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String input = "";
		
		while(!(input = br.readLine()).equals("0")) {
			int T = Integer.parseInt(input);
			
			List<String> array = new ArrayList<>();
			
			for(int i = 0; i < T; i++) {
				array.add(br.readLine());
			}
			
			Collections.sort(array, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					return o1.toLowerCase().compareTo(o2.toLowerCase());
				}
			});
			
			System.out.println(array.get(0));
		}
		
		
	}
}
