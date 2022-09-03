package codingTestLevel2;

public class Lessons36 {

	public static void main(String[] args) {

		Lessons36 lessons36 = new Lessons36();
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		int answer = lessons36.solution(board);

		System.out.println("ANSER : " + answer);
		
	}
  

	
	public int solution(int [][]board){
		
//		1와 0로 채워진 표(board)가 있습니다. 
//		표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다. 
//		표에서 1로 이루어진 가장 큰 정사각형을 찾아 넓이를 return 하는 solution 함수를 완성해 주세요. 
//		(단, 정사각형이란 축에 평행한 정사각형을 말합니다.)
				
		/** DP로 풀이한다. 현재 위치를 기준으로, 왼쪽(i, j-1), 상단(i - 1, j), 11시 방향(i - 1, j - 1)의 배열값 중, 
		 * 최솟값 +1 의 값으로 갱신하면서 진행한다. */
		
		int[][] map = new int[board.length + 1][board[0].length + 1];	
		int answer = 0;
		
		/* 값 초기화 */
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				map[i + 1][j + 1] = board[i][j];
			}
		}
		
		/* 탐색문 시작 */
		for(int i = 1; i <= board.length; i++) {
			for(int j = 1; j <= board[0].length; j++) {
				/* i,j가 0이 아닐때, -> 외곽은 정사각형 크기에 영향을 미치지 않는다. */
				if(map[i][j] != 0) {
					/* 현재 값 = 최소값(좌측, 상단, 11시방향) +1 */
					map[i][j] = Math.min(Math.min(map[i][j-1], map[i-1][j]),map[i-1][j-1]) + 1;
					/* 가장 큰 정사각형 = 갱신된 값들 중 최대값 */
					answer = Math.max(answer, map[i][j]);
				}
			}
		}
		
		System.out.println("Answer ? : " + answer);
        return answer * answer;
    }


}
	