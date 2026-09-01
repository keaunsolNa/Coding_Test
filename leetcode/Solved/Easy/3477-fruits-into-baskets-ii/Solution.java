class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {

        boolean[] used = new boolean[baskets.length];
        int unplaced = fruits.length;

        for (int fruit : fruits) {

            for (int j = 0; j < baskets.length; j++) {

                if (!used[j] && fruit <= baskets[j]) {
                    used[j] = true;
                    unplaced--;
                    break;
                }
            }
        }

        return unplaced;
    }
}
