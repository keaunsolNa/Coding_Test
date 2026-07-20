class Solution {
    public boolean detectCapitalUse(String word) {
        
        char[] arr = word.toCharArray();
        int[] arr2 = new int[arr.length];
        boolean check = false;
        boolean check2 = false;

        for (int i = 0; i < arr.length; i++) {

            arr2[i] = arr[i] - 'Z';
            // 소문자 존재
            if (i != 0 && arr2[i] > 0) check = true;
            
        }

        // 다 대문자
        if (!check) {

            for (int i = 0; i < arr.length; i++) {

                if (arr2[i] > 0) return false;
            }
        } 
        else {

            for (int i = 0; i < arr.length; i++) {
                
                if (arr2[i] <= 0) return false;
            }
        }

        return true;
    }
}