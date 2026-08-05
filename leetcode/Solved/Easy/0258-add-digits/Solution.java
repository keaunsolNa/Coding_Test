class Solution {
    public int addDigits(int num) {

        // digital root: 자릿수 합을 반복해도 결과는 9 로 나눈 나머지에 수렴한다.
        if (num == 0) {
            return 0;
        }

        return 1 + (num - 1) % 9;
    }
}
