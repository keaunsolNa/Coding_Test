package codingTest;

public class Lessons29 {

	public static void main(String[] args) {

		Lessons29 lessons29 = new Lessons29();
		int[] nums = {1,2,7,6,4};
		int answer = lessons29.solution(nums);
		
		System.out.println("Result : " + answer);
	}

	public int solution(int[] nums) {
		 
//		 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 
//		 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, 
//		 nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
		
		int count = 0;
		int num = 0;
		int sum = 0;

		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				for(int k = j+1; k < nums.length; k++) {
					
					sum = nums[i] + nums[j] + nums[k];
					for(int q = 2; q < sum; q++) {
						if(sum%q == 0) {
							num = 0;
							break;
						} else {
							num = 1;
							continue;
						}
					}
					if(num == 1) {
						count++;
					}
				}
			}
		}
		
		return count;
	}
    

}