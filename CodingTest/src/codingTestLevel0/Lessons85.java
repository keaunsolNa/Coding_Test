package codingTestLevel0;

public class Lessons85 {

	public static void main(String[] args) {
		String[] spell = {"z", "d", "x"};
		String[] dic = {"def", "dww", "dzx", "loveaw"};
		System.out.println(solution(spell, dic));
	}
	
	// 외계어 사전
    public static int solution(String[] spell, String[] dic) {
    	
    	int total = 0;
    	for(int i = 0; i < spell.length; i++) {
    		total += spell[i].charAt(0);
    	}
    	
    	int[] arr = new int[dic.length];
    	for(int i = 0; i < dic.length; i++) {
    		int temp = 0;
    		for(int j = 0; j < dic[i].length(); j++) {
    			temp += dic[i].charAt(j);
    		}
    		arr[i] = temp;
    	}
    	
    	int answer = 2;
    	for (int i = 0; i < arr.length; i++) {
    		if(arr[i] == total) {
    			answer = 1;
    			break;
    		}
		}
    	
        return answer;
    }
}