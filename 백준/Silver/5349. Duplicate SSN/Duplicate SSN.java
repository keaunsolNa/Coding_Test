import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = "";
		List<String> list = new ArrayList<>();
		Set<String> answer = new TreeSet<>();
		
		while((input = br.readLine()) != null) {
			
			if(list.contains(input)) answer.add(input);
			else list.add(input);
			
			if(input.equals("END")) break;
		}

		Iterator<String> iter = answer.iterator();
		
		while(iter.hasNext()) System.out.println(iter.next());
	}
}
