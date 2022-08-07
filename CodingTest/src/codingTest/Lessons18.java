package codingTest;

public class Lessons18 {

	public static void main(String[] args) {

		Lessons18 lessons18 = new Lessons18();
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		double answer = lessons18.solution(arr);
		
		System.out.println(answer);
	}

    public double solution(int[] arr) {
    	
//    	정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
    	
    	double answer = 0;

    	for(int a = 0; a < arr.length; a++) {
    		answer += arr[a];
    	}
    	
        return answer/arr.length;
    }
    
}
