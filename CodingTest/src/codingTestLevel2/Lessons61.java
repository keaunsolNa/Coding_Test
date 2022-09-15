package codingTestLevel2;

public class Lessons61 {
	public static void main(String[] args) {

		Lessons61 lessons61 = new Lessons61();
		int[] answer = lessons61.solution(5);
		for (int i : answer) {
			System.out.println(i);
		}
		
	}
	
	public int[] solution(int n) {
		
//		삼각 달팽이
//		정수 n이 매개변수로 주어집니다. 
//		다음 그림과 같이 밑변의 길이와 높이가 n인 삼각형에서 맨 위 꼭짓점부터 반시계 방향으로 달팽이 채우기를 진행한 후, 
//		첫 행부터 마지막 행까지 모두 순서대로 합친 새로운 배열을 return 하도록 solution 함수를 완성해주세요.
				
				
		int[] answer = new int[n*(n+1) / 2];
        int[][] road = new int[n][n];
        
        int moveDown = -1;
        int moveRight = 0;
        int distance = 1;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(i % 3 == 0){
                    moveDown++;
                } else if(i % 3 == 1){
                    moveRight++;
                } else if(i % 3 == 2){
                    moveDown--;
                    moveRight--;
                }
                road[moveDown][moveRight] = distance++;
            }
        }

        int index = 0; 
        for(int i = 0; i < n; i++){
            for(int j  = 0; j < n; j++){
                if(road[i][j] == 0) break;
                answer[index++] = road[i][j];
            }  
        }
        return answer;
    }
}