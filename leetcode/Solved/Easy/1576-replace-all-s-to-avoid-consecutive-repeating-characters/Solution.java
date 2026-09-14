class Solution {
    public String modifyString(String s) {
        
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            char target = arr[i];

            if (target == '?') {

                for (char replacement = 'a'; replacement <= 'c'; replacement++) {

                    if (i > 0 && arr[i - 1] == replacement) continue;
                    if (i + 1 < arr.length && arr[i + 1] == replacement) continue;

                    arr[i] = replacement;
                    break;
                }
            }
        }

        return String.valueOf(arr);
    }
}