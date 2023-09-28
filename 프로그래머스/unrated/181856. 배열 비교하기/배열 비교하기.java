class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        if(arr1.length > arr2.length) return 1;
        else if(arr1.length < arr2.length) return -1;
        else {
            
            int num1 = 0;
            int num2 = 0;
            
            for(int i = 0; i < arr1.length; i++ ) num1 += arr1[i];
            for(int i = 0; i < arr2.length; i++ ) num2 += arr2[i];
            
            if(num1 > num2) return 1;
            else if(num2 > num1) return -1;
        }
        return 0;
    }
}