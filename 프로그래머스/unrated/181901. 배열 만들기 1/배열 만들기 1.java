import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int k) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(i % k == 0) list.add(i);
        }
        
        int[] arr = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}