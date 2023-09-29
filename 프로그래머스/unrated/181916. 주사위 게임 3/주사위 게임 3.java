import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);  
        map.put(d, map.getOrDefault(d, 0) + 1);   
        List<Integer> keys = new ArrayList<>(map.keySet());
        
        switch(map.size()) {
                
            case 1 : return 1111 * a;
            case 2 : 
                if(map.get(keys.get(0)) == 1 || map.get(keys.get(1)) == 1) {
                    
                    int p = map.get(keys.get(0)) == 3 ? keys.get(0) : keys.get(1);
                    int q = map.get(keys.get(0)) == 1 ? keys.get(0) : keys.get(1);
                    return (int) Math.pow((10 * p) + q, 2);
                } else  {
                    
                    return (keys.get(0) + keys.get(1)) * Math.abs(keys.get(0) - keys.get(1));
                }
            case 3 : 
                int result = 0;
                for(Integer key: map.keySet()) {
                    
                    if(map.get(key) != 2) 
                        if(result == 0) result = key;
                    else return result * key;
                }
            case 4 : 
                Collections.sort(keys);
                return keys.get(0);
        }
        
        return 0;
    }
}