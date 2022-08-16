package codingTestLevel2;

import java.util.LinkedList;

public class Lessons14 {
	public static void main(String[] args) {

		Lessons14 lessons14 = new Lessons14();
		int[] answer = lessons14.solution(3, 5);

		for (int i : answer) {
			System.out.println(i);
		}
	}

	public int[] solution(int n, long k) {
    	
//    	n명의 사람이 일렬로 줄을 서고 있습니다. n명의 사람들에게는 각각 1번부터 n번까지 번호가 매겨져 있습니다. 
//    	n명이 사람을 줄을 서는 방법은 여러가지 방법이 있습니다. 예를 들어서 3명의 사람이 있다면 다음과 같이 6개의 방법이 있습니다.
//
//    	[1, 2, 3]
//    	[1, 3, 2]
//		[2, 1, 3]	
//		[2, 3, 1]
//		[3, 1, 2]
//		[3, 2, 1]
//		사람의 수 n과, 자연수 k가 주어질 때, 사람을 나열 하는 방법을 사전 순으로 나열 했을 때, k번째 방법을 return하는 solution 함수를 완성해주세요.
    			
		int[] answer = new int[n];
		LinkedList<Integer> arrList = new LinkedList<>();
		long factorial = factorial(n);
		
		for(int i = 1; i <= n; i++) {
			arrList.add(i);
		}
		
		int i = 0;
		long remain = k-1;
		while(i < n) {
			factorial = factorial / (n - i);
			long value = remain / factorial;
			answer[i++] = arrList.get((int)value);
			System.out.println("TEST :" + arrList);
			arrList.remove((int)value);
			remain = remain % factorial;
		}
		
		return answer;
		
    }
	
	public static long factorial(int i) {
		if(i <= 1) {
			return i;
		} else {
			return factorial(i-1)*i;
		}
	}
}
