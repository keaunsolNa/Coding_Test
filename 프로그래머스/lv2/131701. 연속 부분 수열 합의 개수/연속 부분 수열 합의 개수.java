import java.util.*;
class Solution {
    public int solution(int[] elements) {

        int answer = 0;
        int size = 1;
        Set<Integer> set = new HashSet<>();
        
        while (size <= elements.length) {
            
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += elements[i % elements.length];
                set.add(sum);
            }
            
            for (int i = 0; i < elements.length; i++) {
                sum -= elements[i % elements.length];
                sum += elements[(i + size) % elements.length];
                set.add(sum);
            }
            size++;
        }
        answer = set.size();
        return answer;
    }
}