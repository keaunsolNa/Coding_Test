package codingTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Lessons16 {

	public static void main(String[] args) {

		Lessons16 lessons16 = new Lessons16();
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		int[] answer = lessons16.solution(arr);
		
		for (int i : answer) {
			System.out.println(i);
		}
	}

    public int[] solution(int []arr) {
       
//    	�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. 
//    	�̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. 
//    	��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. ���� ���,
//
//    	arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
//    	arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
//    	�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.
  	
    	
        List<Integer> arrayOfNumbers = new ArrayList<>();
        
        for (Integer integer : arr) {
			arrayOfNumbers.add(integer);
		}
        System.out.println("BEFORE : " + arrayOfNumbers);
        
        Iterator<Integer> iter=arrayOfNumbers.iterator();

        
        
        for(int i = 1; i < arrayOfNumbers.size(); i++) {
        	if(arrayOfNumbers.get(i) == arrayOfNumbers.get(i -1)) {
        		System.out.println("���� ���ڿ� : " + arrayOfNumbers.get(i) + " �ε��� : " + i);
        		arrayOfNumbers.remove(i);
        	}
        }
        
        System.out.println("RESULT : " + arrayOfNumbers);
        
        int[] answer = arrayOfNumbers.stream()
                .filter(i -> i != null)
                .mapToInt(i -> i)
                .toArray();
        		
        return answer;
    }
}
