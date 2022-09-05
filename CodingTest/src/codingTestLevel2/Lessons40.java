package codingTestLevel2;

public class Lessons40 {

	public static void main(String[] args) {

		Lessons40 lessons40 = new Lessons40();
		int[] answer = lessons40.solution(24, 24);

		for (int i : answer) {
			System.out.println(i);
		}
		System.out.println("ANSER : " + answer);
		
	}
	
	public int[] solution(int brown, int yellow) {
		
//		Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
//
//		Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.
//
//		Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
				
		/**
		 *  B Y     가,세
			8  1    3, 3
			10 2    4, 3
			12 4    4, 4
			14 6    4, 5
			16 8    4, 6
			18 12   5, 6
			20 16   6, 6 
			22 20   7, 6
			24 24   8, 6
			26 28   9, 6
			8  1    3, 3
			24 24   8, 6  
		 */
				
		int[] answer = new int[2];
		if(brown == 8) {
			
			answer[0] = 3;
			answer[1] = 3;
			return answer;
			
		} else if(brown == 10) {
			
			answer[0] = 4;
			answer[1] = 3;
			return answer;
			
		}
		
		int col =3, row =3;
		
		for(col = 3; col < brown; col++) {
			for(row = 3; row <= col; row++) {
				if(brown == (col*2 + (row-2)*2)) {
					if(yellow == col*row - brown) {
						answer[0] = col;
						answer[1] = row;
						return answer;
					}
				}
			}
		}
		
        
        return answer;
    }

}
	