class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        
        Arrays.sort(players);
        Arrays.sort(trainers);
        int startIdx = 0;
        int ans = 0;

        for (int i = 0; i < players.length; i++) {

            int grid = players[i];

            for (int j = startIdx; j < trainers.length; j++) {

                int size = trainers[j];

                if (grid <= size) {

                    startIdx = j + 1;
                    ans++;
                    break;
                }
                
            }
        }

        return ans;
    }
}