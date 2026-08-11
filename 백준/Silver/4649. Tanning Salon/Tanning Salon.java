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
		test08();
	}

	public static void test08() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String input = "";
		while(!(input = br.readLine()).equals("0")){
			
			st = new StringTokenizer(input);
			int size = Integer.parseInt(st.nextToken());
			char[] line = st.nextToken().toCharArray();
			
			List<Character> list = new ArrayList<>();
			Set<Character> ans = new HashSet<>();
			for(int i = 0; i < line.length; i++) {
				
				if(!list.contains(line[i]) && list.size() < size) list.add(line[i]);
				else if(list.contains(line[i])) list.remove((Object)line[i]); 
				else if(!list.contains(line[i]) && list.size() >= size) ans.add(line[i]);
				
			}

			if(ans.size() == 0) sb.append("All customers tanned successfully.");
			else sb.append(ans.size() + " customer(s) walked away.");
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
