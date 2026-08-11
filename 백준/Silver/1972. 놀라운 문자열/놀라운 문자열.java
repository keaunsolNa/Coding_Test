import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			String input = br.readLine();
			String answer = " is surprising.";
			if(input.equals("*")) break;
			
			for(int i = 0; i < input.length()-1; i++) {

				List<String> list = new ArrayList<String>();
                HashSet<String> set = new HashSet<String>();
                
                for(int j = 0; j < input.length() - i - 1; j++) {
                	
                    String pair_string = "" + input.charAt(j) + input.charAt(j+i+1);
                    list.add(pair_string);
                    set.add(pair_string);
                }
		
                if(list.size() != set.size()) {
                	answer = " is NOT surprising.";
                	break;
                }
            }
			
			System.out.println(input + answer);
		}
		
	}
}
