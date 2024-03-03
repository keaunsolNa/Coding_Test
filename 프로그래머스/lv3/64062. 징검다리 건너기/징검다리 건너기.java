class Solution {
    public int solution(int[] stones, int k) {
        
        int left = 1;
        int right = 200000000;
        
        while (left <= right) {
            
            int mid = (left + right) / 2 >> 0;
            int count = 0;
            
            for (int stone : stones) {
                
                if(stone - mid <= 0) count++;
                else count = 0;
                
                if(count == k) break;
            }
            
            if (count == k) right = mid - 1;
            else left = mid + 1;
        }
        
        return left;
    }
}