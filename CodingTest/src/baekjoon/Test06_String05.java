package baekjoon;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Test06_String05 {

	public static void main(String[] args) {
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
