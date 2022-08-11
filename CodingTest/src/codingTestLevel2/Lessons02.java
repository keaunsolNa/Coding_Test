package codingTestLevel2;

import java.util.PriorityQueue;

public class Lessons02 {

	public static void main(String[] args) {

		Lessons02 lessons02 = new Lessons02();
		int[] scovil = {1, 1, 3, 4};
		int k = 5;
		int answer = lessons02.solution(scovil, k);
		
		System.out.println("result : " + answer);
	}

    public int solution(int[] scoville, int K) {
    	
//    	매운 것을 좋아하는 Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶습니다. 
//    	모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞어 새로운 음식을 만듭니다.
//
//    	섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
//    	Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
//    	Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 
//    	모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.

    	PriorityQueue<Integer> scovilleQueueList = new PriorityQueue<>();
    	for (int i : scoville) {
    		scovilleQueueList.add(i);
    	}
    	
    	int minScoville  = 0;
    	int minScoville2  = 0;
    	int minScoville3  = 0;
    	int mixScoville = 0;
    	int cnt = 0;
    	
    	while(minScoville <= K) {
    		if(scovilleQueueList.size() < 2) {
    			return -1;
    		}
    		System.out.println("BEFORE");
    		for (Integer integer : scovilleQueueList) {
    			System.out.println(integer);
			}
    		minScoville = scovilleQueueList.poll(); 
    		minScoville2 = scovilleQueueList.poll(); 
        	mixScoville = minScoville + (minScoville2 *2);
        	scovilleQueueList.add(mixScoville);
        	cnt++;
        	minScoville3 = scovilleQueueList.poll();
        	if(minScoville3 >= K) {
        		return cnt;
        	} else {
        		scovilleQueueList.add(minScoville3);
        	}
	    }
    	return cnt;
    }
    

}
