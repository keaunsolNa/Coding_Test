class Solution {
    public int solution(int[] num_list) {
        
        long plus = 0;
        long mult = 1;
        for(int i = 0; i < num_list.length; i++) {
            plus += num_list[i];
            mult *= num_list[i];
        }
        
        return mult < plus * plus ? 1 : 0;
    }
}