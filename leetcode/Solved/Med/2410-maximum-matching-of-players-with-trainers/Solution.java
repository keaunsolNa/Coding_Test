class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {

        Arrays.sort(players);
        Arrays.sort(trainers);

        int matched = 0;

        for (int trainer = 0; trainer < trainers.length && matched < players.length; trainer++) {

            if (players[matched] <= trainers[trainer]) {
                matched++;
            }
        }

        return matched;
    }
}
