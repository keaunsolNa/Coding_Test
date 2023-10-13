import java.util.*;
class Solution {
    public int solution(int n, int[][] results) {
        
        int answer = 0;
        
        int[][] arr = new int[n + 1][n + 1];
        
        for(int i = 1; i < arr.length; i++) 
            for(int j = 1; j < arr.length; j++) 
                arr[i][j] = 10000;        
        
        for(int i = 0; i < results.length; i++) {
            
            int x = results[i][0];
            int y = results[i][1];
            arr[x][y] = 1;
            
        }
        
        for(int i = 1; i < arr.length; i++) 
            for(int j = 1; j < arr.length; j++) 
                for (int k = 1; k < arr.length; k++) 
                    if (arr[j][k] > arr[j][i] + arr[i][k]) 
                        arr[j][k] = arr[j][i] + arr[i][k];
        
        for (int i = 1; i < arr.length; i++) {
            
            int count = 0;

            for (int j = 1; j < arr.length; j++) 
                if (arr[i][j] < 10000 || arr[j][i] < 10000) count++;
            
            if (count == n - 1) answer++;
            
        }
        
        return answer;
    }
}