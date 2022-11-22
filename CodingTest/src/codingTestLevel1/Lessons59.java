package codingTestLevel1;

public class Lessons59 {

	public static void main(String[] args) {
		
		Lessons59 lessons59 = new Lessons59();
		
		String result = lessons59.solution("5525", "1255");
		
		System.out.println("result : " + result);
	}
	
    	
    public String solution(String X, String Y) {
        
//		숫자 짝꿍
//    	
//    	두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다
//    	(단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다). 
//    	X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.
//
//    	예를 들어, X = 3403이고 Y = 13203이라면, X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 3, 0, 3으로 만들 수 있는 가장 큰 정수인 330입니다. 
//    	다른 예시로 X = 5525이고 Y = 1255이면 X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 2, 5, 5로 만들 수 있는 가장 큰 정수인 552입니다
//    	(X에는 5가 3개, Y에는 5가 2개 나타나므로 남는 5 한 개는 짝 지을 수 없습니다.)
//    	두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍을 return하는 solution 함수를 완성해주세요.

        int[] cntX = new int[10];
        int[] cntY = new int[10];
        
        for (String tmpX : X.split("")) {
        	cntX[Integer.parseInt(tmpX)]++;
        }
        
        for (String tmpY : Y.split("")) {
        	cntY[Integer.parseInt(tmpY)]++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 9; i >= 0; i--){
            while(cntX[i] > 0 && cntY[i] > 0){
                sb.append(i);
                cntX[i]--;
                cntY[i]--;
            }
        }
        
        String answer = "";
        
        if ("".equals(sb.toString())) {
            answer = "-1";
        } else if ("0".equals(sb.toString().substring(0,1))) {
            answer = "0";
        } else {
            answer = sb.toString();
        }

        return answer;
    	
    }
	 
}

    	
