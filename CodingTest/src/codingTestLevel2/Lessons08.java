package codingTestLevel2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Lessons08 {
	
	public static void main(String[] args) {

		Lessons08 lessons08 = new Lessons08();
		int[] A = {1, 2};
		int[] B = {3, 4};
		
		int answer = lessons08.solution(A, B);
		
		System.out.println("result : " + answer);
	}

    public int solution(int[] A, int[] B){
    	
//    	길이가 같은 배열 A, B 두개가 있습니다. 각 배열은 자연수로 이루어져 있습니다.
//    	배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱합니다. 이러한 과정을 배열의 길이만큼 반복하며, 
//    	두 수를 곱한 값을 누적하여 더합니다. 이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다. (단, 각 배열에서 k번째 숫자를 뽑았다면 다음에 k번째 숫자는 다시 뽑을 수 없습니다.)
//
//    	예를 들어 A = [1, 4, 2] , B = [5, 4, 4] 라면
//
//    	A에서 첫번째 숫자인 1, B에서 첫번째 숫자인 5를 뽑아 곱하여 더합니다. (누적된 값 : 0 + 5(1x5) = 5)
//    	A에서 두번째 숫자인 4, B에서 세번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 5 + 16(4x4) = 21)
//    	A에서 세번째 숫자인 2, B에서 두번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 21 + 8(2x4) = 29)
//    	즉, 이 경우가 최소가 되므로 29를 return 합니다.
//
//    	배열 A, B가 주어질 때 최종적으로 누적된 최솟값을 return 하는 solution 함수를 완성해 주세요.
    			
        int answer = 0;

        Queue<Integer> aArray = new LinkedList<>();
        Queue<Integer> bArray = new LinkedList<>();
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i < B.length / 2; i++) {
            int temp = B[i];
            B[i] = B[B.length - i - 1];
            B[B.length - i - 1] = temp;
        }
        
        
        for(int i = 0; i < A.length; i++) {
        	aArray.add(A[i]);
        }
        
        for(int i = 0; i < B.length; i++) {
        	bArray.add(B[i]);
        }
        
        System.out.println(aArray);
        System.out.println(bArray);
        
        System.out.println("size : " + aArray.size());
        int cnt = 0;
        
        while(aArray.size() != 0) {
        	System.out.println("infor aArraySize" + aArray.size());
        	answer += (aArray.poll() * bArray.poll());
        	System.out.println(answer);
        }
        
        return answer;
    }

}
