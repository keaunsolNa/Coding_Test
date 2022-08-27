package codingTestLevel2;

import java.util.HashSet;
import java.util.Set;

public class Lessons24 {
	
	public static void main(String[] args) {

		Lessons24 lessons24 = new Lessons24();
		
		int[] nums = {3,3,3,2,2,2};
		int answer = lessons24.solution(nums);

		System.out.println(answer);
		
	}

	public int solution(int[] nums) {
		
//		당신은 폰켓몬을 잡기 위한 오랜 여행 끝에, 홍 박사님의 연구실에 도착했습니다. 
//		홍 박사님은 당신에게 자신의 연구실에 있는 총 N 마리의 폰켓몬 중에서 N/2마리를 가져가도 좋다고 했습니다.
//		홍 박사님 연구실의 폰켓몬은 종류에 따라 번호를 붙여 구분합니다. 
//		따라서 같은 종류의 폰켓몬은 같은 번호를 가지고 있습니다. 
//		예를 들어 연구실에 총 4마리의 폰켓몬이 있고, 각 폰켓몬의 종류 번호가 [3번, 1번, 2번, 3번]이라면 이는 3번 폰켓몬 두 마리, 1번 폰켓몬 한 마리, 2번 폰켓몬 한 마리가 있음을 나타냅니다. 
//		이때, 4마리의 폰켓몬 중 2마리를 고르는 방법은 다음과 같이 6가지가 있습니다.
//
//		첫 번째(3번), 두 번째(1번) 폰켓몬을 선택
//		첫 번째(3번), 세 번째(2번) 폰켓몬을 선택
//		첫 번째(3번), 네 번째(3번) 폰켓몬을 선택
//		두 번째(1번), 세 번째(2번) 폰켓몬을 선택
//		두 번째(1번), 네 번째(3번) 폰켓몬을 선택
//		세 번째(2번), 네 번째(3번) 폰켓몬을 선택
//		
//		이때, 첫 번째(3번) 폰켓몬과 네 번째(3번) 폰켓몬을 선택하는 방법은 한 종류(3번 폰켓몬 두 마리)의 폰켓몬만 가질 수 있지만, 다른 방법들은 모두 두 종류의 폰켓몬을 가질 수 있습니다. 
//		따라서 위 예시에서 가질 수 있는 폰켓몬 종류 수의 최댓값은 2가 됩니다.
//		당신은 최대한 다양한 종류의 폰켓몬을 가지길 원하기 때문에, 최대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택하려 합니다. 
//		N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때, N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아, 그때의 폰켓몬 종류 번호의 개수를 return 하도록 solution 함수를 완성해주세요.
				
				
        int answer = 0;
        int numbers = nums.length;
        int maxchoise = numbers/2;
        
        Set<Integer> varietySet = new HashSet<>();
        
        for (Integer integer : nums) {
			System.out.println(integer);
			varietySet.add(integer);
		}
        
        System.out.println("varietySet : " + varietySet);
        System.out.println("SIZE : " + varietySet.size());
        System.out.println("maxchoise : "+ maxchoise);
        if(maxchoise >= varietySet.size()) {
        	answer = varietySet.size();
        } else {
        	answer = maxchoise;
        }
        return answer;
    }
	
	
}
