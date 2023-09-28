class Solution {
    public int solution(int[] num_list) {

        int cnt = 0;
        for(int i = 0; i < num_list.length; i++) {
            int target = num_list[i];
            
            while(target != 1) {
                
                if(target % 2 == 0) target /= 2;
                else target = --target / 2;
                cnt++;
            }
        }
        return cnt;
    }
}