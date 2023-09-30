import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        int size = arr.length;
        
        while(size % 2 == 0) size /= 2;
        if(size == 1) return arr;
        
        double x = 0;
        int y = 0;
        int len = arr.length;
        while(len > x) x = Math.pow(2, y++);
        
        int[] answer = new int[(int)x];
        
        for(int i = 0; i< arr.length; i++) 
            answer[i] = arr[i];
        
        return answer;
    }
}