import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<String> list = new ArrayList<>();
		String[] strArr = br.readLine().split(" ");
		int[] arr = new int[strArr.length];

		for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(strArr[i]);

		String input = "";

		while ((input = br.readLine()) != null) {
			String book = input;
			if (book == "") break;
			list.add(book);
		}
		
		int x = arr[1] * arr[3] / list.get(0).length();
		int y = arr[0] * arr[2] / list.size();

		for (int i = 0; i < list.size(); i++) { 
			String str = "";
			
			for (int j = 0; j < list.get(0).length(); j++) {
				
				for (int k = 0; k < x; k++)
					str += list.get(i).charAt(j);
			}
			
			for (int k = 0; k < y; k++) {
				System.out.print(str);
				if (k != y || k != 0) 
					System.out.println();
			}
		}
	}
}
