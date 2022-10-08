package codingTestLevel0;

public class Lessons82 {

	public static void main(String[] args) {
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		solution(babbling);
	}
	// 옹앓이
    public static int solution(String[] babbling) {
        
    	String[] can = {"aya", "ye", "woo", "ma"};
    	String[] cant = {"ayaaya", "yeye", "woowoo", "mama"};
    	
    	int answer = 0;

        for(String str : babbling){
            String chk=str;
            
            for(String cantStr : cant){
                chk=chk.replace(cantStr,"X");
            }
            
            for(String canStr : can){
                chk=chk.replace(canStr,"");
            }
            
            if(chk.length() == 0){
                answer++;
            }
        }
    	
    	System.out.println(answer);
        return answer;
        
    }
    
}