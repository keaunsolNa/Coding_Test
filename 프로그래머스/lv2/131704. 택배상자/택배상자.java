import java.util.*;

class Solution {
    public int solution(int[] order) {
    
        int len = order.length;
        Stack<Integer> container = new Stack<>();
        Deque<Integer> subContainer = new LinkedList<>();

        for(int i = 1; i <= len; i++) container.add(len - i + 1);

        int idx = 0;
        int ans = 0;
        while(!container.isEmpty()) {

            if(!subContainer.isEmpty() && subContainer.peekLast() == order[idx]) {
                idx++;
                ans++;
                subContainer.pollLast();
                continue;
            }

            int now = container.pop();

            if(order[idx] == now) {
                ans++;
                idx++;
            }

            else {
                subContainer.add(now);
            }


        }

        while(!subContainer.isEmpty()) {

            int now = subContainer.pollLast();

            if(order[idx] == now) {
                ans++;
                idx++;
            }

            else break;
        }
        
        return ans;
    }
}