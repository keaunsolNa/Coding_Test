class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            // rev * 10 + pop 이 int 범위를 넘기 직전에 미리 차단한다.
            // MAX_VALUE = 2147483647 이므로 마지막 자리 한계는 7.
            if (rev > Integer.MAX_VALUE / 10
                    || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }

            // MIN_VALUE = -2147483648 이므로 마지막 자리 한계는 -8.
            if (rev < Integer.MIN_VALUE / 10
                    || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            rev = rev * 10 + pop;
        }

        return rev;
    }
}
