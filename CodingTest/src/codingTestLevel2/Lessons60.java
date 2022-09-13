package codingTestLevel2;

public class Lessons60 {
	public static void main(String[] args) {

		Lessons60 lessons60 = new Lessons60();
		int[][] arr = {{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}};
		int[] answer = lessons60.solution(arr);
		System.out.println("ANSER : " + answer);
		
	}
	public static StringBuilder sb = new StringBuilder();
	public int[] solution(int[][] arr) {
		
//		쿼드압축 후 개수 세기
//		0과 1로 이루어진 2n x 2n 크기의 2차원 정수 배열 arr이 있습니다. 당신은 이 arr을 쿼드 트리와 같은 방식으로 압축하고자 합니다. 구체적인 방식은 다음과 같습니다.
//
//		당신이 압축하고자 하는 특정 영역을 S라고 정의합니다.
//		만약 S 내부에 있는 모든 수가 같은 값이라면, S를 해당 수 하나로 압축시킵니다.
//		그렇지 않다면, S를 정확히 4개의 균일한 정사각형 영역(입출력 예를 참고해주시기 바랍니다.)으로 쪼갠 뒤, 각 정사각형 영역에 대해 같은 방식의 압축을 시도합니다.
//		arr이 매개변수로 주어집니다. 위와 같은 방식으로 arr을 압축했을 때, 배열에 최종적으로 남는 0의 개수와 1의 개수를 배열에 담아서 return 하도록 solution 함수를 완성해주세요.
				
				
        int[] answer = new int[2];
            
		int N = arr.length;
		QuadTree(0, 0, N, arr);
		
		int zero = 0;
		int one = 0;
		for (int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) == '0') {
				zero++;
			} else if(sb.charAt(i) == '1') {
				one++;
			}
		}
		answer[0] = zero;
		answer[1] = one;
				
		return answer;
    }
    
    public static void QuadTree(int x, int y, int size, int[][] arr) {
		
		if(isPossible(x, y, size, arr)) {
			sb.append(arr[x][y]);
			return;
		}
		int newSize = size / 2;	
		
		QuadTree(x, y, newSize, arr);		
		QuadTree(x, y + newSize, newSize, arr);				
		QuadTree(x + newSize, y, newSize, arr);				
		QuadTree(x + newSize, y + newSize, newSize, arr);	
		
	}
	
	public static boolean isPossible(int x, int y, int size, int[][] arr) {
		int value = arr[x][y];
		for(int i = x; i < x + size; i++) {
			for(int j = y; j < y + size; j++) {
				if(value != arr[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
}