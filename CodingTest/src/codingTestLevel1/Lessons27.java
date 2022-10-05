package codingTestLevel1;

import java.util.ArrayList;
import java.util.List;

public class Lessons27 {

	public static void main(String[] args) {

		Lessons27 lessons27 = new Lessons27();
		String s = "onetwothreefourfivesixseveneightnine";
		int answer = lessons27.solution(s);
		
		System.out.println("Result : " + answer);
	}

    public int solution(String s) {
    	
//    	네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
//
//    	다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
//
//    	1478 → "one4seveneight"
//    	234567 → "23four5six7"
//    	10203 → "1zerotwozero3"
//    	이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
//
//    	참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.
    	
        int answer = 0;
        
        int zero = 'z' + 'e' + 'r' + 'o';
        int one = 'o' + 'n' + 'e';
        int two = 't' + 'w' + 'o';
        int three = 't' + 'h' + 'r' + 'e' + 'e';
        int four = 'f' + 'o' + 'u' + 'r';
        int five = 'f' + 'i' + 'v' + 'e';
        int six = 's' + 'i' + 'x';
        int seven = 's' + 'e' + 'v' + 'e' + 'n';
        int eight = 'e' + 'i' + 'g' + 'h' + 't';
        int nine = 'n' + 'i' + 'n' + 'e';
        
        System.out.println(nine);
        System.out.println(five);
        List<Character> charArrayList = new ArrayList<>();
        char[] charArray = s.toCharArray();
        	
        int str = 0 ;
	        for(int i = 0; i < charArray.length; i++) {
	        	if(charArray[i] != '0' && charArray[i] != '1' && charArray[i] != '2' && charArray[i] != '3' && charArray[i] != '4'
	        			&& charArray[i] != '5' && charArray[i] != '6' && charArray[i] != '7' && charArray[i] != '8' && charArray[i] != '9') {
	
	        		str += charArray[i];
	        		
	        		if(str == zero) {
	        			charArrayList.add('0');
	        			str = 0;
	        		} else if(str == one){
	        			charArrayList.add('1');
	        			str = 0;
	        		} else if(str == two){
	        			charArrayList.add('2');
	        			str = 0;
	        		} else if(str == three){
	        			charArrayList.add('3');
	        			str = 0;
	        		} else if(str == four){
	        			charArrayList.add('4');
	        			str = 0;
	        		} else if(str == five && charArray[i -1] == 'v'){
	        			charArrayList.add('5');
	        			str = 0;
	        		} else if(str == six){
	        			charArrayList.add('6');
	        			str = 0;
	        		} else if(str == seven) {
	        			charArrayList.add('7');
	        			str = 0;
	        		} else if(str == eight) {
	        			charArrayList.add('8');
	        			str = 0;
	        		} else if(str == nine) {
	        			charArrayList.add('9');
	        			str = 0;
	        		}
	        	} else {
	        		charArrayList.add(charArray[i]);
	        	}
	        }
        
	    for (char c : charArray) {
			System.out.println(c);
		}
        System.out.println("charArrayList : " + charArrayList);
        
        String a = "";
        for(int i = 0; i < charArrayList.size(); i++) {
        	a += Character.toString(charArrayList.get(i));
        	System.out.println(a);
        }
        answer = Integer.parseInt(a);
        return answer;
    }
    
}
