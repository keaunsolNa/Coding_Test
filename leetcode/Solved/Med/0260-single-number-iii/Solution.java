class Solution {
    public int[] singleNumber(int[] nums) {

        int xorAll = 0;

        for (int num : nums) {
            xorAll ^= num;
        }

        // 두 유일값은 이 비트에서 서로 다르므로, 이 비트로 두 그룹을 가른다.
        int lowestDiffBit = xorAll & -xorAll;

        int first = 0;
        int second = 0;

        for (int num : nums) {

            if ((num & lowestDiffBit) == 0) {
                first ^= num;
            } else {
                second ^= num;
            }
        }

        return new int[] {first, second};
    }
}
