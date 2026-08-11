import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String input = "";
		List<Long> list = new ArrayList<>();
		while((input = br.readLine()) != null) {
			
			st = new StringTokenizer(input);
			
			while(st.hasMoreTokens()) {
				
				StringBuilder temp = new StringBuilder(st.nextToken()).reverse();
				long value = Long.parseLong(temp.toString());
				list.add(value);
			}
		}
		
		list.remove(0);
		Collections.sort(list);
		
		for (Long long1 : list) {
			System.out.println(long1);
		}
	}
}
