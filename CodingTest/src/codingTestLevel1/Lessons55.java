package codingTestLevel1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lessons55 {

	public static void main(String[] args) {
		
		Lessons55 lessons55 = new Lessons55();
		String dartResult = "10S#10D*10T";
		int result = lessons55.solution(dartResult);
		
		System.out.println("result : " + result);
	}
	
    	
    public int solution(String dartResult) {
    	
//    	다트 게임은 총 3번의 기회로 구성된다.
//    	각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
//    	점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
//    	옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
//    	스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
//    	스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
//    	스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
//    	Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
//    	스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
//    	0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.
    	
    	Pattern p1 = Pattern.compile("([SDT])+");	
    	Pattern p2 = Pattern.compile("([*#])+");	
    	
    	Matcher m1 = p1.matcher(dartResult);			
    	Matcher m2 = p2.matcher(dartResult);			

    	String ground = "";
    	String award = "";
    	
    	while (m1.find()) {
    		ground += m1.group();
    	}
    	while (m2.find()) {
    		award += m2.group();
    	}
    	
    	dartResult = dartResult.replace("10","k");
    	char[] charArr = dartResult.toCharArray();
    	int answer = 0;
    	int cnt = 0;
    	int cnt2 = 0;
    	int tenorNot = 0;
    	int before = 0;
    	int [] answerarr = new int[3];
    	
    	for(int i = 0; i < charArr.length; i++) {
    		
    		String is = charArr[i] + "";
    		
    		if(is.equals("k")) {
    			tenorNot = 1;
    		}
    		
    		System.out.println("is : " + is);
    		if(ground.contains(is)) {
    			
    			if(tenorNot == 0) {
    				before = Integer.valueOf(charArr[i-1] + "");
    			} else {
    				before = 10;
    				tenorNot = 0;
    			}
    			if(is.equals("S")) {
    				
    				System.out.println("Before : " + before);
    				answerarr[cnt] += (int)Math.pow(before, 1);
    				before = 0;
    				cnt++;
    				
    			} else if(is.equals("D")) {
    				
    				System.out.println("Before : " + before);
    				answerarr[cnt] += (int)Math.pow(before, 2);
    				before = 0;
    				cnt++;
    				
    			} else if(is.equals("T")) {
    				
    				System.out.println("Before : " + before);
    				answerarr[cnt] += (int)Math.pow(before, 3);
    				before = 0;
    				cnt++;
    				
    			}
    			
    		} else if(award.contains(is)) {
    			if(is.equals("*")) {
    				if(cnt == 1) {
    					answerarr[cnt-1] *= (2);
    					cnt2++;
    				} else  {
    					if(cnt2 == 0) {
    						answerarr[cnt-1] *= (2);
    						answerarr[cnt-2] *= (2);
    						cnt2++;
    					} else if(cnt2 == 1)  {
    						answerarr[cnt-1] *= (2);
    						answerarr[cnt-2] *= (2);
    						cnt2++;
    					}
    				}
    			}else if(is.equals("#")) {
					if(cnt2 == 0) {
						answerarr[cnt-1] *= -1;
					} else {
						answerarr[cnt-1] *= -2;
					}
    			}
    		}
    		
    	}
    	
    	for (int i : answerarr) {
			System.out.println("array : " + i);
			answer += i;
			
		}
    	
    	System.out.println("calculationFormula : " + answer);
        return answer;
    }
}

    	
