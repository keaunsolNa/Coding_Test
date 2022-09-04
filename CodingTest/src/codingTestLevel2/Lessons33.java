package codingTestLevel2;

import java.util.HashSet;
import java.util.Set;

public class Lessons33 {

	public static void main(String[] args) {

		Lessons33 lessons33 = new Lessons33();
		int answer = lessons33.solution("213");

		System.out.println("Answer : " + answer);
		
	}

    boolean[] visit; 
    char[] arr; 
    Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
    	
//    	한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 
//    	흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
//
//    	각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 
//    	종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
    			
        visit = new boolean[numbers.length()];
        arr = new char[numbers.length()];

        for(int i = 1; i <= numbers.length(); i++) {
           dfs(0, i, numbers);
        }

        return set.size();
    }
    
    public boolean isPrime(int n) {
        if(n == 1 || n == 0) return false;

        for(int i = 2; i < n; i++) {
            if(n%i == 0) return false;
        }

        return true;
    }

    public int charsToInt(char[] arr, int length) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < length; i++) {
            sb.append(arr[i]);
            System.out.println("SB : " + sb);
        }
        
        return Integer.parseInt(sb.toString());
    }

    public void dfs(int level, int length, String numbers) {
        if(level == length) {
            int num = charsToInt(arr, length);
            System.out.println("탐색 노드 : " + num);
            if(isPrime(num)) set.add(num);
        } else {
            for(int i = 0; i < numbers.length(); i++) {
            	System.out.println("dfs node level : " + level);
                if(!visit[i]) {
                    visit[i] = true;
                    arr[level] = numbers.charAt(i);
                    dfs(level+1, length, numbers);
                    visit[i] = false;
                }
            }
        }
    }


}
	