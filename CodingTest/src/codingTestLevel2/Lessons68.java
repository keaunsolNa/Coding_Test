package codingTestLevel2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lessons68 {
	
	public static void main(String[] args) {

		Lessons68 lessons68 = new Lessons68();

		int[] topping = { 1, 2, 1, 3, 1, 4, 1, 2 };
		int answer = lessons68.solution(topping);

		System.out.println("ANSER : " + answer);
		
	} //	main
	
	private Map<Integer, Integer> myTopping = new HashMap<>();
	private Set<Integer> brothersTopping = new HashSet<>();
	
	public int solution(int[] topping) {
	    
//		철수는 롤케이크를 두 조각으로 잘라서 동생과 한 조각씩 나눠 먹으려고 합니다. 
//		이 롤케이크에는 여러가지 토핑들이 일렬로 올려져 있습니다. 
//		철수와 동생은 롤케이크를 공평하게 나눠먹으려 하는데, 그들은 롤케이크의 크기보다 롤케이크 위에 올려진 토핑들의 종류에 더 관심이 많습니다. 
//		그래서 잘린 조각들의 크기와 올려진 토핑의 개수에 상관없이 각 조각에 동일한 가짓수의 토핑이 올라가면 공평하게 롤케이크가 나누어진 것으로 생각합니다.
//
//		예를 들어, 롤케이크에 4가지 종류의 토핑이 올려져 있다고 합시다. 
//		토핑들을 1, 2, 3, 4와 같이 번호로 표시했을 때, 케이크 위에 토핑들이 [1, 2, 1, 3, 1, 4, 1, 2] 순서로 올려져 있습니다. 
//		만약 세 번째 토핑(1)과 네 번째 토핑(3) 사이를 자르면 롤케이크의 토핑은 [1, 2, 1], [3, 1, 4, 1, 2]로 나뉘게 됩니다. 
//		철수가 [1, 2, 1]이 놓인 조각을, 동생이 [3, 1, 4, 1, 2]가 놓인 조각을 먹게 되면 철수는 두 가지 토핑(1, 2)을 맛볼 수 있지만, 
//		동생은 네 가지 토핑(1, 2, 3, 4)을 맛볼 수 있으므로, 이는 공평하게 나누어진 것이 아닙니다. 
//		만약 롤케이크의 네 번째 토핑(3)과 다섯 번째 토핑(1) 사이를 자르면 [1, 2, 1, 3], [1, 4, 1, 2]로 나뉘게 됩니다. 
//		이 경우 철수는 세 가지 토핑(1, 2, 3)을, 동생도 세 가지 토핑(1, 2, 4)을 맛볼 수 있으므로, 이는 공평하게 나누어진 것입니다. 
//		공평하게 롤케이크를 자르는 방법은 여러가지 일 수 있습니다. 위의 롤케이크를 [1, 2, 1, 3, 1], [4, 1, 2]으로 잘라도 공평하게 나뉩니다. 어
//		떤 경우에는 롤케이크를 공평하게 나누지 못할 수도 있습니다.
//
//		롤케이크에 올려진 토핑들의 번호를 저장한 정수 배열 topping이 매개변수로 주어질 때, 
//		롤케이크를 공평하게 자르는 방법의 수를 return 하도록 solution 함수를 완성해주세요.
		
        for (int slice : topping) {
            int cnt = myTopping.getOrDefault(slice, 0);
            myTopping.put(slice, cnt + 1);
        }
		
        int equalCnt = 0;

        for (int slice : topping) {
        	
            moveTopping(slice);

            if (myTopping.size() < brothersTopping.size()) {
                break;
            }

            if (myTopping.size() == brothersTopping.size()) {
                equalCnt++;
            }
        }
        
        return equalCnt;
				
    }
    
    private void moveTopping(int slice) {
        brothersTopping.add(slice);
        int toppingCnt = myTopping.get(slice);

        if (toppingCnt == 1) {
            myTopping.remove(slice);
            return;
        }

        myTopping.put(slice, toppingCnt - 1);
    }
}
	
	
