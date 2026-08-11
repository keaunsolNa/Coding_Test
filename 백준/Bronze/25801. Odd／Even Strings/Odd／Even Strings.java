import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		Map<String, Integer> strMap = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) {
			strMap.put(str.charAt(i)+"", strMap.getOrDefault(str.charAt(i)+"", 0) + 1);
		}
		
		Iterator<Integer> iter = strMap.values().iterator();
		int oddOrEven = -1;
		while(iter.hasNext()) {
			if(iter.next() % 2 == 0) {
				if(oddOrEven == -1) {
					oddOrEven = 2;
				} else if(oddOrEven == 3) {
					oddOrEven = 0;
				}
			} else {
				if(oddOrEven == -1) {
					oddOrEven = 3;
				} else if(oddOrEven == 2) {
					oddOrEven = 0;
				}
			}
		}
		
		if(oddOrEven == 2) {
			System.out.println(0);
		} else if(oddOrEven == 3) {
			System.out.println(1);
		} else {
			System.out.println("0/1");
		}
	}
}
