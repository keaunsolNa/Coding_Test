class Solution {
    public int solution(int[][] arr) {
        
        int length = arr.length;
        
        boolean flag = true;
        for(int i = 0; i < length; i++) {
            
            for(int j = 0; j < length; j++) {
                
                if(arr[i][j] != arr[j][i]) flag = false;
            }
        }
        return flag ? 1 : 0;
    }
}