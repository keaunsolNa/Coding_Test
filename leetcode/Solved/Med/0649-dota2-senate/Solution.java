class Solution {
    public String predictPartyVictory(String senate) {

        int senateLength = senate.length();
      
        Deque<Integer> radiantQueue = new ArrayDeque<>();
        Deque<Integer> direQueue = new ArrayDeque<>();
      
        for (int i = 0; i < senateLength; ++i) {
            if (senate.charAt(i) == 'R') {
                radiantQueue.offer(i);
            } else {
                direQueue.offer(i);
            }
        }
      
        while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
            int radiantIndex = radiantQueue.poll();
            int direIndex = direQueue.poll();
          
            if (radiantIndex < direIndex) {
                radiantQueue.offer(radiantIndex + senateLength);
            } else {
                direQueue.offer(direIndex + senateLength);
            }
        }
      
        return radiantQueue.isEmpty() ? "Dire" : "Radiant";

    }
}