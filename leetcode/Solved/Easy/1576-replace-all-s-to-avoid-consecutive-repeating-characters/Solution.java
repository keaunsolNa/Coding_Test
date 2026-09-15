class Solution {
    public String modifyString(String s) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != '?') {
                continue;
            }

            // 좌우 이웃 최대 2개만 배제되므로 a/b/c 중 하나는 반드시 남는다.
            for (char replacement = 'a'; replacement <= 'c'; replacement++) {

                if (i > 0 && arr[i - 1] == replacement) {
                    continue;
                }

                if (i + 1 < arr.length && arr[i + 1] == replacement) {
                    continue;
                }

                arr[i] = replacement;
                break;
            }
        }

        return String.valueOf(arr);
    }
}
