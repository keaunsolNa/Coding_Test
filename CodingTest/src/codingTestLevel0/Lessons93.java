package codingTestLevel0;

import java.util.Arrays;
import java.util.Comparator;

public class Lessons93 {

	public static void main(String[] args) {
		int[] numlist = {10000,20,36,47,40,6,10,7000};
		int[] a = solution(numlist, 30);
		for (int i : a) {
			System.out.println(i);
		}
		
	}
	
	// 특이한 정렬
    public static int[] solution(int[] numlist, int n) {

        Integer[] newSortArray = new Integer[numlist.length];

    	for(int i = 0; i < numlist.length; i++) {
    		newSortArray[i] = numlist[i];
    	}
    	
    	Arrays.sort(newSortArray, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
                
                if(Math.abs(n-o2) == Math.abs(n-o1)){
                    return o1 - o2;
                } else {
    				return Math.abs(n-o2) - Math.abs(n-o1);                    
                }
			}
		});

    	int[] answer = new int[newSortArray.length];
    	for(int i = 0; i < newSortArray.length; i++) {
    		answer[i] = newSortArray[newSortArray.length - (i+1)];
    	}
    	
        return answer;
    }
}