package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lessons54 {

	public static void main(String[] args) {
		
		Lessons54 lessons54 = new Lessons54();
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		
		int result = lessons54.solution(n, lost, reserve);
		
		System.out.println("result : " + result);
		
	}
	
    	
    public int solution(int n, int[] lost, int[] reserve) {
    	
//    	점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 
//    	학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 
//    	예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 
//    	체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
//
//    	전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 
//    	여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
//    	체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
    			
        int answer = 0;
        
        List<Integer> lostArray = new ArrayList<>();
        List<Integer> reserveArray = new ArrayList<>();
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0; i < lost.length; i++) {
        	lostArray.add(lost[i]);
        }
        
        for(int i = 0; i < reserve.length; i++) {
        	reserveArray.add(reserve[i]);
        }
        
        System.out.println("lostArray : " + lostArray);
        System.out.println("reserveArray:  " + reserveArray);
        
        
        for(Iterator<Integer> it=lostArray.iterator(); it.hasNext();){
        	Integer i = it.next();
        	for(Iterator<Integer> it2=reserveArray.iterator(); it2.hasNext();){
        		Integer j = it2.next();
        		if(i == j) {
        			it.remove();
        			it2.remove();
        			break;
        		}
            }
        }
        
        System.out.println("afterDuplicateRemoveLostArray : " + lostArray);
        System.out.println("afterDuplicateRemoveReserveArray: " + reserveArray);
        
        
        for(Iterator<Integer> it=lostArray.iterator(); it.hasNext();){
        	Integer i = it.next();
        	for(Iterator<Integer> it2=reserveArray.iterator(); it2.hasNext();){
        		Integer j = it2.next();
        		if(j == i-1 || j == i+1) {
        			it.remove();
        			it2.remove();
        			break;
        		}
            }
        }
        
        System.out.println("afterRentLostArray : " + lostArray);
        System.out.println("afterRentReserveArray: " + reserveArray);
        
        answer = (n - lostArray.size());
        return answer;
    }
}

    	
