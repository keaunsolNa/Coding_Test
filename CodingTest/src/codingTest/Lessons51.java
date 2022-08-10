package codingTest;

import java.util.Arrays;

public class Lessons51 {

	public static void main(String[] args) {
		
		Lessons51 lessons51 = new Lessons51();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
		
		int[] result = lessons51.solution(array, commands);
		
		for (int i : result) {
			System.out.println("result : " + i);
		}
		
	}
	
    public int[] solution(int[] array, int[][] commands) {
    	
//    	배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
//
//    	예를 들어 array가 [1, 9, 2, 6, 3, 7, 4 ], i = 2, j = 5, k = 3이라면
//
//    	1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
//    	2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
//    	3. 2에서 나온 배열의 3번째 숫자는 5입니다.
//    	배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, 
//    	commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

        int cnt= 0;
        int answer[] = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
        cnt=0;
        int[] arrs = new int[commands[i][1] - commands[i][0]+1];
           for(int j = commands[i][0]-1; j < commands[i][1]; j++){
                arrs[cnt++] = array[j];
            }
        Arrays.sort(arrs);
        answer[i] = arrs[commands[i][2]-1];
        }

        return answer;
    	
    }
}
