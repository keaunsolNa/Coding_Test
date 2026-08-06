class Solution {
    public int[] singleNumber(int[] nums) {

        // 전체 XOR = 두 유일값의 XOR (나머지는 쌍으로 상쇄된다).
        int xorAll = 0;

        for (int num : nums) {
            xorAll ^= num;
        }

        // 두 값이 다른 최하위 비트. xorAll 은 0 이 아니므로 반드시 존재한다.
        // Integer.MIN_VALUE 도 -x 오버플로 없이 자기 자신이 되므로 안전하다.
        int diffBit = xorAll & -xorAll;

        int[] answer = new int[2];

        for (int num : nums) {

            if ((num & diffBit) == 0) {
                answer[0] ^= num;
            } else {
                answer[1] ^= num;
            }
        }

        return new int[] {first, second};
    }
}
