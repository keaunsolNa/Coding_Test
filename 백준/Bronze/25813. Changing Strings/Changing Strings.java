import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		int indexU = 0;
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == 'U') {
				sb.append("U");
				indexU = i;
				break;
			} else {
				sb.append("-");
			}
		}
		
		int indexF = 0;
		for(int i = str.length() - 1; i > 0; i--) {
			
			if(str.charAt(i) == 'F') {
				indexF = i;
				break;
			} else {
				sb.append("-");
			}
		}
		
		for(int i = indexU; i < indexF-1; i++) {
			sb.insert(i+1, "C");
		}
		
		sb.insert(indexF, "F");
		System.out.println(sb);
	}
}
