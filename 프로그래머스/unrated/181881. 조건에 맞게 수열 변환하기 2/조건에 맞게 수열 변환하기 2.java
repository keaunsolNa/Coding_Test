import java.util.*; 
class Solution {
    public int solution(int[] arr) {
        
        int[] next = new int[arr.length];

        for(int i = 0; i < arr.length; i++) 
            next[i] = arr[i] >= 50 && arr[i] % 2 == 0 ? arr[i] / 2 : arr[i] < 50 && arr[i] % 2 != 0 ? arr[i] * 2 + 1 : arr[i];   
       
        int temp = 0;
       
        while(true) {
            
            if(!Arrays.equals(arr, next)) for(int i = 0; i < arr.length; i++ ) arr[i] = next[i];
            else break;
            
            for(int i = 0; i < arr.length; i++) 
                next[i] = next[i] >= 50 && next[i] % 2 == 0 ? next[i] / 2 : next[i] < 50 && next[i] % 2 != 0 ? next[i] * 2 + 1 : next[i];   

            temp++;
        }
        
        return temp;
    }
}