package codingTestLevel0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lessons78 {

	public static void main(String[] args) {
		solution(17);
	}
	// 소인수분해
    public static int[] solution(int n) {
    	
    	Set<Integer> hashSet = new HashSet<>();
    	for(int i = 2; i <= n; i++) {
    		if(n%i == 0) {
    			n = n/i;
    			hashSet.add(i);
    			i = 1;
    		}
    	}
    	
    	System.out.println(hashSet);
    	
    	Iterator<Integer> iter = hashSet.iterator();
    	
    	int[] answer = new int[hashSet.size()];
    	int cnt = 0;
    	while(iter.hasNext()) {
    		answer[cnt] = iter.next();
    		cnt++;
    	}
    	
    	Arrays.sort(answer);
        return answer;
    }
    
}