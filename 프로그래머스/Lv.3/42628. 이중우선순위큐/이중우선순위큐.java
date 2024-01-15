import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String[] operations) {

        StringTokenizer st;
        TreeMap<Integer, Integer> que = new TreeMap<>();

        for(String str : operations) {
       
            st = new StringTokenizer(str);
            char oper = st.nextToken().charAt(0);
            int number = Integer.parseInt(st.nextToken());
            
            if(oper == 'I') 
                que.put(number, que.getOrDefault(number, 0) + 1);

            else {

                if(que.isEmpty()) continue;

                int target = number == 1 ? que.lastKey() : que.firstKey();
                if(que.put(target, que.get(target) - 1) == 1) que.remove(target);

            }

        }
        
        if(que.isEmpty()) return new int[] {0, 0};
        else return new int[] { que.lastKey(), que.firstKey() };
        
    }
}