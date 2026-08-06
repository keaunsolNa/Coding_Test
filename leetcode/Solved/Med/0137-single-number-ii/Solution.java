class Solution {
    public int singleNumber(int[] nums) {

        // ones/twos 로 각 비트가 3 으로 나눈 나머지 몇 번 등장했는지를 센다.
        // 3 번째 등장에서 두 상태 모두 0 으로 돌아가므로, 남는 값이 정답이다.
        int ones = 0;
        int twos = 0;

        for (int num : nums) {

            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }

        return ones;
    }
}
