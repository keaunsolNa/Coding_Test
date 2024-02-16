import java.util.*;
class Solution {
    
    public static int[][] arr;
    public int solution(int n, int[][] wires) {

        int answer = n;
        arr = new int[n + 1][n + 1];
        
        for(int i = 0; i < wires.length; i++) {
            
            arr[wires[i][0]][wires[i][1]] = 1;
            arr[wires[i][1]][wires[i][0]] = 1;

        }
        
        int a;
        int b;
        for(int i = 0; i < wires.length; i++) {
            
            a = wires[i][0];
            b = wires[i][1];
            
            arr[a][b] = 0;
            arr[b][a] = 0;
            
            answer = Math.min(answer, solove(n, a));
            
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        
        return answer;
    }
    
    public int solove(int n, int start){

        int[] visit = new int[n + 1];
        int cnt = 1;
        
        Queue<Integer> que = new LinkedList<>();
        que.offer(start);
        
        while(!que.isEmpty()) {
            
            int point = que.poll();
            visit[point] = 1;
            
            for(int i = 1; i <= n; i++){ 
                
                if(visit[i] == 1) continue;
                
                if(arr[point][i] == 1) {
                    que.offer(i);
                    cnt++;
                }
            }
        }
        return (int)Math.abs(n - 2 * cnt); 
    }
}