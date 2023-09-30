class Solution {
    public int[][] solution(int[][] arr) {
        
        int row = arr.length;
        int col = arr[0].length;
        
        
        if(row > col) {
            int[][] answer = new int[row][row];            
    
            for(int i = 0; i < row; i++) {
                
                for(int j = 0; j < row; j++) {
                    
                    if(arr.length <= i || arr[i].length <= j) answer[i][j] = 0;
                    else answer[i][j] = arr[i][j];
                    
                }
            }
            
            return answer;
        } else {
                      
            int[][] answer = new int[col][col];            
    
            for(int i = 0; i < col; i++) {
                
                for(int j = 0; j < col; j++) {
                    
                    if(arr.length <= i || arr[i].length <= j) answer[i][j] = 0;
                    else answer[i][j] = arr[i][j];
                    
                }
            }
            return answer;
        }

    }
}