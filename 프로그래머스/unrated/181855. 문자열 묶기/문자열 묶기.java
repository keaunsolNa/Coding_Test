import java.util.*; 
class Solution {
    public int solution(String[] strArr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();
            map.put(len, map.getOrDefault(len, 0) + 1);
        }
       
        int max = 0;
        for (Integer num : map.keySet()) {
            max = Math.max(map.get(num), max);
        }
     
        return max;
    }
}