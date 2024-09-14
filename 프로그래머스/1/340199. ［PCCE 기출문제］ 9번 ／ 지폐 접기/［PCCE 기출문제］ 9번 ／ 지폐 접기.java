class Solution {
    public int solution(int[] wallet, int[] bill) {

        int answer = 0;
        
        while (true)
        {
            
            int wmax = Math.max(wallet[0], wallet[1]);
            int wmin = Math.min(wallet[0], wallet[1]);
            int bmax = Math.max(bill[0], bill[1]);
            int bmin = Math.min(bill[0], bill[1]);
            
            if (bmax <= wmax && bmin <= wmin) break;
            
            answer++;
            if (bill[0] > bill[1]) bill[0] /= 2;
            else bill[1] /= 2;
        }
        

        return answer;
    }
}