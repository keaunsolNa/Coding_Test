package codingTestLevel1;

public class Lessons48 {

	public static void main(String[] args) {
		
		Lessons48 lessons48 = new Lessons48();
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		String result = lessons48.solution(numbers, hand);
		
		System.out.println(result);
		
	}
	
    public String solution(int[] numbers, String hand) {

//    	이 전화 키패드에서 왼손과 오른손의 엄지손가락만을 이용해서 숫자만을 입력하려고 합니다.

// 		맨 처음 왼손 엄지손가락은 * 키패드에 오른손 엄지손가락은 # 키패드 위치에서 시작하며, 엄지손가락을 사용하는 규칙은 다음과 같습니다.
//
//    	엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
//    	왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
//    	오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
//    	가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
//    	4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.
//    	순서대로 누를 번호가 담긴 배열 numbers, 왼손잡이인지 오른손잡이인 지를 나타내는 문자열 hand가 매개변수로 주어질 때, 
//    	각 번호를 누른 엄지손가락이 왼손인 지 오른손인 지를 나타내는 연속된 문자열 형태로 return 하도록 solution 함수를 완성해주세요.
    	
    	int lefthand = 10;
    	int righthand = 12;
    	int leftdist = 0;
    	int rightdist = 0;
    	
    	String answer = "";
    	for(int i = 0; i < numbers.length; i++) {
    		if(numbers[i] == 0) {
    			numbers[i] = 11;
    		}
    		if(numbers[i]%3 == 0) {
    			righthand = numbers[i];
    			answer += "R";
    		} else if(numbers[i]%3 == 1) {
    			lefthand = numbers[i];
    			answer += "L";
    		} else {
    			System.out.println("왼손 위치 : " + lefthand);
    			System.out.println("오른손 위치 : " + righthand);
    			int leftAbs = (numbers[i] > lefthand) ? numbers[i] - lefthand : lefthand - numbers[i];
    			int rightAbs = (numbers[i] > righthand) ? numbers[i] - righthand : righthand - numbers[i];
    			
    			leftdist = (leftAbs/3) + (leftAbs%3);
    			rightdist = (rightAbs/3) + (rightAbs%3);
    			System.out.println("누를 번호 : " + numbers[i]);
    			System.out.println("왼손 거리 : " + leftdist);
    			System.out.println("오른손 거리 : " + rightdist);
    			if(leftdist == rightdist) {
    				if(hand.equals("right")) {
    					righthand = numbers[i];
    					answer += "R";
    					System.out.println("오른쪽");
    				} else {
    					lefthand = numbers[i];
    					answer += "L";
    					System.out.println("왼쪽");
    				}
    			} else if(leftdist < rightdist) {
    				leftdist = numbers[i];
    				answer += "L";
    				System.out.println("왼쪽");
    			} else {
    				righthand = numbers[i];
    				answer += "R";
    				System.out.println("오른쪽");
    			}  
    		}
    		
    	}
        return answer;
    }
}
