import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        StringTokenizer st;
        int[] termsArr = new int[26];
        String[] todayArr = today.split("[.]");
        int todayInt = (Integer.parseInt(todayArr[0]) * 336) + (Integer.parseInt(todayArr[1]) * 28) + Integer.parseInt(todayArr[2]);
        
        for(int i = 0; i < terms.length; i++) {
            
            st = new StringTokenizer(terms[i]);
            char type = st.nextToken().charAt(0);
            int term = Integer.parseInt(st.nextToken());
            termsArr[(int)(type - 'A')] = term * 28;
    
        }
        

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < privacies.length; i++) {
            
            st = new StringTokenizer(privacies[i]);
            String date = st.nextToken();
            char type = st.nextToken().charAt(0);
            String[] dateArr = date.split("[.]");
            int dateInt = (Integer.parseInt(dateArr[0]) * 336) + (Integer.parseInt(dateArr[1]) * 28) + Integer.parseInt(dateArr[2]) ;
            
            if(dateInt + termsArr[(int)(type - 'A')] <= todayInt) list.add(i + 1);

        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        
        return answer;
    }
}