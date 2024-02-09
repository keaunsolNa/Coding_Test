import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {

        int length = rocks.length + 2;
        int[] rock = new int[length];
        
        for(int i = 0; i < length - 2; i++) rock[i] = rocks[i];
        
        int start = 0;
        int end = distance;
        int result = 0;
        rock[length - 2] = 0;
        rock[length - 1] = distance;
        
        Arrays.sort(rock);
        
        while(start <= end) {

            int mid = (start + end) / 2;
            int sum = 0;
            int now = 0;

            for(int i = 1; i < length; i++) {

                if(rock[i] - rock[now] < mid) sum++;
                else now = i;
            }

            if(sum > n) end = mid - 1;
            else {
                result = mid;
                start = mid + 1;
            }

        }

        return result;
    }
}