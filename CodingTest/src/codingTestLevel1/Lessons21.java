package codingTestLevel1;

public class Lessons21 {

	public static void main(String[] args) {

		Lessons21 lessons21 = new Lessons21();
		int[][] arr1 = {{1, 2},{2, 3}};
		int[][] arr2 = {{3, 4},{4, 5}};
		int[][] answer = lessons21.solution(arr1, arr2);

		for (int[] is : answer) {
			
			for (int is2 : is) {
				System.out.println(is2);
			}
		}
	}

    public int[][] solution(int[][] arr1, int[][] arr2) {
    	
//    	행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 
//    	2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
    	int i = 0;
    	int j = 0;
    	
    	int[][] answer = new int[arr1.length][arr2[i].length];

    	for(i = 0; i < arr1.length; i ++) {
			
    		for(j = 0; j < arr1[i].length; j++) {
    			answer[i][j] = arr1[i][j];
    		}
		}
    	
    	for(i = 0; i < arr2.length; i ++) {
			
    		for(j = 0; j < arr2[i].length; j++) {
    			answer[i][j] += arr2[i][j];
    		}
		}
    	
        return answer;
    }
    
}
