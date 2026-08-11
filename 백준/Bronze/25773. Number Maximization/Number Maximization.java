import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String[] strArr = new String[str.length()];
		for(int i = 0; i < str.length(); i++) {
			strArr[i] = str.charAt(i)+"";
		}
		
		Arrays.sort(strArr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return Integer.parseInt(o2) - Integer.parseInt(o1);
			}
		});

		for (String string : strArr) {
			System.out.print(string);
		}
	}
}
