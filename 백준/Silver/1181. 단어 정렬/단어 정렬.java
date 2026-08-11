import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test03();
	}

    public static void test03() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		Set<String> arrSet = new LinkedHashSet<>();
		
		for(int i = 0; i < testCase; i++) {
			arrSet.add(br.readLine());
		}
		
		String[] strArr = new String[arrSet.size()];
		int loop = 0;
		for (Iterator<String> iter = arrSet.iterator(); iter.hasNext();) {
			strArr[loop] = iter.next();
			loop++;
		}

		Arrays.sort(strArr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				
				else {
					return o1.length() - o2.length();
				}
			}
		});
		
	
		for (String string : strArr) {
			System.out.println(string);
		}
    }
}
