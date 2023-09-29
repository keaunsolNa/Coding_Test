import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int l, int r) {
        
        List<String> arr = new ArrayList<>();
        for(int i = l; i <= r; i++) {
            
            String temp = i + "";
            boolean flag = true;
            for(int j = 0; j < temp.length(); j++) {
                if(!(temp.charAt(j) == '5' || temp.charAt(j) == '0')) { flag = false; break; }
            }
            
            if(flag) arr.add(temp);
        }

        if(arr.size() == 0) return new int[]{-1};
        
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = Integer.parseInt(arr.get(i));
        }

        
        return answer;
    }
}