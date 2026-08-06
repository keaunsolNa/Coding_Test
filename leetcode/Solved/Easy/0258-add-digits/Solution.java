class Solution {
    public int addDigits(int num) {

        // digital root: 1..9 가 9 주기로 반복되므로 O(1) 로 구할 수 있다.
        if (num == 0) {
            return 0;
        }

        return 1 + (num - 1) % 9;
    }
}
