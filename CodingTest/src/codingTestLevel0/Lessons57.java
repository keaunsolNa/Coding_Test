package codingTestLevel0;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Lessons57 {
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 4, 3, 3, 4, 5, 6, 6, 6};
		solution(arr);
	}
	// 최빈값 구하기
    public static int solution(int[] array) {
    	
    	Map<String, Integer> hashMap = new HashMap<>();
    	
    	for(int i = 0; i < array.length; i++) {
    		hashMap.put(array[i] + "", hashMap.getOrDefault(array[i] + "", 0) + 1);
    		
    	}

    	List<Map.Entry<String, Integer>> entryList = new LinkedList<>(hashMap.entrySet());
    	entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
    	    @Override
    	    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
    		return o2.getValue() - o1.getValue();
    	    }
    	});
    	
    	
    	Iterator<Map.Entry<String,Integer>> iter = entryList.iterator();
    	
    	int a = iter.next().getValue();
    	if(!iter.hasNext()) {
    		return a;
    	}
    
    	int b = iter.next().getValue();
    	if(a == b) {
    		return -1;
    	} else {
    		return Integer.parseInt(entryList.get(0).getKey());
    	}
    	
    }
    
    
}