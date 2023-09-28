class Solution {
    public int solution(int[] num_list) {
        
        int answer;        
        if(num_list.length > 10) {
            
            answer = 0;
            for(int i = 0; i < num_list.length; i++) answer += num_list[i];
            
        } else {
            
            answer = 1;
            for(int i = 0; i < num_list.length; i++) answer *= num_list[i];
        }

        return answer;
    }
}