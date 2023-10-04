class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        int[] answer = new int[targets.length];
        for(int i = 0; i < targets.length; i++) {
    
            int hab = 0;
            
            for(int j = 0; j < targets[i].length(); j++) {
                
                char target = targets[i].charAt(j);
                int min = Integer.MAX_VALUE;
                
                for(int q = 0; q < keymap.length; q++) {
                    
                    int idx = keymap[q].indexOf(target) == -1 ? Integer.MAX_VALUE : keymap[q].indexOf(target) + 1;
                    min = Math.min(idx, min);
                }
                
                if(min == Integer.MAX_VALUE) { hab = -1; break;}
                else hab += min;
            }
            
            answer[i] = hab;
        }
        return answer;
    }
}