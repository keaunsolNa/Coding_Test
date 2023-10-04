class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int startX = 0;
        int startY = 0;
        boolean flag = true;
        for(int i = 0; i < park.length; i++) {
            
            for(int j = 0; j < park[i].length(); j++) {
                if(park[i].charAt(j) == 'S') {
                    startX = i;
                    startY = j;
                    flag = false;
                    break;
                }
            }
            if(!flag) break;
        }
        
        for(int i = 0; i < routes.length; i++) {
            
            char direction = routes[i].charAt(0);
            int distance = routes[i].charAt(2) - '0';
            
            int X = startX;
            int Y = startY;
            int dx = distance;
            int dy = distance;
            flag = true;
            
            switch(direction) {

                case 'N' :
                    while(distance != 0) {
                        distance--;
                        if(--X < 0 || park[X].charAt(Y) == 'X') { flag = false; break; }
                    }
                    break;
                    
                case 'S' :
                    while(distance != 0) {
                        distance--;
                        if(++X >= park.length || park[X].charAt(Y) == 'X') { flag = false; break; }
                    }
                    break;
                    
                case 'W' :
                    while(distance != 0) {
                        distance--;
                        if(--Y < 0 || park[X].charAt(Y) == 'X') { flag = false; break; }
                    }
                    break;
                    
                case 'E' :
                    while(distance != 0) {
                        distance--;
                        if(++Y >= park[X].length() || park[X].charAt(Y) == 'X') { flag = false; break; }
                    }
            }
            

            if(flag) {
                switch(direction) {
                    case 'N' : startX -= dx; break;
                    case 'S' : startX += dx; break;
                    case 'W' : startY -= dy; break;
                    case 'E' : startY += dy; break;
                        
                }
            }
        }
        
        int[] answer = new int[2];
        answer[0] = startX;
        answer[1] = startY;
        return answer;
    }

}