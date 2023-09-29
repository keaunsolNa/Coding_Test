class Solution {
    public int solution(int[] date1, int[] date2) {
        
        int dateOne = (date1[0] * 365) + (date1[1] * 12) + date1[2];
        int dateTwo = (date2[0] * 365) + (date2[1] * 12) + date2[2];
        
        return dateOne < dateTwo ? 1 : 0;
    }
}