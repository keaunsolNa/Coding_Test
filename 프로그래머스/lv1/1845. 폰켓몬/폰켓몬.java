import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int numbers = nums.length;
        int maxchoise = numbers/2;
        
        Set<Integer> varietySet = new HashSet<>();
        
        for (Integer integer : nums) {
			varietySet.add(integer);
		}
        
        if(maxchoise >= varietySet.size()) {
        	answer = varietySet.size();
        } else {
        	answer = maxchoise;
        }
        return answer;
    }
}