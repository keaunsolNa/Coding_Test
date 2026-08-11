import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		test05();
	}

	public static void test05() {
		Scanner sc = new Scanner(System.in);
		char[] word = sc.nextLine().toUpperCase().toCharArray();
		
		Map<Integer, Integer> wordMap = new HashMap<>();
		for(int i = 65; i <= 90; i++) {
			wordMap.put(i, 0);
		}

		for(int i = 0; i < word.length; i++){
			wordMap.put((int)word[i], wordMap.get((int)word[i]) + 1);
		}
		 
		int max = 0;
		int equlas = 0;
		for(Iterator<Integer> iter=wordMap.values().iterator(); iter.hasNext();) {
			int temp = iter.next();
			if(max < temp) {
				max = temp;
				equlas = 0;
			} else if(max == temp) {
				equlas++;
			}
		}
		
		if(equlas != 0) {
			System.out.println('?');
		} else {
			for(Map.Entry<Integer, Integer> entry : wordMap.entrySet()){
			    if(entry.getValue().equals(max)) { 
			    	System.out.println((char)(int)entry.getKey());
			    }
			}
		}
	}
}
