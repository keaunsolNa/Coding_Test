class Solution {
    public int countLargestGroup(int n) {

        Map<Integer, Integer> groupSizes = new HashMap<>();

        for (int i = 1; i <= n; i++) {

            int digitSum = 0;

            for (int rest = i; rest != 0; rest /= 10) {

                digitSum += rest % 10;
            }

            groupSizes.merge(digitSum, 1, Integer::sum);
        }

        int largestSize = 0;
        int largestGroupCount = 0;

        for (int size : groupSizes.values()) {

            if (size > largestSize) {

                largestSize = size;
                largestGroupCount = 1;
            }

            else if (size == largestSize) {

                largestGroupCount++;
            }
        }

        return largestGroupCount;
    }
}
