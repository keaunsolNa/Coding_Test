class Solution {
    public int singleNumber(int[] nums) {

        // ones/twos 는 각 비트가 지금까지 1로 등장한 횟수를 mod 3 으로 누적한다.
        int ones = 0;
        int twos = 0;

        for (int num : nums) {

            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }

        return ones;
    }
}
