package codingTestLevel2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lessons62 {
	public static void main(String[] args) {

		Lessons62 lessons62 = new Lessons62();
		int answer = lessons62.solution("UDU");
		System.out.println(answer);
		
	}
	
    public int solution(String dirs) {

//    	방문 길이
//    	게임 캐릭터를 4가지 명령어를 통해 움직이려 합니다. 명령어는 다음과 같습니다.
//
//    	U: 위쪽으로 한 칸 가기
//
//    	D: 아래쪽으로 한 칸 가기
//
//    	R: 오른쪽으로 한 칸 가기
//
//    	L: 왼쪽으로 한 칸 가기
//
//    	캐릭터는 좌표평면의 (0, 0) 위치에서 시작합니다. 좌표평면의 경계는 왼쪽 위(-5, 5), 왼쪽 아래(-5, -5), 오른쪽 위(5, 5), 오른쪽 아래(5, -5)로 이루어져 있습니다.
    	
    	Set<String> map = new LinkedHashSet<>();
    	int x =  5;
    	int y =  5;
    	String beforeLocation = x + "" +  y;
        for(int i = 0; i < dirs.length(); i++){
            switch(dirs.charAt(i)) {
            	case 'U' : 
            		y = y + 1; break;
            	case 'D' : 
            		y = y - 1; break;
            	case 'R' : 
            		x = x + 1; break;
            	case 'L' : 
            		x = x - 1; break;
            }
            String nowLocation = x + "" +  y;
            if(x >= 0 && x <= 10 && y >= 0 && y <=10) {
            	if(!map.contains(nowLocation + " To " + beforeLocation)) {
            		map.add(beforeLocation + " To " + nowLocation);
            	}
            	beforeLocation = nowLocation;
            	System.out.println("MOVE TO : " + dirs.charAt(i) + "\tNOW LOCATION : " + nowLocation);
            } else {
            	switch(dirs.charAt(i)) {
	             	case 'U' : 
	             		y = y - 1; break;
	             	case 'D' : 
	             		y = y + 1; break;
	             	case 'R' : 
	             		x = x - 1; break;
	             	case 'L' : 
	             		x = x + 1; break;
             }
            	System.out.println("불가능한 이동");
            }
            
        }

        System.out.println(map);
        System.out.println(map.size());
        return map.size();
    }
}
