package codingTestLevel0;

public class Lessons68 {
	
	// 로그인 성공?
    public String solution(String[] id_pw, String[][] db) {
    	
    	String id = id_pw[0];
    	String pwd = id_pw[1];
    	String answer = "";
    	for(int i = 0; i < db.length; i++) {
    		if(db[i][0].equals(id) && db[i][1].equals(pwd)) {
    			answer = "login";
    			break;
    		} else if(db[i][0].equals(id) && !(db[i][1].equals(pwd))) {
    			answer = "wrong pw";
    		} else {
    			if(!answer.equals("wrong pw")) {
    				answer = "fail";
    			}
    		}
    	}
        return answer;
    }
    
}