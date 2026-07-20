class Solution {
    public boolean detectCapitalUse(String word) {
        

        char[] arr = word.toCharArray();
        int[] arr2 = new int[arr.length];
        boolean check = false;
        boolean check2 = false;

        if (arr.length == 1) return true;

        for (int i = 0; i < arr.length; i++) {

            arr2[i] = arr[i] - 'Z';
            // 소문자 존재
            System.out.println(arr2[i]);
            if (i != 0 && arr2[i] > 0) check = true;
            
        }

        System.out.println(check);

        // 다 대문자
        if (!check) {

            for (int i = 0; i < arr.length; i++) {

                if (arr2[i] > 0) return false;
            }
        } 
        else {

            if (arr2[0] > 0) {

                for (int i = 0; i < arr.length; i++) {

                    if (arr2[i] <= 0) return false;
                }

                return true;
            }
            else {
                for (int i = 1; i < arr.length; i++) {
                    
                    if (arr2[i] <= 0) return false;
                }
            }
        }

        return true;
    }
}