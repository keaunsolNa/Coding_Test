class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {

        int cnt = fruits.length;

        for (int i = 0; i < fruits.length; i++) {

            for (int j = 0; j < baskets.length; j++) {

                System.out.println(fruits[i] + " " + baskets[j]);

                if (fruits[i] <= baskets[j]) {

                    baskets[j] = 0;
                    cnt--;
                    break;
                }
            }
        }

        return cnt;
    }
}