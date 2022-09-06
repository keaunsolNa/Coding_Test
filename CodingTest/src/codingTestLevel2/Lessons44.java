package codingTestLevel2;

public class Lessons44 {

	public static void main(String[] args) {

		Lessons44 lessons44 = new Lessons44();
		int[][] arr1 = {{2,3,2},{4,2,4},{3,1,4}};
		int[][] arr2 = {{5,4,3},{2,4,1},{3,1,1}};
		
		int[][] answer = lessons44.solution(arr1, arr2);

		System.out.println("ANSER : " + answer);
		
	}
	
	public int[][] solution(int[][] arr1, int[][] arr2) {
		
//		2차원 행렬 arr1과 arr2를 입력받아, 
//		arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.
		
		int N = arr1.length ;
		int M = arr1[0].length;
		int K = arr2[0].length;
		int[][] answer = new int[N][K];
		
		for(int i = 0; i < N; i++) {
			 
			for(int j = 0; j < K; j++) {	
		 
				for(int k = 0; k < M; k++) {	
					answer[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		
		for (int[] is : answer) {
			for (int is2 : is) {
				System.out.println("TEST : " + is2);
			}
			System.out.println();
		}
		
		System.out.println(answer);
        return answer;
    }
	
}
	