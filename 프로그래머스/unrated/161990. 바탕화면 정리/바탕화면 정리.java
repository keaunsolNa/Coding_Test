class Solution {
    public int[] solution(String[] wallpaper) {
        
        int[][] map = new int[wallpaper.length][wallpaper[0].length()];
        
        for(int i = 0; i < wallpaper.length; i++) 
            for(int j = 0; j < wallpaper[i].length(); j++) 
                map[i][j] = wallpaper[i].charAt(j) == '.' ? 0 : 1;
        
        int xMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        
        for(int i = 0; i < map.length; i++) {
            
            for(int j = 0; j < map[i].length; j++){
                if(map[i][j] == 1) {
                    xMin = Math.min(xMin, i);                    
                    xMax = Math.max(xMax, i + 1);
                    yMin = Math.min(yMin, j);
                    yMax = Math.max(yMax, j + 1);
                }
            }
        }
        int[] answer = new int[4];
        answer[0] = xMin;
        answer[1] = yMin;
        answer[2] = xMax;
        answer[3] = yMax;
        
        return answer;
    }
}