class Solution {
    public String[] solution(String[] names) {
        
        
        String[] answer = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1];
        
        int cnt = 0;
        int num = 0;
        for(int i = 0; i < names.length; i++) {
            
            if(cnt == 0) answer[num++] = names[i];
            cnt++;
            
            if(cnt == 5) cnt = 0;
        }
        return answer;
    }
}