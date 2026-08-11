import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] charArr = str.toCharArray();
		int len = str.length();
		
		int[] a = new int[len];
		int[] b = new int[len];
		for(int i = 0; i < len - 1; i++) {
			int j = len - 1 - i;
			
			if(i == 0) {
				a[i] = (int)(charArr[i] - '0');
				b[j] = (int)(charArr[j] - '0');
				continue;
			}
			
			a[i] = a[i - 1] * (int)(charArr[i] - '0');
			b[j] = b[j + 1] * (int)(charArr[j] - '0');
		}
		
		boolean chk = false;
		for(int i = 0; i < len - 1; i++) {
			if(a[i] == b[i + 1]) {
				chk = true;
				break;
			}
		}
		
		String result = chk ? "YES" : "NO";
		System.out.print(result);
	}
}
