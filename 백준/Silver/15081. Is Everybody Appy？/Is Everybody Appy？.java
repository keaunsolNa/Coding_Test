import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<String[]> list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int faNumber = Integer.parseInt(st.nextToken());
			String[] app = new String[faNumber];
			for(int j = 0; j < faNumber; j++) {
				app[j] = st.nextToken();
			}
			
			list.add(app);
		}
		StringBuilder sb = new StringBuilder();
		
		String mostApp = list.get(0)[0];
		sb.append(mostApp).append(" ");
		for(int i = 1; i < list.size(); i++) {
			for(int j = 0; j < list.get(i).length; j++) {
				if(!(sb.toString().contains(list.get(i)[j]))) {
					sb.append(list.get(i)[j]).append(" ");
					break;
				}
			}
		}
		System.out.println(sb.deleteCharAt(sb.length()-1));
	}
}
