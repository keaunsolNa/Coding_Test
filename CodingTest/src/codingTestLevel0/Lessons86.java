package codingTestLevel0;

public class Lessons86 {

	public static void main(String[] args) {
		int[] array = {12, 14, 33};
		System.out.println(solution(array, 13));
	}
	
	// 가까운 수
    public static int solution(int[] array, int n) {
    	
    	int max = Math.abs(n - array[0]);
        int answer = 999;
    	for(int i = 0; i < array.length; i++) {
    		if(Math.abs(n - array[i]) < max) {
    			max = Math.abs(n - array[i]);
                answer = array[i];
                System.out.println(max);
    		} else if(Math.abs(n - array[i]) == max){
                if(answer > array[i]){
                    answer = array[i];
                }
            }
    	}
        return answer;
    }
}